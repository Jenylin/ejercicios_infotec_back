package pelicula;

/*
 * Crearemos una clase Videojuego con las siguientes características:
 *   • Sus atributos son titulo, duración, estatus, genero y compañia.
 *   • Por defecto, la duración será de 10 horas y estatus false.
 *   • Los constructores que se implementaran serán:
 *       ◦ Un constructor por defecto.
 *       ◦ Un constructor con el titulo y duración.
 *       ◦ Un constructor con todos los atributos, excepto de entregado.
 *   • Los métodos que se implementara serán:
 *       ◦ Métodos get de todos los atributos, excepto de estatus.
 *       ◦ Métodos set de todos los atributos, excepto de estatus.
 *       ◦ Sobrescribe los métodos toString.
 */


public class Videojuego {
  
    private String titulo;
    private Double duracion = 10.0;
    private Boolean estatus = false;
    private String genero;
    private String companhia;

    public Videojuego(){}

    public Videojuego(String titulo, Double duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }


    public Videojuego(String titulo, Double duracion, String genero, String companhia) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.companhia = companhia;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getDuracion() {
        return this.duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompanhia() {
        return this.companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }


}
