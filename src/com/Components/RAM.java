package com.Components;

public class RAM extends ComputerSampler {

    private final String componentName = "RAM";

    public RAM(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
