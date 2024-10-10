//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
        cancion cancion1 =new cancion("Ojos Marrones","Eva","Lasso",3.45,294);
        cancion cancion2 =new cancion("Dueles Tan bien ","Moustruos","Bruses",2.54,294);
        cancion cancion3 =new cancion("Amapola ","La Cumbia une a Latinoamerica","Los Cumbia y PapayaDada",3.11,46);
        cancion1.imprimirCanciones();
        cancion2.imprimirCanciones();
        cancion3.imprimirCanciones();

        System.out.println(cancion1.getNombre());
        System.out.println(cancion2.getNombre());

        System.out.println(cancion1.getDuracion());
        cancion1.setDuracion(3.54);
        System.out.println(cancion1.getDuracion());


    }
}
