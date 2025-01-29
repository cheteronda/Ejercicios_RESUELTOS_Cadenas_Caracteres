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
public class Obtencion_de_subcadenas {
    public static void main(String[] args) {
        
       /**
        * Vamos ahora  a seguir practicando con los métodos length y charAt, así como con substring.
        * Escribe un programa que solicite por teclado un nombre compuesto por dos palabras separadas por un espacio. 
        * La cadena que se debe leer debe contener un único espacio, ninguno más, y no puede ser ni el primer ni el último carácter. 
        * El resto de caracteres deben ser letras minúsculas.
        * 
        * Condiciones:
        * · El primero y el ultimo solo pueden ser letras minúsculas.
        * · El resto pueden ser letras minúsculas o un espacio en blanco.
        * · Solo puede haber un espacio en blanco.
        */ 
       
        
        //Variables de entrada
        String nombre;
        
        //Variables de salida
        String primeraPalabra, segundaPalabra;
        
        //variables auxiliares
        int espacios, posicionEspacio = 0;
        boolean nombreValido;
        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);

        //Entrada de datos
        do {
            System.out.println("Introduce un nombre formado por dos palabras en minúscula separadas por un espacio: ");
            nombre = teclado.nextLine();
            espacios = 0;
            nombreValido = nombre.length() > 0 && nombre.charAt(0) >= 'a' && nombre.charAt(0) <= 'z' && nombre.charAt(nombre.length() -1) >= 'a' 
                    && nombre.charAt(nombre.length() -1) <= 'z';
            //Comprobamos si el nombre es valido
            if (nombreValido) {
                //Recorremos con un bucle for todas las letras interiores
                for (int i = 1; i < nombre.length()-2 && nombreValido; i++) {
                    nombreValido = nombre.charAt(i) >= 'a' && nombre.charAt(i) <= 'z' || nombre.charAt(i) == ' ';
                    //Comprobamos dentro del bucle for si hay un espacio en blanco.
                    if (nombre.charAt(i) == ' ') {
                        posicionEspacio = i;
                        //si hay espacio en blanco, aumentamos +1 la variable espacio
                        espacios++;
                    }    
                    nombreValido = nombreValido & espacios <=1; //Si hay más de un espacio en blanco, la cadena no es válida.
                }
                nombreValido = nombreValido & espacios == 1; //La cadena es valida solo si hay un espacio
            }
            
        } while (!nombreValido);
        System.out.printf("Nombre introducido: %s", nombre );
        
        //Procesamiento
        //Almacenamos en las variables primera palabra y el objeto hace llamada a subString. La segunda palabra empieza a contar desde el siguiente caracter a el espacio en blanco
        primeraPalabra = nombre.substring(0, posicionEspacio);
        segundaPalabra = nombre.substring(posicionEspacio+1);
        
        //Salida de resultados
        System.out.printf ("La primera palabra es \"%s\" y la última \"%s\"", primeraPalabra, segundaPalabra);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
