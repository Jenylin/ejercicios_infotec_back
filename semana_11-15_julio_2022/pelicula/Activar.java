package pelicula;

    /*
     * Crear una interfaz llamada Activar con los siguientes métodos:
     * • activar(): cambia el atributo estatus a true.
     * • desactivar(): cambia el atributo estatus a false.
     * • isActivo(): devuelve el estado del atributo estatus;.
     * • Método compareTo (Object a), compara duración de los videojuegos y las películas. Como parámetro que tenga un objeto.
     */

public interface Activar {

    public static activar() {
        estatus = true;
    }

    public static desactivar() {
        estatus = false;
    }

    public default Boolean isActivo() {
        return this.estatus;
    }

    public compareTo(Object a) {
        a.duracion;
    }

}
