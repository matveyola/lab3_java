package com.gildedrose;

public class BackstagePass extends Item {
    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        decreaseSellIn();

        if (getSellIn() < 0) {
            resetQuality();
        } else if (getSellIn() < 5) {
            increaseQuality();
            increaseQuality();
            increaseQuality();
        } else if (getSellIn() < 10) {
            increaseQuality();
            increaseQuality();
        } else {
            increaseQuality();
        }
    }
}

