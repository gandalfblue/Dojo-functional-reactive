package co.com.sk.exercise_3;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.logging.Logger;

/**
 * Exercise 3 class
 *
 * @author dannielf - gandalfblue - duvis07 - jeyson-pereira
 * @version 0.0.1
 * @since 0.0.1
 */
public class Exercise {

    private static final Logger log = Logger.getLogger("");

    public static void main(String[] args) {

        Scanner valueUser = new Scanner(System.in);
        log.info("Ingrese un Double como valor A");
        var numberA = valueUser.nextDouble();
        log.info("Ingrese un Double como valor B");
        var numberb = valueUser.nextDouble();

        BiFunction<Double, Double, Double> derivar = Math::pow;

        log.info("Resultado es: " + derivar.apply(numberA, numberb));
    }
}
