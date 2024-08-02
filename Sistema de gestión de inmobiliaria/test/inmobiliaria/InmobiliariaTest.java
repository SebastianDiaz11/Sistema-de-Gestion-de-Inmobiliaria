package inmobiliaria;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class InmobiliariaTest {
    private Inmobiliaria inmobiliaria;

    @Before
    public void setUp() {
        inmobiliaria = new Inmobiliaria();
    }

    @Test
    public void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria() {
        Casa casa = new Casa("001", "Calle 1", "Ciudad", 100000, "Venta");
        inmobiliaria.agregarPropiedad(casa);
        assertEquals(1, inmobiliaria.getPropiedades().size());
    }

    @Test
    public void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() {
        Casa casa1 = new Casa("001", "Calle 1", "Ciudad", 100000, "Venta");
        Casa casa2 = new Casa("002", "Calle 2", "Ciudad", 150000, "Venta");
        inmobiliaria.agregarPropiedad(casa1);
        inmobiliaria.agregarPropiedad(casa2);
        assertEquals(2, inmobiliaria.getPropiedades().size());
    }

    @Test
    public void queNoSePuedanDarDeAltaDosCasasConUnaMismaDireccion() {
        Casa casa1 = new Casa("001", "Calle 1", "Ciudad", 100000, "Venta");
        Casa casa2 = new Casa("002", "Calle 1", "Ciudad", 150000, "Venta");
        inmobiliaria.agregarPropiedad(casa1);
        inmobiliaria.agregarPropiedad(casa2);
        assertEquals(1, inmobiliaria.getPropiedades().size());
    }

    @Test
    public void queSePuedaBuscarPropiedadesPorPrecio() {
        Casa casa1 = new Casa("001", "Calle 1", "Ciudad", 100000, "Venta");
        Casa casa2 = new Casa("002", "Calle 2", "Ciudad", 150000, "Venta");
        Casa casa3 = new Casa("003", "Calle 3", "Ciudad", 200000, "Venta");
        inmobiliaria.agregarPropiedad(casa1);
        inmobiliaria.agregarPropiedad(casa2);
        inmobiliaria.agregarPropiedad(casa3);
        assertEquals(2, inmobiliaria.buscarPropiedadesPorRangoDePrecios(100000, 150000).size());
    }

    @Test
    public void queSePuedaBuscarPropiedadesPorUbicacion() {
        Casa casa1 = new Casa("001", "Calle 1", "Ciudad1", 100000, "Venta");
        Casa casa2 = new Casa("002", "Calle 2", "Ciudad2", 150000, "Venta");
        Casa casa3 = new Casa("003", "Calle 3", "Ciudad1", 200000, "Venta");
        inmobiliaria.agregarPropiedad(casa1);
        inmobiliaria.agregarPropiedad(casa2);
        inmobiliaria.agregarPropiedad(casa3);
        assertEquals(2, inmobiliaria.buscarPropiedadesPorUbicacion("Ciudad1").size());
    }

    @Test
    public void queSePuedaRealizarUnaVenta() {
        Casa casa = new Casa("001", "Calle 1", "Ciudad", 100000, "Venta");
        Cliente comprador = new Cliente("Juan", "12345678");
        inmobiliaria.agregarPropiedad(casa);
        inmobiliaria.agregarCliente(comprador);
        inmobiliaria.realizarVenta(casa, comprador);
        assertEquals(0, inmobiliaria.getPropiedades().size());
        assertEquals(1, inmobiliaria.getVentas().size());
    }

    @Test
    public void queSePuedaRealizarUnAlquiler() {
        Departamento depto = new Departamento("001", "Calle 1", "Ciudad", 100000, "Alquiler", 2, "A");
        Cliente inquilino = new Cliente("Pedro", "87654321");
        inmobiliaria.agregarPropiedad(depto);
        inmobiliaria.agregarCliente(inquilino);
        inmobiliaria.realizarAlquiler(depto, inquilino, 12, 1200);
        assertEquals(1, inmobiliaria.getAlquileres().size());
    }

    @Test
    public void queSePuedaRealizarUnaPermuta() {
        Casa casa1 = new Casa("001", "Calle 1", "Ciudad", 100000, "Permuta");
        Casa casa2 = new Casa("002", "Calle 2", "Ciudad", 150000, "Permuta");
        Cliente nuevoPropietario = new Cliente("Maria", "12344321");
        inmobiliaria.agregarPropiedad(casa1);
        inmobiliaria.agregarPropiedad(casa2);
        inmobiliaria.agregarCliente(nuevoPropietario);
        inmobiliaria.realizarPermuta(casa1, casa2, nuevoPropietario);
        assertEquals(0, inmobiliaria.getPropiedades().size());
        assertEquals(1, inmobiliaria.getPermutas().size());
    }
}




