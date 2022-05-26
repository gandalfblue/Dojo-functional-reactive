package co.com.sk.exercise_1;

import reactor.core.publisher.Flux;

import java.util.List;
import java.util.logging.Logger;


/**
 * Exercise 2 class
 *
 * @author dannielf - gandalfblue - duvis07 - jeyson-pereira
 * @version 0.0.1
 * @since 0.0.1
 */
public class Exercise {

    private static final Logger log = Logger.getLogger("");

    /**
     * Print only unique emails
     *
     * @param list List<Email>
     */
    private static void printDistint(List<Email> list) {
        Flux.fromIterable(list)
                .distinct(Email::nombre)
                .subscribe(email -> log.info(email.toString()));
    }

    /**
     * Filter and count emails by domain
     *
     * @param list   List<Email>
     * @param domain String
     */
    private static void filterAndCountByDomain(List<Email> list, String domain) {

        Flux.fromIterable(list)
                .filter(dominio -> dominio.dominio().contains(domain.toLowerCase()))
                .count()
                .subscribe(ele -> log.info("Cantidad de correos " + domain + " son: " + ele));

    }

    /**
     * Email's domain are correct
     *
     * @param list List<Email>
     */
    private static void emailDomainsAreCorrect(List<Email> list) {
        Flux.fromIterable(list)
                .map(email -> {
                    var regex = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
                    return email.dominio().matches(regex) ? email : "";
                })
                .subscribe(ele -> log.info(ele.toString()));
    }

    /**
     * Email is sent
     *
     * @param list List<Email>
     */
    private static void emailIsSent(List<Email> list) {
        Flux.fromIterable(list)
                .filter(Email::send)
                .subscribe(ele -> log.info(ele.toString()));
    }

    public static void main(String[] args) {


        List<Email> correo = List.of(new Email(1, "Andres", "andres@gmail.com", true),
                new Email(2, "Wyndham", "Wyndham@gmail.com", true),
                new Email(3, "Lynett", "Lynett@gmail.com", true),
                new Email(4, "Inger", "Inger@hotmail.com", true),
                new Email(5, "Barny", "Barny@hotmail.com", false),
                new Email(6, "Emmaline", "Emmaline@hotmail.com", false),
                new Email(7, "Evie", "Evie@hotmail.com", false),
                new Email(8, "Penni", "Penni@outlook.com", false),
                new Email(9, "Cris", "Cris@outlook.com", false),
                new Email(10, "Barnett", "Barnett@outlook.com", true),
                new Email(11, "Barnett", "Barnett@outlook.com", true),
                new Email(12, "Barney", "Barnettoutlookcom", true));


        printDistint(correo);

        filterAndCountByDomain(correo, "hotmail");

        filterAndCountByDomain(correo, "gmail");

        filterAndCountByDomain(correo, "outlook");

        emailDomainsAreCorrect(correo);

        emailIsSent(correo);
    }
}

