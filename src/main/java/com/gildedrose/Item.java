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

    protected void increaseQuality() {
        itemQuality.increaseQuality();
    }

    protected void decreaseQuality() {
        itemQuality.decreaseQuality();
    }

    protected void decreaseSellIn() {
        itemSellIn.decreaseSellIn();
    }

    protected void resetQuality() {
        itemQuality = new Quality(0);
    }

    public void update() {
        decreaseSellIn();
        if (itemQuality.getQuality() > 0) {
            decreaseQuality();
        }
        if (itemSellIn.getSellIn() < 0 && itemQuality.getQuality() > 0) {
            decreaseQuality();
        }
    }

    @Override
    public String toString() {
        return this.itemName.getName() + ", " + this.itemSellIn.getSellIn() + ", " + this.itemQuality.getQuality();
    }
}
