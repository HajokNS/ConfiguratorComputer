package com.Components;

public class SSD extends ComputerSampler {

    private final String componentName = "SSD";

    public SSD(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
