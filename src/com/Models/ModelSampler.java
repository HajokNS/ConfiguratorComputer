package com.Models;

abstract class ModelSampler {

    protected final String model;
    protected final int price;
    protected final String producer;

    protected ModelSampler(String model, int price, String producer) {
        this.model = model;
        this.price = price;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Модель: " + model + "\n" + "Ціна: " + price + "\n" + "Виробник: " + producer;
    }
}

