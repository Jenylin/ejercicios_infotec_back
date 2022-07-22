import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Main
 */
public class Main {

    // Operador ::
    // https://www.geeksforgeeks.org/double-colon-operator-in-java/

    // Función para remover los duplicados de una lista
    public static List<String> removerDuplicados(List<String> list){
        // Crear una nueva lista
        List<String> nuevaLista = new ArrayList<String>();  
        // Recorrer la primera lista
        for (String element : list) {
            // Si este elemento no está en nuevaLista entonces agregarlo.
            if (!nuevaLista.contains(element)) {
                nuevaLista.add(element);
            }
        }
        // regresar la nueva lista
        return nuevaLista;
    }


    public static void main(String[] args) {
        
        /* 1. Crea un programa que genere 5 números enteros aleatorios entre 1 y 1000,
        * estos 5 números debes agregarlos a una lista de tipo Integer. 
        */
        List<Integer> miLista = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            miLista.add((int)(Math.floor(Math.random()*1000)));
        }
        System.out.println(miLista);

        /* 2. Utiliza la librería "Collections" para ordenar la de forma ascendente
        * e imprime el resultado en consola. */
        Collections.sort(miLista);
        System.out.println(miLista);

        /* 3. Utiliza la librería "Collections" invierte el ordenamiento de la lista
        * e imprime el resultado en consola. */
        Collections.sort(miLista, Collections.reverseOrder());
        System.out.println(miLista);

        /*
         * Combinación de listas
         *  1. Crea dos listas que tengan los siguientes elementos
         *   listaUno = A, B, C, D, E
         *   istaDos = B, D, F, G, H
         */

        List<String> listaUno = new ArrayList<String>();
        listaUno.add("A");
        listaUno.add("B");
        listaUno.add("C");
        listaUno.add("D");
        listaUno.add("E");

        List<String> listaDos = new ArrayList<String>();
        listaDos.add("B");
        listaDos.add("D");
        listaDos.add("F");
        listaDos.add("G");
        listaDos.add("H");

        /*
         * Crea una tercer lista llamada listaMezcla en donde realices la combinación
         * de la listaUno y la listaDos cuidando que no se agreguen valores repetidos,
         * obteniendo como resultado la siguiente lista {A,B,C,D,E,F,G,H}
         */

        List<String> listaMezclaCero = Stream.concat(listaUno.stream(), listaDos.stream()).toList();
        List<String> listaMezclaNueva = new ArrayList <String> (listaMezclaCero);
        Collections.sort(listaMezclaNueva);
        List<String> listaMezcla = removerDuplicados(listaMezclaNueva);
        System.out.println(listaMezcla);

        
    }
}