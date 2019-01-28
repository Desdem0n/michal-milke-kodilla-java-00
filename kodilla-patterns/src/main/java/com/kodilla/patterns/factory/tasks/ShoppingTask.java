package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        return "Shall buy: " + whatToBuy + ", quantity: " + quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return true;
    }
}