package com.Components;

public class Keyboard extends ComputerSampler {

    private final String componentName = "Клавіатура";

    public Keyboard(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
