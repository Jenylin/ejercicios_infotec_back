package pelicula;

    /*
     * Implementa los anteriores métodos en las clases Videojuego y Pelicula. Ahora en tu método main realiza lo siguiente:
     * • Crea dos arrays, uno de Peliculas y otro de Videojuegos, de 5 posiciones cada uno.
     * • Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
     * • Activa algunos Videojuegos y Peliculas con el método activar().
     * • Cuenta cuantas Películas y Videojuegos hay activados. Al contarlos, devuelve los elementos inactivos.
     * • Por último, indica el Videojuego con la mayor duración y la película que sean del género de terror y tenga mayor duración. Muestralos en pantalla con toda su información (usa el método toString()).
     */

public class Main {
    
    public static void main(String[] args) {
        
        Pelicula pelis[]=new Pelicula[5];

        pelis[0] = new Pelicula();
        pelis[1] = new Pelicula("Harry Potter 1", "Chris Columbus");
        pelis[2] = new Pelicula("Harry Potter 3", "Alfonso Cuaron");
        pelis[3] = new Pelicula("Forrest Gump", 2.3 , "Comedia", "Robert Zemeckis");
        pelis[4] = new Pelicula("Titanic", 3.1 , "Terror", "James Cameron");

        Videojuego videos[]=new Videojuego[5];

        videos[0] = new Videojuego();
        videos[1] = new Videojuego("Grand Theft Auto", 32.1);
        videos[3] = new Videojuego(); 
        videos[4] = new Videojuego("Among Us", 0.1, "party", "InnerSloth"); 
        videos[2] = new Videojuego("Fortnite", 0.5);


    }
}
