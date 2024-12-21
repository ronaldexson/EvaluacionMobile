package com.nttdata.steps;

import com.nttdata.screens.CarritoScreen;
import com.nttdata.screens.CatalogoScreen;
import com.nttdata.screens.DetalleProductoScreen;
import org.junit.Assert;


public class CarritoSteps {

    CatalogoScreen catalogoScreen;
    DetalleProductoScreen detalleProductoScreen;
    CarritoScreen carritoScreen;
    private int reservaCantidad = 0;


    public void validoCargaDeProductos() {
        catalogoScreen.cargaCatalogo();

    }


    public void agregarProductoAlCarrito(int cantidad, String producto) {
        reservaCantidad= cantidad;
        catalogoScreen.seleccionarProducto(producto);
        Assert.assertTrue("Error ocasionado al seleccionar el producto: " + producto , detalleProductoScreen.botonAgregarVisible());
        for (int i = 0; i < cantidad; i++) {
            detalleProductoScreen.agregarAlCarrito();
        }

    }



    public void validoProductoAgregadoAlCarrito() {
        detalleProductoScreen.verCarrito();
        Assert.assertTrue("No se cargo o selecciono el producto al carrito", carritoScreen.nombreVisible());

        System.out.println("---- Se agrego correctamente el Producto: " + carritoScreen.obtengoNombreProductoAgregado() + " ----");
        //valido datos del carrito
        double totalCarrito= Double.parseDouble(carritoScreen.obtengoTotalCarrito().replaceAll("[^0-9.]", ""));
        double precioCarrito = Double.parseDouble(carritoScreen.obtengoPrecioCarrito().replaceAll("[^0-9.]", ""));
        double calculoTotalCorrecto= precioCarrito * reservaCantidad;

        System.out.println("TOTAL: " + totalCarrito + " Precio carrito: " + precioCarrito + " calculo: " + calculoTotalCorrecto);
        Assert.assertEquals("La cantidad agregada anteriormente fue: " + reservaCantidad + ", pero en el Carrito la cantidad es : " + carritoScreen.obtengoCantidadCarrito()  , reservaCantidad, carritoScreen.obtengoCantidadCarrito());
        Assert.assertEquals("El precio por la cantidad " + reservaCantidad + ", no es la correcta", calculoTotalCorrecto, totalCarrito, 0.0001);



    }



}






