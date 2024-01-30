package HWenum;

import java.util.Date;

public class Bus {
    private String brand;
    private String model;
    private int year;

    public Bus() {
    }

    public Bus(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()){
            throw new InvalidBrandException("Марка автобуса не може бути пустою");
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()){
            throw new InvalidModelException("Модель автобуса не може бути пустою");
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1900 || year > 2024){
            throw new InvalidYearException("Рік випуску задано не коректно");
        }
        this.year = year;
    }
}
