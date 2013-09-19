package com.muzima.utils;

import android.graphics.Color;

import java.util.Random;

public enum CustomColor {
    DUTCH_TEAL("#1693A5"),
    CHRISTMAS_BLUE("#2A8FBD"),
    ELLE_BELLE("#7FAF1B"),
    LOST_SOMEWHERE("#48A09B"),
    YUM("#098786"),
    SOMEWHAT_PURPLE("#C19652"),
    CENTENARY_BLUE("#7BA5D1"),
    ROSEWOOD("#901F0F"),
    CLOCKWORK_ORANGE("#E73525"),
    DARTH_GREY("#666666"),
    DINK_PINK("#FF0066"),
    MAD_RED("#F02311"),
    RESPBERRY_SAUCE("#AB0743"),
    STRAWBERRY_SAUCE("#F20F62"),
    ALLERGIC_RED("#FF4040"),
    HUMAN_DRESS("#57553c"),
    HIGH_SKYBLUE("#107FC9"),
    ROUNGE("#FF6600"),
    EYES_IN_SKY("#7D96FF"),
    BLESSING("#DB1750"),
    ACQUA("#036564"),
    GRUBBY("#308000"),
    POOLSIDE("#34BEDA"),
    CREEP("#0B8C8F"),
    BUZZ("#6991AA"),
    BLUSH("#E05D6F"),
    GRUMMPY("#CC527A"),
    COOL_AID("#A40778");

    private int color;
    private static final Random random = new Random();

    public int getColor() {
        return color;
    }

    private CustomColor(String color){
        this.color = Color.parseColor(color);
    }

    public static int getRandomColor(){
        int numOfColors = CustomColor.values().length;
        int colorPos = random.nextInt(numOfColors);
        return CustomColor.values()[colorPos].color;
    }

    public static int getOrderedColor(int position){
        int pos = position % values().length;
        return CustomColor.values()[pos].color;
    }
}
