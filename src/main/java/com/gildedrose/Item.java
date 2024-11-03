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

    // Геттер для отримання значення name
    public String getName() {
        return itemName.getName();
    }

    // Геттер для отримання значення sellIn
    public int getSellIn() {
        return itemSellIn.getSellIn();
    }

    // Геттер для отримання значення quality
    public int getQuality() {
        return itemQuality.getQuality();
    }

    @Override
    public String toString() {
        return this.itemName.getName() + ", " + this.itemSellIn.getSellIn() + ", " + this.itemQuality.getQuality();
    }

    public static class ItemName {
        private String name;

        public ItemName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class SellIn {
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

    public static class Quality {
        private int quality;

        public Quality(int quality) {
            this.quality = quality;
        }

        public int getQuality() {
            return quality;
        }

        public void increaseQuality() {
            if (quality < 50) {
                quality += 1;
            }
        }

        public void decreaseQuality() {
            if (quality > 0) {
                quality -= 1;
            }
        }
    }
}
