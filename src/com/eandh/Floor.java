package com.eandh;

/**
 * Created by localadmin on 7/27/16.
 */
public enum Floor {
    Tile (0.50), Hardwood(1.00), Laminate(.10), Carpet(1.50), Turtles (100.00);

    public double getCost() {
        return cost;
    }

    private final double cost; //in dollars

    Floor(double Cost) {
        this.cost = Cost;
    }
}
