package com.Components;

public class Monitor extends ComputerSampler {

    private final String componentName = "Монітор";

    public Monitor(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
