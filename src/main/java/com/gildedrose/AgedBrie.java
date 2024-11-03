package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        decreaseSellIn();
        increaseQuality();
        if (isExpired()) {
            increaseQuality();
        }
    }

    private boolean isExpired() {
        return itemSellIn.getSellIn() < 0;
    }
}


