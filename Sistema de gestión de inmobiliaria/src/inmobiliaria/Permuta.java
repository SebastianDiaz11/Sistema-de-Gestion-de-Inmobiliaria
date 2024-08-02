package inmobiliaria;

public class Permuta {
    private Propiedad propiedad1;
    private Propiedad propiedad2;
    private Cliente nuevoPropietario;

    public Permuta(Propiedad propiedad1, Propiedad propiedad2, Cliente nuevoPropietario) {
        this.propiedad1 = propiedad1;
        this.propiedad2 = propiedad2;
        this.nuevoPropietario = nuevoPropietario;
    }

    // Getters y Setters
    public Propiedad getPropiedad1() {
        return propiedad1;
    }

    public void setPropiedad1(Propiedad propiedad1) {
        this.propiedad1 = propiedad1;
    }

    public Propiedad getPropiedad2() {
        return propiedad2;
    }

    public void setPropiedad2(Propiedad propiedad2) {
        this.propiedad2 = propiedad2;
    }

    public Cliente getNuevoPropietario() {
        return nuevoPropietario;
    }

    public void setNuevoPropietario(Cliente nuevoPropietario) {
        this.nuevoPropietario = nuevoPropietario;
    }
}
