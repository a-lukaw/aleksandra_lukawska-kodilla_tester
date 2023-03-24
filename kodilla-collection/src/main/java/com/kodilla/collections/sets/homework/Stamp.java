package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private int stampHeight;
    private int stampWidth;
    private boolean isStamped;

    public Stamp(String stampName, int stampHeight, int stampWidth, boolean isStamped) {
        this.stampName = stampName;
        this.stampHeight = stampHeight;
        this.stampWidth = stampWidth;
        this.isStamped = isStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public int getStampHeight() {
        return stampHeight;
    }

    public int getStampWidth() {
        return stampWidth;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stamp stamps = (Stamp) o;
        return this.stampName.equals(stamps.stampName)
                && (Double.compare(stamps.stampHeight, stampHeight) == 0)
                && (Double.compare(stamps.stampWidth, stampWidth) == 0)
                && this.isStamped == stamps.isStamped;
    }

    public int hashCode() {
        return Objects.hash(stampName, stampHeight, stampWidth, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampHeight=" + stampHeight +
                ", stampWidth=" + stampWidth +
                ", isStamped=" + isStamped +
                '}';
    }
}