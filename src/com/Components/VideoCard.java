package com.Components;

public class VideoCard extends ComputerSampler {

    private final String componentName = "Відеокарта";

    public VideoCard(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
