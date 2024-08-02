package inmobiliaria;

public class Departamento extends Propiedad {
    private int piso;
    private String departamento;

    public Departamento(String codigo, String direccion, String localidad, double precio, String tipoOperacion, int piso, String departamento) {
        super(codigo, direccion, localidad, precio, tipoOperacion);
        this.piso = piso;
        this.departamento = departamento;
    }

    // Getters y Setters
    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
