package com.gildedrose;

public class Item {
    protected ItemName itemName;
    protected SellIn itemSellIn;
    protected Quality itemQuality;

    public Item(String name, int sellIn, int quality) {
        this.itemName = new ItemName(name);
        this.itemSellIn = new SellIn(sellIn);
        this.itemQuality = new Quality(quality);
    }

    // Геттер для сумісності з тестами
    public String name() {
        return itemName.getName();
    }

    public int getSellIn() {
        return itemSellIn.getSellIn();
    }

    public int getQuality() {
        return itemQuality.getQuality();
    }

    public void increaseQuality() {
        itemQuality.increaseQuality();
    }

    public void decreaseQuality() {
        itemQuality.decreaseQuality();
    }

    public void decreaseSellIn() {
        itemSellIn.decreaseSellIn();
    }

    public void resetQuality() {
        itemQuality = new Quality(0);
    }

    @Override
    public String toString() {
        return this.itemName.getName() + ", " + this.itemSellIn.getSellIn() + ", " + this.itemQuality.getQuality();
    }

    public void update() {
        decreaseSellIn();
        if (getQuality() > 0) {
            decreaseQuality();
        }
        if (getSellIn() < 0 && getQuality() > 0) {
            decreaseQuality();
        }
    }
}
