
package Mayor;

public class Analisis {
    public static double QuienEsMayor(double vector[]){
        
        double mayor = vector[0];
    for (int i = 1; i < vector.length; i++) {
        if (vector[i] > mayor) {
            mayor = vector[i];
        }
    }
    return mayor;
    }
    
}
