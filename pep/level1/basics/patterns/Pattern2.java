import java.util.Scanner;
/**
*	*	*	*	*
*	*	*	*
*	*	*
*	*
*
**/
public class Pattern2 {

   public static void main(String [] args) {

          int n = 0;
          Scanner s = new Scanner(System.in);
          System.out.println("Enter n:");
          if(s.hasNext())
          n = s.nextInt();

          for(int i = n; i > 0; i--) {
                for(int j = i ; j > 0; j--) {
                   System.out.print("*" + "\t");
                }
               System.out.println();
            }

   }
}