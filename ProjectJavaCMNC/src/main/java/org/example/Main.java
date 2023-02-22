package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hello world!");
        System.out.println("Carlos Mauricio Norberto Cardenas");
        int mientero = 10;
        float mipuntoflotante = 0.5f;
        double midecimal =22.5;
        String miTexto = "Hola soy un texto de java";
        char nicaraterv = 'a';


        Scanner miscanner = new Scanner(System.in);

        int numero;
        numero = miscanner.nextInt();

        System.out.println("Mi numero que acabo de ingresar es: " + numero);*/

       // int numero = 0;

        //Desarrollar un programa en java que lea 2 numeros, los sume y me muestre el resultado

       /* System.out.println("ingresa dos numeros y haz la suma");

        int numero;
        int numeros;
        int suma;

        Scanner miscanner = new Scanner(System.in);
        numero = miscanner.nextInt();
        numeros = miscanner.nextInt();
        suma = numero + numeros;


        System.out.println("Mi numero que acabo de ingresar es: " + suma);*/

        /*Desarrollar un programa que le pida al usuario su nombre, su fecha de nacimineto, su edad, su peso y su altura
                y que calcule imc y al final que muestre una ficha completa de todos sus datos.
                peso / altura^2
                */

        Scanner scanner1 = new Scanner(System.in);
        String nom;
        String fechaNacimiento;
        int edad;
        double peso;
        double altura;
        double imc;

        System.out.println("Ingresa tu nombre:");
        nom = scanner1.nextLine();
        System.out.println("Ingresa tu fecha de nacimiento:");
        fechaNacimiento = scanner1.nextLine();
        System.out.println("Ingresa tu edad:");
        edad = scanner1.nextInt();
        System.out.println("Ingresa tu peso:");
        peso = scanner1.nextDouble();
        System.out.println("Ingresa tu altura:");
        altura = scanner1.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("tu nombre es: " + nom );
        System.out.println("tu nacimiento " + fechaNacimiento);
        System.out.println("tu edad " + edad);
        System.out.println("tu peso: " + peso);
        System.out.println("tu altura " + altura);
        System.out.println("tu IMC " + imc);










    }
}