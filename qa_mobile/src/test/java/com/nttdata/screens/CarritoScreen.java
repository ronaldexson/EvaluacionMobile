package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarritoScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\"]")
    private WebElement nomProducto;


    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/noTV")
    private WebElement cantidadCarrito;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/priceTV")
    private WebElement precioCarrito;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/totalPriceTV")
    private WebElement totalCarrito;

    public boolean nombreVisible(){
        try {
            waitFor(ExpectedConditions.visibilityOf(nomProducto));
            return nomProducto.isEnabled();

        } catch (TimeoutException e) {
            return false;
    }
}

    public String obtengoNombreProductoAgregado(){
        waitFor(ExpectedConditions.visibilityOf(nomProducto));
        return nomProducto.getText();
    }


    public int obtengoCantidadCarrito(){
        int varCantidad=0;
        waitFor(ExpectedConditions.visibilityOf(cantidadCarrito));
        varCantidad= Integer.parseInt(cantidadCarrito.getText());
            return varCantidad;
        }

    public String obtengoPrecioCarrito(){
        waitFor(ExpectedConditions.visibilityOf(precioCarrito));
        return precioCarrito.getText();
    }
    public String obtengoTotalCarrito(){
        waitFor(ExpectedConditions.visibilityOf(totalCarrito));
        return totalCarrito.getText();
    }

    }

