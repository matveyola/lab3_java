package com.gildedrose;

public class BackstagePass extends Item {
    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        decreaseSellIn();
        if (isExpired()) {
            resetQuality();
        } else {
            increaseQualityBasedOnSellIn();
        }
    }

    private boolean isExpired() {
        return itemSellIn.getSellIn() < 0;
    }

    private void increaseQualityBasedOnSellIn() {
        increaseQuality();
        if (itemSellIn.getSellIn() < 10) {
            increaseQuality();
        }
        if (itemSellIn.getSellIn() < 5) {
            increaseQuality();
        }
    }
}
