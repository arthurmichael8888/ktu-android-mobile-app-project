package com.example.mymobileapp;

public class TableItem {
    private String name;
    private String category;
    private double price;
    private int quantity;
    private int imageResId;

    // Constructor
    public TableItem(String name, String category, double price, int quantity, int imageResId) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.imageResId = imageResId;
    }

    // Getter methods
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public int getImageResId() { return imageResId; }
}