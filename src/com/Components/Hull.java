package com.Components;

public class Hull extends ComputerSampler {

    private final String componentName = "Корпус";

    public Hull(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
