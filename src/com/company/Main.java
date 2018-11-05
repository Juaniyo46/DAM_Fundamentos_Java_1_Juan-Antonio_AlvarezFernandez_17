package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá una fecha y el programa comprobará si es correcta o no");

        //Declaramos las variables de la fecha y las pedimos por consola.
        System.out.println("Introduzca el día del mes en el rango de 1 a 30");
        int dia = sc.nextInt();
        System.out.println("Introduzca el mes (en número) del año");
        int mes=sc.nextInt();
        System.out.println("Introduzca el año");
        int año =sc.nextInt();

        //Se realizan las validaciones y se informa al usuario
        if (dia>0&&dia<=30){
            if (mes>0&&mes<=12) {
                if (año!=0) {
                    System.out.println("Fecha correcta");
                }else System.out.println("El año introducido no es correcto, introduzca un valor mayor que 0");

            }else System.out.println("El mes introducido no es correcto, introduzca un valor entre 1 y 12");
        } else System.out.println("El dia introducido no es correcto, introduzca un valor entre 1 y 30");

        if (dia > 0 && dia <30)
            dia = dia +1;
        else if (dia == 30) {
            mes = mes + 1;
            dia = 1;
            if (mes>12) {
                año = año + 1;
                mes = 1;
            }
        }

        System.out.println("La fecha del día siguiente es: " + dia +" / "+ mes + " / " + año);


    }

}