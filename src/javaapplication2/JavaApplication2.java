


package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Sergio Silva
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         *  Paso 1. Ingreso de valores. 
         *  Reemplace los guiones bajos con las palabras correspondientes de tal manera que no
         *  existan errores.
         */
        
        Scanner teclado = new Scanner(System.in);
        Logic logic = new Logic();
        
        System.out.println( "Ingrese el número de términos a generar" );
        int nro = teclado.nextInt();
        
        
        //Paso 2. Variables para generar números primos
        var genNum = 2;
        boolean esPrimo;
        
        //Paso 3. Variables para el trabajo con Fibonacci
        int fibo = 0;
        var primero = 0; //Valor incial
        var segundo = Math.pow(3, 3); //Valor inicial
        
        //Paso 4. Variables para el signo. Uno de los valores inciales tiene un error.
        var signo = 1;
        var contSignos = 0;
        var cambiaSigno = 1;
        
        //Paso 5. Otras variables
        var cont = 0;
        var suma = 0.0;
        var esPotenciaNumerador = false; //Valor inicial
        
        //Generación de términos
        while( cont < nro ) {
            /**
             * Primos
             */
            
            genNum = 2; //Agregar código
            
            //Agregar código para verificar si genNum es primo.
            esPrimo = logic.esPrimo(genNum);//Agregar código
            
            
            if(esPrimo) {
                //Fibonacci. Generar un valor para fibo y cambiar los valores de primero y s
                
                //Si la potencia va en el numerador
                if(esPotenciaNumerador) {
                    System.out.printf("%d(%d/%d^%d)\n", 
                        signo, //Agregar variable para mostrar el signo
                        0, //Agregar variable
                        0, //Agregar variable
                        Math.abs(fibo-genNum)
                    );
                    
                    //Sumar el término generado
                    suma++;//Agregar código
                    
                 } else { //Si la potencia va en el denominador
                    System.out.printf("%d(%d^%d/%d)\n", 
                        signo, //Agregar variable para mostrar el signo
                        0, //Agregar variable
                        0, //Agregar variable
                        Math.abs(fibo-genNum)
                    );
                    
                    //Sumar el término generado
                    suma = 0; //Agregar código
                }
                
                //Cambiar la posición de la potencia
                esPotenciaNumerador = !esPotenciaNumerador;
                
                //Incremento de los contadores
                cont++;//Agregar código
                contSignos++;//Agregar código
                
                if(contSignos == cambiaSigno) {
                    signo = 0;//Agregar código
                    contSignos = 0;//Agregar código
                    cambiaSigno = 0;//Agregar código
                }
                
            }
        }
        
        //Imprimir el resultado
        System.out.printf("Suma = %.2f\n\n", suma);
        
        //Información general - Por favor NO borrar. Si no incluye este código y su salida, se calificará sobre el 25% de la nota
        System.getProperties().forEach((k, v) -> System.out.printf("%s: %s\n", k, v));
        
        
    }
    
}
