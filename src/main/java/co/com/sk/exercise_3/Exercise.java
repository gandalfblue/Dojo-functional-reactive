package co.com.sk.exercise_3;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise {

    private static final Logger log = Logger.getLogger("");

    //    public  static Double derivar(Double x, Double y){
//
//    }
    public static void main(String[] args) {

        Scanner valueUser = new Scanner(System.in);
        log.info("Ingrese un Double como valor A");
        var numberA = valueUser.nextDouble();
        log.info("Ingrese un Double como valor B");
        var numberb = valueUser.nextDouble();
    }
}
