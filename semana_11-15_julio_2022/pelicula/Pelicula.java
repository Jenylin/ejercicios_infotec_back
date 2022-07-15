package pelicula;

/*
 * Crear una clase llamada Pelicula con las siguientes características:
 *   • Sus atributos son titulo, duración, estatus, genero y director.
 *   • Por defecto, la duración es de 2 horas  y estatus es false.
 *   • Los constructores que se implementaran serán:
 *       ◦ Un constructor por defecto.
 *       ◦ Un constructor con el titulo y director. 
 *       ◦ Un constructor con todos los atributos, excepto de estatus.
 *   • Los métodos que se implementara serán:
 *       ◦ Métodos get de todos los atributos, excepto de estatus.
 *       ◦ Métodos set de todos los atributos, excepto de estatus.
 *       ◦ Sobrescribe los métodos toString.
 */


public class Pelicula {
    
    private String titulo;
    private Double duracion;
    private Boolean estatus;
    private String genero;
    private String director;

    public Pelicula() {}

    public Pelicula(String titulo, String director){
        this.titulo = titulo;
        this.director = director;
    }

    public Pelicula(String titulo, Double duracion, String genero, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.director = director;
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

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }





}
