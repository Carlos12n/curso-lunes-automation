package com.canavarro.clase3;

import java.util.Scanner;

public class P6Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("Ingrese un double: ");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese un entero: ");
        int dia_semana = scanner.nextInt();

        System.out.println("Cadena ingresada: "+cadena);
        System.out.println("Precio ingresado: "+precio);
        System.out.println("Dia de la semana ingresado: "+dia_semana);

        scanner.close();
    }
}