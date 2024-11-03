package com.gildedrose;

public class SellIn {
    private int sellIn;

    public SellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void decreaseSellIn() {
        this.sellIn -= 1;
    }
}
