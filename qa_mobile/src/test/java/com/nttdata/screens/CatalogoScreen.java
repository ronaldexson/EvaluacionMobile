package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CatalogoScreen extends PageObject {
    @AndroidFindBy(accessibility = "Sauce Labs Backpack")
    private WebElement eleBackpack;

    @AndroidFindBy(accessibility = "Sauce Labs Bike Light")
    private WebElement eleBikeLight;

    @AndroidFindBy(accessibility = "Sauce Labs Bolt T-Shirt")
    private WebElement eleShirt;

    @AndroidFindBy(accessibility = "Sauce Labs Fleece Jacket")
    private WebElement eleJacket;

    @AndroidFindBy(accessibility = "Sauce Labs Onesie")
    private WebElement eleOnesie;

    @AndroidFindBy(accessibility = "Test.sllTheThings() T-Shirt")
    private WebElement eleTheThings;



    public void cargaCatalogo(){
        waitFor(ExpectedConditions.visibilityOf(eleBackpack));
        Assert.assertTrue("No encontro producto",eleBackpack.isEnabled());

        waitFor(ExpectedConditions.visibilityOf(eleBikeLight));
        Assert.assertTrue("No encontro producto",eleBikeLight.isEnabled());

        waitFor(ExpectedConditions.visibilityOf(eleShirt));
        Assert.assertTrue("No encontro producto",eleShirt.isEnabled());


        waitFor(ExpectedConditions.visibilityOf(eleJacket));
        Assert.assertTrue("No encontro producto",eleJacket.isEnabled());

        waitFor(ExpectedConditions.visibilityOf(eleOnesie));
        Assert.assertTrue("No encontro producto", eleOnesie.isEnabled());

        waitFor(ExpectedConditions.visibilityOf(eleTheThings));
        Assert.assertTrue("No encontro producto", eleTheThings.isEnabled());
    }


    public void seleccionarProducto(String nombreProducto) {
        int maxReintentos = 3;
        int intento = 0;
        boolean exito = false;

        while (intento < maxReintentos && !exito) {
            try {
                intento++;
                switch (nombreProducto) {
                    case "Sauce Labs Backpack":
                        waitFor(ExpectedConditions.visibilityOf(eleBackpack));
                        eleBackpack.click();
                        exito = true; // El clic fue exitoso
                        break;
                    case "Sauce Labs Bike Light":
                        waitFor(ExpectedConditions.visibilityOf(eleBikeLight));
                        eleBikeLight.click();
                        exito = true;
                        break;
                    case "Sauce Labs Bolt T-Shirt":
                        waitFor(ExpectedConditions.visibilityOf(eleShirt));
                        eleShirt.click();
                        exito = true;
                        break;
                    case "Sauce Labs Fleece Jacket":
                        waitFor(ExpectedConditions.visibilityOf(eleJacket));
                        eleJacket.click();
                        exito = true;
                        break;
                    case "Sauce Labs Onesie":
                        waitFor(ExpectedConditions.visibilityOf(eleOnesie));
                        eleOnesie.click();
                        exito = true;
                        break;
                    case "Test.sllTheThings() T-Shirt":
                        waitFor(ExpectedConditions.visibilityOf(eleTheThings));
                        eleTheThings.click();
                        exito = true;
                        break;
                    default:
                        System.out.println("Producto no encontrado: " + nombreProducto);
                        exito = true; // Salir del bucle ya que no hay nada más que intentar
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error al intentar seleccionar el producto: " + nombreProducto + ". Reintento #" + intento);
                if (intento >= maxReintentos) {
                    System.out.println("No se pudo seleccionar el producto después de " + maxReintentos + " intentos.");
                }
            }
        }
    }




    }

