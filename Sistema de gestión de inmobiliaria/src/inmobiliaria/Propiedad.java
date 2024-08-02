package inmobiliaria;

public abstract class Propiedad {
    private String codigo;
    private String direccion;
    private String localidad;
    private double precio;
    private String tipoOperacion; // Venta, Alquiler, Permuta

    public Propiedad(String codigo, String direccion, String localidad, double precio, String tipoOperacion) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.localidad = localidad;
        this.precio = precio;
        this.tipoOperacion = tipoOperacion;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }
}
