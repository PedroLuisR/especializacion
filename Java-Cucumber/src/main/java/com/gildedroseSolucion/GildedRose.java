package com.gildedroseSolucion;

import com.gildedrose.Item;

public class GildedRose {
    final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    private void updateItem(Item item) {
        switch (item.name) {
            case "Aged Brie":
                updateAgedBrie(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                updateBackstagePasses(item);
                break;
            case "Sulfuras, Hand of Ragnaros":
                break;
            default:
                updateRegularItem(item);
        }
    }

    private void updateRegularItem(Item item) {
        if (item.quality > 0) {
            item.quality--;
            if (item.sellIn <= 0) {
                item.quality--;
            }
        }
        item.sellIn--;
    }

    private void updateAgedBrie(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
        item.sellIn--;
        if (item.sellIn <= 0 && item.quality < 50) {
            item.quality++;
        }
    }

    private void updateBackstagePasses(Item item) {
        if (item.quality < 50) {
            item.quality++;
            if (item.sellIn <= 10 && item.quality < 50) {
                item.quality++;
            }
            if (item.sellIn <= 5 && item.quality < 50) {
                item.quality++;
            }
        }
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
    
    public void sellSpecial(Item item) {
        if (item.name.equals("Special")) {
            if (item.quality > 0) {
                item.quality--;
            }
            item.sellIn--;
        }
    }
}