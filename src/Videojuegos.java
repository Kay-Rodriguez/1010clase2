public class Videojuegos {
    String nombre;
    String genero;
    int año;
    String desarrollador;

    public Videojuegos(String nombre, String genero, int año, String desarrollador) {
        this.nombre = nombre;
        this.genero = genero;
        this.año = año;
        this.desarrollador = desarrollador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }
}

