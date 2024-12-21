package com.nttdata.stepdefinitions;

import com.nttdata.steps.CarritoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class CarritoStepDef {
    @Steps
    CarritoSteps carritoSteps;

    @Given("que estoy en la aplicacion de SauceLabs")
    public void queEstoyEnLaAplicacionDeSauceLabs() {

    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
       carritoSteps.validoCargaDeProductos();
    }

    @When("agrego {} del siguiente {string}")
    public void agregoDelSiguiente(int cantidad, String producto) {
        carritoSteps.agregarProductoAlCarrito(cantidad, producto);
    }

    @Then("valido que el carrito de compras se actualice correctamente")
    public void validoQueElCarritoDeComprasSeActualiceCorrectamente() {
        carritoSteps.validoProductoAgregadoAlCarrito();
    }

}


