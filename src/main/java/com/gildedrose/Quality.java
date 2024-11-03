package com.gildedrose;

public class Quality {
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
