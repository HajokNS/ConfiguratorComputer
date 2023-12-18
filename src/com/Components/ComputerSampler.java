package com.Components;

abstract class ComputerSampler {

    protected final String model;

    protected ComputerSampler(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
