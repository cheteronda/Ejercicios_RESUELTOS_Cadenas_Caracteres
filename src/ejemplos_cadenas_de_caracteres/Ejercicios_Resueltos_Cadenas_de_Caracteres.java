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

//        /**
//         * Escribe un programa que solicite por teclado un nombre cuya longitud debe ser 
//         * como mínimo de una letra y como máximo de diez. 
//         * Si el nombre introducido no cumple esos criterios, 
//         * debe mostrarse un mensaje de error y volver a solicitarse hasta 
//         * que en efecto se cumpla esa regla.
//         */
//        
//        //Variables de entrada
//        boolean nombreInvalido = false;
//        String nombre;
//        
//        // Clase Scanner para petición de datos de entrada
//        Scanner teclado= new Scanner (System.in);
//        
//        do {
//            System.out.print("Introduce el nombre (máximo 10 caracteres y mínimo uno) \n");
//            nombre = teclado.nextLine();
//            
//            //Comprobamos si cumple los requisitos
//            nombreInvalido = nombre.length()>10 || nombre.length()<1;
//            if (nombreInvalido) {
//                System.out.println("El nombre debe tener como mínimo un caracter y como máximo diez caracteres");
//            }
//        } while (nombreInvalido); //Seguimos solicitando mientras no sea valido
//        
//        System.out.println("El nombre introducido es: " + nombre);
//        
//        System.out.println("La longitud del nombre introducido es: " + nombre.length() + " caracteres");
//        
//        
        /**
         * VALIDAR QUE EMPIEZE POR MAYUSCULA DE LA A LA Z SIN LA Ñ.
         *
         */
        boolean nombreValido = true;
        String nombre;
        Scanner teclado = new Scanner(System.in);

//Iniciamos el bucle do while para asegurarnos que al menos una vez entra en la comprobación.
        do {
            System.out.print("Introduzca el nombre (Máximo 10 caracteres y mínimo 1 caracter).\n");
            //almacenamos en la variable teclado lo introducido por teclado
            nombre = teclado.nextLine();

            //almacenamos en la variable nombreValido estas condiciones. Entre 1 y 10 caracteres. Empieze por mayúscula y el resto minúscula
//            nombreValido = nombre.length()>=1 && nombre.length()<=10 && nombre.charAt(0)>= 'A' && nombre.charAt(0)<= 'Z';
            //Otra forma de comprobación más completa
            nombreValido = nombre.length() >= 1 && nombre.length() <= 10 && Character.isUpperCase(nombre.charAt(0));

            if (!nombreValido) { //Si el nombreValido pasa a False. Avisamos el error.
                System.out.println("El nombre debe tener como mínimo un carácter y como máximo 10. Debe comenzar por letra mayúscula y el resto de letras deben ser minúsculas.");
            } else { //Si se supera la prueba del primer carácter en mayúscula pasamos a comprobar el resto. 

                //Utilizamos un blucle for para que recorra todas las letras
                for (int indice = 1; indice < nombre.length() && nombreValido; indice++) {
//                    nombreValido = nombre.charAt(indice)>= 'a' && nombre.charAt(indice) <= 'z';

                    //Hacemos una nueva comprobación con el método estático Character.
                    nombreValido = Character.isLowerCase(nombre.charAt(indice));
                }
                if (!nombreValido) {
                    System.out.println("El nombre debe tener como mínimo un caracter y como máximo diez, debe comenzar por una mayúscula y el resto deben ser minúsculas.");
                }
            }
        } while (!nombreValido); //Segimos solicitando mientras el nombre no sea valido

        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("El nombre introducido tiene: " + nombre.length() + " carácteres");

    }

}
