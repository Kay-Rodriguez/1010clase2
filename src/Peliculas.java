public class Peliculas {
    String titulo;
    String genero;
    String director;
    int duracion;
    int anioLanzamiento;

    public Peliculas(final String titulo, final String genero, final String director, final int duracion, final int anioLanzamiento) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.duracion = duracion;
        this.anioLanzamiento = anioLanzamiento;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }
    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    public void imprimirPelicula() {
        System.out.println("Película: " + titulo + ", Género: " + genero + ", Director: " + director + ", Duración: " + duracion +" min, Año: " + anioLanzamiento);
    }


}














