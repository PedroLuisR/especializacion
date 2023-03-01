package com.gildedroseSolucion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gildedrose.Item;

public class GildedRoseTest {

	 @Test
	    public void testUpdateQualityForNormalItem() {
	        Item[] items = new Item[] { new Item("Normal Item", 5, 10) };
	        GildedRose app = new GildedRose(items);
	        app.updateQuality();
	        assertEquals("Normal Item", app.items[0].name);
	        assertEquals(4, app.items[0].sellIn);
	        assertEquals(9, app.items[0].quality);
	    }

	    @Test
	    public void testUpdateQualityForAgedBrie() {
	        Item[] items = new Item[] { new Item("Aged Brie", 10, 30) };
	        GildedRose app = new GildedRose(items);
	        app.updateQuality();
	        assertEquals("Aged Brie", app.items[0].name);
	        assertEquals(9, app.items[0].sellIn);
	        assertEquals(31, app.items[0].quality);
	    }

	    @Test
	    public void testUpdateQualityForBackstagePasses() {
	        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20) };
	        GildedRose app = new GildedRose(items);
	        app.updateQuality();
	        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
	        assertEquals(14, app.items[0].sellIn);
	        assertEquals(21, app.items[0].quality);
	    }

	    @Test
	    public void testUpdateQualityForSulfuras() {
	        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
	        GildedRose app = new GildedRose(items);
	        app.updateQuality();
	        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
	        assertEquals(0, app.items[0].sellIn);
	        assertEquals(80, app.items[0].quality);
	    }

	    @Test
	    public void testUpdateQualityForConjuredItem() {
	        Item[] items = new Item[] { new Item("Conjured Mana Cake", 3, 6) };
	        GildedRose app = new GildedRose(items);
	        app.updateQuality();
	        assertEquals("Conjured Mana Cake", app.items[0].name);
	        assertEquals(2, app.items[0].sellIn);
	        assertEquals(5, app.items[0].quality);
	    }
}
