
/*
@author angelalvarado
Luis Angel Alvarado Hernandez
*Ejercicio para obtener π mediante iteraciones de la forma: 
π = 4 * (1 - (1/3) + (1/5) - (1/7) ...)
*/

package calculatepi;
import java.util.Scanner;


public class CalculatePi {
    
    public static void main(String[] args) {
        Pi NumPi = new Pi();
        NumPi.GetNumberIte();
        double π = NumPi.CalculatePi();
        System.out.println("Pi es :" + Double.toString(π));
    }
}

class Pi
{
    private long n_iter;
    private double pi;
    private double num;
    private double inc;
    private boolean band;
    
    public Pi()
    {
        this.n_iter = 0;
        this.num = 1.0000000000;
        this.pi = 0;
        this.inc = 1.0000000000;
        this.band = false;
    }
    
    public double CalculatePi()
    {
        for (int i = 0; i < n_iter; i ++)
        {
            if (!band)
            {
                pi += num / inc;
                band = true;
            }
            else
            {
                pi -= num / inc;
                band = false;
            }
            inc += 2.000000000;
        }
        return pi * 4.00000000;
    }
    
    public void GetNumberIte()
    {
        System.out.println("¿Cuantas interaciones desea realizar?");
        Scanner scan = new Scanner(System.in);
        n_iter = scan.nextInt();
    }
}
