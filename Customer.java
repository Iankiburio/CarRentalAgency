public class Customer {
    private String id;
    private String name;
    private Car rentedCar;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void rentCar(Car car) {
        this.rentedCar = car;
    }

    public void returnCar() {
        this.rentedCar = null;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Customer ID: %s | Name: %s | Rented Car: %s",
                id, name, rentedCar != null ? rentedCar.getModel() : "None");
    }
}
