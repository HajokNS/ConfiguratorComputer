package com.Components;

public class Mouse extends ComputerSampler {

    private final String componentName = "Мишка";

    public Mouse(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}