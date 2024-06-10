package web.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {

    private String model;
    private String color;
    private String series;

    public Car() {
    }

    public Car(String model, String color, String series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(series, car.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, series);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", series='" + series + '\'' +
                '}';
    }


}
