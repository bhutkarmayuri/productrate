package com.app.Model;

public class Avaibility {
		
	private boolean inStock;
    private int quantity;

    // Constructors
    public Avaibility() {}

    public Avaibility(boolean inStock, int quantity) {
        this.inStock = inStock;
        this.quantity = quantity;
    }

    // Getters and setters
    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
