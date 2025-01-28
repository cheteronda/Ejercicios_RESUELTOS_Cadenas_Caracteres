/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos_cadenas_de_caracteres;

import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class Ejercicios_Resueltos_Cadenas_de_Caracteres {
    public static void main(String[] args) {
        
        /**
         * Escribe un programa que solicite por teclado un nombre cuya longitud debe ser 
         * como mínimo de una letra y como máximo de diez. 
         * Si el nombre introducido no cumple esos criterios, 
         * debe mostrarse un mensaje de error y volver a solicitarse hasta 
         * que en efecto se cumpla esa regla.
         */
        
        //Variables de entrada
        boolean nombreInvalido = false;
        String nombre;
        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        do {
            System.out.print("Introduce el nombre (máximo 10 caracteres y mínimo uno) \n");
            nombre = teclado.nextLine();
            
            //Comprobamos si cumple los requisitos
            nombreInvalido = nombre.length()>10 || nombre.length()<1;
            if (nombreInvalido) {
                System.out.println("El nombre debe tener como mínimo un caracter y como máximo diez caracteres");
            }
        } while (nombreInvalido); //Seguimos solicitando mientras no sea valido
        
        System.out.println("El nombre introducido es: " + nombre);
        
        System.out.println("La longitud del nombre introducido es: " + nombre.length() + " caracteres");
        
        
        
        
        System.out.println("\nOtra opción para hacerlo: Si el nombre es valido. (Entre 1 y 10), interesaría nombrar la \n" +
        "variable booleana al contrario: nombreValido.");
        
        boolean nombreValido = true;
        String nombre1;
        
        do {
            System.out.print("Introduce un nombre válido: (Entre 1 y 10 caracteres)\n");
            nombre1 = teclado.nextLine();
            
            //Comprobamos los requisitos
            nombreValido = nombre1.length()>=1 && nombre1.length()<=10;
            if (!nombreValido) {
                System.out.println("El nombre debe tener entre 1 y 10 caracteres");
            }
        } while (!nombreValido); //Seguimos solicitando mientras no sea válido
        
        System.out.println("El nombre introducido es: " + nombre1);
        
        System.out.println("La longitud del nombre introducido es: " + nombre1.length() + " caracteres");
    }
    
}
