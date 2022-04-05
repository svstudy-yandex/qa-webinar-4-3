package ru.yandex.staticmod;

import static ru.yandex.staticmod.Converter.stepsToKcal;

public class StepTracker {
    private final Converter converter;

    StepTracker() {
        converter = new Converter();
        MonthData md = new MonthData();
    }

    public double getCaloriesByMonth(int month) {
        int steps = 0;
        //...
        return stepsToKcal(steps);
    }

    static class MonthData {
        //double kms = converter.stepsToKilometers(1);
    }
}
