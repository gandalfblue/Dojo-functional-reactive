package co.com.sk.exercise_2;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
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

    public static void main(String[] args) {

        List<String> badWords = List.of("hp", "marica", "pendejo", "bobo", "mierda", "malparido", "gonorrea", "estupido", "sapo");
        Scanner sc = new Scanner(System.in);

        log.info("Introduce un texto, luego da enter");
        String wordsList = sc.nextLine();
        var newWordList = Arrays.stream(wordsList.split(" ")).toList();

        Flux.fromIterable(newWordList).map(a -> {
            if (badWords.contains(a)) {
                a = "****";
            }
            return a;
        }).subscribe(log::info);
    }
}
