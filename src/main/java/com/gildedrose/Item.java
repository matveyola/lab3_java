package com.gildedrose;

public class Item {
    public String name;
    public int sellIn;
    public int quality;

    protected ItemName itemName;
    protected SellIn itemSellIn;
    protected Quality itemQuality;

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

    // Метод для оновлення, який буде перевизначено в класах-нащадках
    public void update() {
        decreaseSellIn();
        if (quality > 0) {
            decreaseQuality();
        }
        if (sellIn < 0 && quality > 0) {
            decreaseQuality();
        }
    }
}
