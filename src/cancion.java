public class cancion {
    //atributos
    static String nombre;
    String album;
    String cantante;
    Double duracion;
    int reproducciones;

    //metodos
    //constructor
    public cancion(String nombre, String album, String cantante, Double duracion, int reproducciones) {
        this.nombre = nombre;
        this.cantante = cantante;
        this.album = album;
        this.duracion = duracion;
        this.reproducciones = reproducciones;
    }

    //getters

    public int getReproducciones() {
        return reproducciones;
    }

    public Double getDuracion() {
        return duracion;
    }

    public String getCantante() {
        return cantante;
    }

    public String getAlbum() {
        return album;
    }

    public static String getNombre() {
        return nombre;
    }

    //setter


    public static void setNombre(String nombre) {
        cancion.nombre = nombre;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public void imprimirCanciones() {
        System.out.println("El nombre es:" + this);
        System.out.println("EL cantante es: " + this.cantante);
        System.out.println("El album es: " + this.album);
        System.out.println("El numero de reproduciones es: " + this.reproducciones);
        System.out.println("El duracion es: " + this.duracion);
        System.out.println("---------------------");

    }
}


