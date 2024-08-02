package inmobiliaria;

public class Venta {
    private Propiedad propiedad;
    private Cliente comprador;
    private double precioVenta;

    public Venta(Propiedad propiedad, Cliente comprador, double precioVenta) {
        this.propiedad = propiedad;
        this.comprador = comprador;
        this.precioVenta = precioVenta;
    }

    // Getters y Setters
    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}