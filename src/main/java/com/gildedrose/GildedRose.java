package com.gildedrose;

public class GildedRose {
    public Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.getName().equals("Aged Brie")
                    && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.getQuality() > 0) {
                    if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                        item.decreaseQuality();
                    }
                }
            } else {
                if (item.getQuality() < 50) {
                    item.increaseQuality();

                    if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.getSellIn() < 11) {
                            item.increaseQuality();
                        }

                        if (item.getSellIn() < 6) {
                            item.increaseQuality();
                        }
                    }
                }
            }

            if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                item.decreaseSellIn();
            }

            if (item.getSellIn() < 0) {
                if (!item.getName().equals("Aged Brie")) {
                    if (!item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.getQuality() > 0) {
                            if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                                item.decreaseQuality();
                            }
                        }
                    } else {
                        item.resetQuality();
                    }
                } else {
                    item.increaseQuality();
                }
            }
        }
    }
}
