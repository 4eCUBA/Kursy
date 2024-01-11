import javax.swing.*;
import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int V;

    public Car(String brand, String model, int v) {
        this.brand = brand;
        this.model = model;
        V = v;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getV() {
        return V;
    }

    public void setV(int v) {
        V = v;
    }

    public String toString(){
return  "Car brand: " + brand + " car model: " + model + " V: " + V;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return this.brand.equals(car.brand) && this.model.equals(car.model) && this.V == car.V;
    }*/
   public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null) return false;
       if (!(o instanceof Car)) return false;
       Car car = (Car) o;
       return this.brand.equals(car.brand);
   }


}



