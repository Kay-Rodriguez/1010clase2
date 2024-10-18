//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Hello and welcome!");
        System.out.println("los libro de la biblioteca son:");
        //para declaerar el objeto , para intanciar una clase
        libro libro1 = new libro("el resplandor", "stephen king", "de bolsillo", 600);
        libro libro2 = new libro("ciudades de papel", "John Green", "SA de CV", 368);
        libro libro3 = new libro("invisible", "Eloy Moreno", "Nube de Tinta", 304);
        libro libro4 = new libro("El Diario de Ana frank", "Ana Frank", "Casa del libro", 150);
        libro libro5 = new libro("La sombra del viento", "Carlos Ruiz Zafón", "Planeta", 490);
        libro1.imprimir();
        System.out.println(libro1.imprimircubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimircubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimircubierta());
        libro4.imprimir();
        System.out.println(libro4.imprimircubierta());
        libro5.imprimir();
        System.out.println(libro5.imprimircubierta());
        System.out.println(".............CANCIONES......................");

        System.out.println("La Lista de canciones es:");
        cancion cancion1 = new cancion("Ojos Marrones", "Eva", "Lasso", 3.45, 294);
        cancion cancion2 = new cancion("Dueles Tan bien ", "Moustruos", "Bruses", 2.54, 294);
        cancion cancion3 = new cancion("Amapola ", "La Cumbia une a Latinoamerica", "Los Cumbia y PapayaDada", 3.11, 46);
        cancion cancion = new cancion();
        cancion1.imprimirCanciones();
        cancion2.imprimirCanciones();
        cancion3.imprimirCanciones();

        System.out.println(cancion1.getNombre());
        System.out.println(cancion2.getNombre());

        System.out.println(cancion1.getDuracion());
        cancion1.setDuracion(3.54);
        System.out.println(cancion1.getDuracion());

        Series series = new Series("BLACK MIRROR", 6, 2011, 45.15, 27);
        Series series2 = new Series("THE OFFICE", 9, 2005, 28.45, 201);
        Series series3 = new Series("GAME OF THRONES", 8, 2011, 60.00, 73);

        series.imprimirSeries();
        System.out.println(series.imprimirEpisodios());

        series2.imprimirSeries();
        System.out.println(series2.imprimirEpisodios());

        series3.imprimirSeries();
        System.out.println(series3.imprimirEpisodios());

        System.out.println(series.getAñoEstreno());
        series.setAñoEstreno(2022);
        System.out.println(series.getAñoEstreno());
/////////////// autos
        Autos auto1 = new Autos("suzuki", "swift", "rojo", "pbd96561", 2023);
        Autos auto2 = new Autos("kia", "sporttage", "negro", "gb2345", 2015);

        auto1.imprimirAuto();
        auto2.imprimirAuto();
////persona
        Persona persona1 = new Persona("karla", "Rodriguez", "Ecuatoriana", 1753051166, 20);
        Persona persona2 = new Persona("Isaac", "Quinapallo", "Ecuatorina", 1723787273, 20);
        persona1.imprimirPersona();
        persona2.imprimirPersona();
////instrumento
        IntrumentoMusical instrumento1 = new IntrumentoMusical("Guitarra", "Cuerda", "Gibson", 1500.00F,"Les Paul");
        IntrumentoMusical instrumento2 = new IntrumentoMusical("Piano", "Teclado", "Yamaha", 3000.00F, "U1");
        instrumento1.imprimirinstrumentos();
        instrumento2.imprimirinstrumentos();

//////// Pelicula
        Peliculas pelicula1 = new Peliculas("Inception", "Ciencia Ficción", "Christopher Nolan", 148, 2010);
        Peliculas pelicula2 = new Peliculas("The Godfather", "Drama", "Francis Ford Coppola", 175, 1972);
              pelicula1.imprimirPelicula();
              pelicula2.imprimirPelicula();
/////// transporte
        Transporte transporte1 = new Transporte("Autobús", 50, "Mercedes", "Sprinter", 2020);
        Transporte transporte2 = new Transporte("Bicicleta", 1, "Trek", "Marlin", 2021);
        transporte1.imprimirTranporte();
        transporte2.imprimirTranporte();
/////////Zapato
        Zapato zapato1 = new Zapato("Nike", 42, "Negro", "Cuero", "Deportivo");
        Zapato zapato2 = new Zapato("Adidas", 40, "Blanco", "Sintético", "Casual");
        zapato1.imprimirZapato();
        zapato2.imprimirZapato();
    }
}
