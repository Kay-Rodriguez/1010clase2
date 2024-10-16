public class Autos {
    String marca;
    String modelo;
    String color;
    String placa;
    int anio;

    public Autos(String marca, String modelo, String color, String placa, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.anio = anio;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void imprimirAuto(){
        System.out.println("Auto: " + marca + ", Modelo: " + modelo + ", Año: " + anio + ", Color: " + color + " placa" + placa);
    }
}