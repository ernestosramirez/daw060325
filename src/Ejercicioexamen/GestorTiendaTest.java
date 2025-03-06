package Ejercicioexamen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {

    static GestorTienda gestores;
    
    @BeforeAll
    static void setUp() {
        gestores = new GestorTienda();
    }

    @Test
    void testCalcularDescuento() {
        assertEquals(10.0, gestores.calcularDescuento(100, 10), 0.01); 
        assertEquals(5.0, gestores.calcularDescuento(100, 5), 0.01);
        assertEquals(0.0, gestores.calcularDescuento(100, 4), 0.01); 
    }

    @Test
    void testCategorizarProducto() {
        assertEquals("Económico", gestores.categorizarProducto(9.99));
        assertEquals("Estándar", gestores.categorizarProducto(10)); 
        assertEquals("Estándar", gestores.categorizarProducto(49.99)); 
        assertEquals("Premium", gestores.categorizarProducto(50)); 
    }

    @Test
    void testBuscarProducto() {
        String[] inventario = {"Calcetines", "Zapatillas", "Camiseta"};
        
        assertEquals("Calcetines", gestores.buscarProducto(inventario, "Calcetines")); 
        assertNull(gestores.buscarProducto(inventario, "Pantalones")); 
        assertNull(gestores.buscarProducto(inventario, "Teclado")); 
        assertNull(gestores.buscarProducto(inventario, "Balon de baloncesto")); 
    }
}


