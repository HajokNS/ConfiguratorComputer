package com.Components;

public class Processor extends ComputerSampler {

    private final String componentName = "Процесор";

    public Processor(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
