package com.eandh;

/**
 * Created by localadmin on 7/27/16.
 */
public enum Paint {
    Matte (10.50), Eggshell(10.00), SemiGloss(10.10), Flat(20.50), Invisible(110.00);

    public double getCost() {
        return cost;
    }

    private final double cost; //in dollars

    Paint(double Cost) {
        this.cost = Cost;
    }
}
