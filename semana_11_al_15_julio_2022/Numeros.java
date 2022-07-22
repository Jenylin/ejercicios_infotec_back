import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Numeros {
    
    /*
     * Realiza un programa que solicite números al usuario y cuando el usuario ingrese un -1 se terminará el programa.
     * Al terminar el programa, mostrará lo siguiente en consola:
     *  – mayor número introducido
     *  – menor número introducido
     *  – suma de todos los numeros
     *  – suma de los numeros positivos
     *  – suma de los numeros negativos
     *  – lista de todos los números primos de los numeros negativos
     *  Obs: El número -1 no contara como número.
     */



    static Integer numDivisores;
    public static Boolean esPrimo(Integer p) {
        numDivisores = 0;
        for (int i = p; i > 0 ; i--) {
            if (p % i == 0){
                numDivisores += 1;
            }
        }
        if (numDivisores > 2 ){
          return false;
        }else{
            return true;
        }
    }
    
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> miLista = new ArrayList<Integer>();
        Integer n;
        do{
            System.out.print("Por favor, introduce un número distinto de -1 : ");
            String num = in.nextLine();
            n = Integer.parseInt(num);
            miLista.add(n);
        }while(n != -1);

        Collections.sort(miLista);
        System.out.println("El menor número introducido fue: " + miLista.get(0));
        System.out.println("El mayor número introducido fue: " + miLista.get(miLista.size()-1));
        Integer sumaTotal = 0;
        Integer sumaPositivos = 0;
        Integer sumaNegativos = 0;
        for (int i = 0; i < miLista.size(); i++) {
            sumaTotal += miLista.get(i);
        }
        System.out.println("La suma de todos los números introducidos es: " + sumaTotal);

        for (int i = 0; i < miLista.size(); i++) {
            if(miLista.get(i) > 0){
                sumaPositivos += miLista.get(i);
            }
        }
        System.out.println("La suma de todos los números positivos introducidos es: " + sumaPositivos);

        for (int i = 0; i < miLista.size(); i++) {
            if(miLista.get(i) < 0){
                sumaNegativos += miLista.get(i);
            }
        }
        System.out.println("La suma de todos los números negativos introducidos es: " + sumaNegativos);
        
        System.out.println("La lista de todos los primos negativos introducidos es:");
        for (int i = 0; i < miLista.size(); i++) {
            if (miLista.get(i) < 0 && esPrimo(-miLista.get(i))==true && miLista.get(i) != -1) {
                System.out.print(miLista.get(i) + ", ");
            }
        }
        System.out.println(" ");

        

    }
}
