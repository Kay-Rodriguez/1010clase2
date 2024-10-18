public class IntrumentoMusical {
    String nombre ;
    String tipo;
    String modelo;
    float precio;
    String marca;

    public IntrumentoMusical(final String nombre, final String tipo, final String modelo, final float precio, final String marca) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public float getPrecio() {
        return this.precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public  IntrumentoMusical (String nombre, String tipo, String marca, String modelo, float precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio= precio;}

        public void imprimirinstrumentos () {
            System.out.println("Instrumento: " + nombre + ", Tipo: " + tipo +
                    ", Marca: " + marca + ", Modelo: " + modelo +
                    ", Precio: $" + precio);
        }

    }

