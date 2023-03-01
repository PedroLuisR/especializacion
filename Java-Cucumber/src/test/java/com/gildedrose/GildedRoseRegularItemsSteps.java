package com.gildedrose;

import static org.junit.Assert.assertEquals;

import java.util.List;

import io.cucumber.java.en.*;

public class GildedRoseRegularItemsSteps {

	private Item[] items;
    private GildedRose gildedRose;

    @Given("^una lista de elementos regulares con calidad (\\d+) y días de venta (\\d+)$")
    public void GildedRoseRegularItemsSteps(int quality, int sellIn) throws Throwable {
        items = new Item[] { new Item("+5 Dexterity Vest", sellIn, quality), new Item("Elixir of the Mongoose", sellIn, quality) };
        gildedRose = new GildedRose(items);
    }

    @When("^se actualiza la calidad de los elementos$")
    public void se_actualiza_la_calidad_de_los_elementos() throws Throwable {
        gildedRose.updateQuality();
    }

    @Then("^la calidad y días de venta de los elementos se actualizan según las reglas$")
    public void la_calidad_y_días_de_venta_de_los_elementos_se_actualizan_segun_las_reglas(List<Integer> expectedValues) throws Throwable {
        assertEquals(expectedValues.get(0).intValue(), items[0].sellIn);
        assertEquals(expectedValues.get(1).intValue(), items[0].quality);
        assertEquals(expectedValues.get(2).intValue(), items[1].sellIn);
        assertEquals(expectedValues.get(3).intValue(), items[1].quality);
    }
}
