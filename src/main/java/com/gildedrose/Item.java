package com.gildedrose;

public class Item {
    public String name;
    public int sellIn;
    public int quality;

    private ItemName itemName;
    private SellIn itemSellIn;
    private Quality itemQuality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;

        this.itemName = new ItemName(name);
        this.itemSellIn = new SellIn(sellIn);
        this.itemQuality = new Quality(quality);
    }

    public String getName() {
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
}
