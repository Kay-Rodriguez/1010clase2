public class libro {

//atributos
    String titulo;
    String autor;
    String ediorial;
    int paginas;

    //metodos
    //constructor
    public libro(String titulo, String autor, String ediorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ediorial = ediorial;
        this.paginas = paginas;
    }
    public void imprimir() {
        System.out.println("El titulo es: "+this.titulo);
        System.out.println("EL autor es: "+this.autor);
        System.out.println("la editorial es: "+this.ediorial);
        System.out.println("El numero de paginas es: "+this.paginas);
        System.out.println("---------------------");
    }
    public int imprimircubierta() {
        return this.paginas+5;

    }
}
