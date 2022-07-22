import java.util.Scanner;

/*
 * Realiza un programa que pinte en consola un triángulo completo y un triángulo hueco,
 * dada la altura de la figura solicita al usuario.
 */

public class Triangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Por favor, introduce la altura de la figura: ");
        String num = in.nextLine();
        Integer n = Integer.parseInt(num);
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            n--;
            System.out.println('\n');
        }

        Integer m = Integer.parseInt(num);
        Integer m2 = Integer.parseInt(num);
        Boolean ya = false;
        Boolean xb = false;
        for (int i = m; i > 0; i--) {
            for (int j = 0; j < m; j++) {
                if(xb == false){
                    System.out.print('*');
                }
                if(j >= 1 && m < m2){
                    xb = true;
                }
                if(ya == false){        
                    if(i < m2 && i > 1){
                            for (int k = 1; k < m-1; k++) {
                                System.out.print(" ");                
                            }
                            ya = true;
                        }
                }
            }   
            m--;
            System.out.println('\n');
            ya = false;
            xb = false;
        }
        
    }
}
