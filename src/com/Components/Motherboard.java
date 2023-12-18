package com.Components;

public class Motherboard extends ComputerSampler {

    private final String componentName = "Материнська плата";
    private final Processor processor;
    private final RAM ram;

    private Motherboard(String model, MotherboardBuilder motherboardBuilder) {
        super(model);
        this.processor = motherboardBuilder.processor;
        this.ram = motherboardBuilder.ram;
    }

    @Override
    public String toString() {
        return componentName;
    }

    public static class MotherboardBuilder {

        private Processor processor;
        private RAM ram;

        public MotherboardBuilder setProcessor(Processor processor) {
            this.processor = processor;
            return this;
        }

        public MotherboardBuilder setRAM(RAM ram) {
            this.ram = ram;
            return this;
        }

        public Motherboard build(String model) {
            if (processor != null && ram != null) {
                return new Motherboard(model, this);
            } else {
                System.out.println("Не вистачає деякого компонента...");
                return null;
            }
        }
    }
}
