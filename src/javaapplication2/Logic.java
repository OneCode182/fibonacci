
package javaapplication2;

/**
 *
 * @author Sergio Silva
 */
public class Logic {
    
    public boolean esPrimo(int numero) {
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0) {
                return false;
                
            }
            
        }
        
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
            
        }
        
        return true;
        
    }
    
    
    
}
