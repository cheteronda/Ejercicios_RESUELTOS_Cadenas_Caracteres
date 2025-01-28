
package ejemplos_cadenas_de_caracteres;

/**
 *
 * @author Alfonso
 */
public class Ejemplos_Cadenas_de_Caracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad1 = "Bien";
        String cad2 = "venido";
        String cadResultado = cad1+cad2;
        System.out.println("Cadena de texto: " + cadResultado);
        
        System.out.println("Bien"+"Venido");
        
        String cadResultadoConcat = cad1.concat(cad2);
        System.out.println(cadResultadoConcat);
        
        
        
        //La variable numero, de tipo int, contiene el número 123.
        //Al tratarse de un tipo primitivo y no referencia, si "contiene" el número y no "apunta" a una zona de memoria que contiene el número
        int numero = 123;
        //La variable cadena contendrá el texto "Número: 123"
        //Llevándose a cabo una conversión a texto del contenido de la variable numero.
        
        String cadena = "Número: " + numero;
        
        //Se mostrará por pantalla el texto "Número: 123"
        System.out.println(cadena);
        
        System.out.println(4+1 + "-" + 4+1);
        
        
        //Según esta cadena, para saber la longitud de la cadena, usamos el método length, 
        //Para ello, creamos una nueva variable que nos devuelva el resultado de aplicar el método length.
        
        
        String cad = "Hola_Caracola";
        //            0123456789101112
             
        int longitudCadena = cad.length();
        System.out.println("La longitud de " + cad + " en caracteres es: " + longitudCadena);
        
        //Uso del método charAt(int pos). Devuelve el caracter ubicado en la posición pasada por parámetro
        char t = cad.charAt(12-1);
        System.out.println(t);
        
        
        //Uso del método substring(int,int). Este método permite extraer una subcadena de texto
        //de una cadena de mayor tamaño.
        
        System.out.println("Creamos una cadena de la cadena principal, empezando en la posición 0 y terminando en la posición 7");
        String subcadena = "Subcadena inicial: " + cad.substring(0, 8);
        System.out.println(subcadena);
        
        System.out.println("\nCreamos una nueva subcadena de la cadena principal \"Hola_Caracola\" a partir de la posición 8,\n" +
        "Como vamos a sacar toda la cadena, no es necesario indicar el final de la cadena con parámetros, así evitamos\n" +
        "errores de indicar un valor superior a la longitud de la cadena.");
        
        String subcadenaFinal = cad.substring(8);
        System.out.println("Subcadena final: " + subcadenaFinal);

        System.out.println("\nJuntamos en una variable las 2 cadenas y la printamos");
        String cadenasJuntas = subcadena+subcadenaFinal;
        System.out.println(cadenasJuntas);
        
        
        
        
        
        
        
        
        
    }
    
}
