public class Persona {
    String nombre;
    String apellido;
    String nacionalidad;
    int cedula;
    int edad;

    public Persona(final String nombre, final String apellido, final String nacionalidad, final int cedula, final int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(final String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(final String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getCedula() {
        return this.cedula;
    }

    public void setCedula(final int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(final int edad) {
        this.edad = edad;
    }
    public void imprimirPersona() {
        System.out.println("Persona Nombre: " + nombre +
                ", Apellido: " + apellido +
                ", Nacionalidad: " + nacionalidad +
                ", Cedula: " + cedula +
                ", Edad: " + edad);
    }

}
