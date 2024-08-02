package inmobiliaria;

public class Alquiler {
    private Propiedad propiedad;
    private Cliente inquilino;
    private int duracionMeses;
    private double precioAlquiler;

    public Alquiler(Propiedad propiedad, Cliente inquilino, int duracionMeses, double precioAlquiler) {
        this.propiedad = propiedad;
        this.inquilino = inquilino;
        this.duracionMeses = duracionMeses;
        this.precioAlquiler = precioAlquiler;
    }

    // Getters y Setters
    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public Cliente getInquilino() {
        return inquilino;
    }

    public void setInquilino(Cliente inquilino) {
        this.inquilino = inquilino;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
}
