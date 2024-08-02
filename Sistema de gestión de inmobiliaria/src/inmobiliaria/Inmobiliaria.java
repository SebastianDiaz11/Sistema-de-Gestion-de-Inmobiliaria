package inmobiliaria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Inmobiliaria {
    private List<Propiedad> propiedades;
    private List<Cliente> clientes;
    private List<Venta> ventas;
    private List<Alquiler> alquileres;
    private List<Permuta> permutas;

    public Inmobiliaria() {
        this.propiedades = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.alquileres = new ArrayList<>();
        this.permutas = new ArrayList<>();
    }

    // Getters y Setters
    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public List<Permuta> getPermutas() {
        return permutas;
    }

    public void setPermutas(List<Permuta> permutas) {
        this.permutas = permutas;
    }

    public void agregarPropiedad(Propiedad propiedad) {
        // Verificar si ya existe una propiedad con la misma dirección
        boolean exists = propiedades.stream().anyMatch(p -> p.getDireccion().equals(propiedad.getDireccion()));
        if (!exists) {
            this.propiedades.add(propiedad);
        }
    }

    public void modificarPropiedad(String codigo, Propiedad propiedadModificada) {
        for (int i = 0; i < propiedades.size(); i++) {
            if (propiedades.get(i).getCodigo().equals(codigo)) {
                propiedades.set(i, propiedadModificada);
                return;
            }
        }
    }

    public void agregarCliente(Cliente cliente) {
        if (!clientes.stream().anyMatch(c -> c.getDni().equals(cliente.getDni()))) {
            this.clientes.add(cliente);
        }
    }

    public List<Propiedad> listarPropiedadesPorPrecio() {
        return propiedades.stream().sorted(Comparator.comparingDouble(Propiedad::getPrecio)).collect(Collectors.toList());
    }

    public List<Propiedad> listarPropiedadesPorUbicacion() {
        return propiedades.stream().sorted(Comparator.comparing(Propiedad::getLocalidad)).collect(Collectors.toList());
    }

    public List<Propiedad> buscarPropiedadesPorRangoDePrecios(double minPrecio, double maxPrecio) {
        return propiedades.stream().filter(p -> p.getPrecio() >= minPrecio && p.getPrecio() <= maxPrecio).collect(Collectors.toList());
    }

    public List<Propiedad> buscarPropiedadesPorUbicacion(String ubicacion) {
        return propiedades.stream().filter(p -> p.getLocalidad().equalsIgnoreCase(ubicacion)).collect(Collectors.toList());
    }

    public List<Propiedad> buscarPropiedadesPorTipoOperacion(String tipoOperacion) {
        return propiedades.stream().filter(p -> p.getTipoOperacion().equalsIgnoreCase(tipoOperacion)).collect(Collectors.toList());
    }

    public void realizarVenta(Propiedad propiedad, Cliente comprador) {
        Venta venta = new Venta(propiedad, comprador, propiedad.getPrecio());
        ventas.add(venta);
        propiedades.remove(propiedad);
    }

    public void realizarAlquiler(Propiedad propiedad, Cliente inquilino, int duracion, double precioAlquiler) {
        Alquiler alquiler = new Alquiler(propiedad, inquilino, duracion, precioAlquiler);
        alquileres.add(alquiler);
    }

    public void realizarPermuta(Propiedad propiedad1, Propiedad propiedad2, Cliente nuevoPropietario) {
        Permuta permuta = new Permuta(propiedad1, propiedad2, nuevoPropietario);
        permutas.add(permuta);
        propiedades.remove(propiedad1);
        propiedades.remove(propiedad2);
    }
}



