package com.Components;

public class HDD extends ComputerSampler {

    private final String componentName = "HDD";

    public HDD(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
