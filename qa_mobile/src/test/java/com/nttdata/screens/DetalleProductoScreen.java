package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DetalleProductoScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAgregarCarrito;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    private WebElement iconoCarrito;


    public boolean botonAgregarVisible(){
       try {
           waitFor(ExpectedConditions.visibilityOf(btnAgregarCarrito));
           return btnAgregarCarrito.isEnabled();
       }catch (TimeoutException e){
           return false;
       }

    }


    public void agregarAlCarrito(){
        waitFor(ExpectedConditions.visibilityOf(btnAgregarCarrito));
        btnAgregarCarrito.click();

    }

    public void verCarrito(){
        waitFor(ExpectedConditions.visibilityOf(iconoCarrito));
        iconoCarrito.click();
    }



}
