public class Zapato {
    private String marca;
    private int talla;
    private String color;
    private String material;
    private String tipo;

    public Zapato(String marca, int talla, String color, String material, String tipo) {
        this.marca = marca;
        this.talla = talla;
        this.color = color;
        this.material = material;
        this.tipo = tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(final String marca) {
        this.marca = marca;
    }

    public int getTalla() {
        return this.talla;
    }

    public void setTalla(final int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(final String material) {
        this.material = material;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }

    public void imprimirZapato() {
        System.out.println("Zapato: " + marca + ", Talla: " + talla +
                ", Color: " + color + ", Material: " + material +
                ", Tipo: " + tipo);
    }
}

