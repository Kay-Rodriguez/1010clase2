public class Autos {
    String marca;
    String modelo;
    String color;
    String placa;
    int anio;

    public Autos(String marca, String modelo, int anio, String color, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getplaca() {
        return placa;
    }

    public void setKilometraje(String getplaca) {
        this.placa = placa;
    }

    public void imprimirAuto() {
        System.out.println("Auto: " + marca + ", Modelo: " + modelo + ", Año: " + anio + ", Color: " + color + " placa" + placa);
    }
}