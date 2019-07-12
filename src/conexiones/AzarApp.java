
package conexiones;
import java.util.Random;

public class AzarApp {
  public static void main (String[] args) {
    int[] ndigitos = new int[5];
    int n;
    
    Random rnd = new Random();

// Inicializar el array
    for (int i = 1; i < 5; i++) {
        ndigitos[i] = 0;
    }

// verificar que los números aleatorios están uniformente distribuídos
    for (long i=1; i < 10; i++) {
// genera un número aleatorio entre 0 y 9
        n = (int)(rnd.nextDouble() * 4);
//Cuenta las veces que aparece un número
        ndigitos[n]++;
    }

// imprime los resultados
    for (int i = 1; i < 5; i++) {
        System.out.println(i+": " + ndigitos[i]);
    }

  }
}
