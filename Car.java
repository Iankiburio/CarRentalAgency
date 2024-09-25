public class Car {
    private String id;
    private String model;
    private String make;
    private boolean rented; // Add a rented status

    public Car(String id, String model, String make) {
        this.id = id;
        this.model = model;
        this.make = make;
        this.rented = false; 
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    @Override
    public String toString() {
        return String.format("Car ID: %s | Make: %s | Model: %s | Rented: %s",
                id, make, model, rented ? "Yes" : "No");
    }

    public String getModel() {
        return model;
    }
}
