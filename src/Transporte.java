public class Transporte {
    String tipo;int capacidad;
    String marca;
    String modelo;
    int year;

    public Transporte(String tipo, int capacidad, String marca, String modelo, int year) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getYear() {
        return this.year;
    }

    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidad(final int capacidad) {
        this.capacidad = capacidad;
    }

    public void setMarca(final String marca) {
        this.marca = marca;
    }

    public void setModelo(final String modelo) {
        this.modelo = modelo;
    }

    public void setYear(final int year) {
        this.year = year;
    }
    public void imprimirTranporte() {
        System.out.println("Transporte: " + tipo + ", Capacidad: " + capacidad +
                ", Marca: " + marca + ", Modelo: " + modelo + ", Año: " + year);
    }
}
