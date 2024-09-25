import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;

    public RentalAgency() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Car findAvailableCar() {
        for (Car car : cars) {
            if (!car.isRented()) {
                return car;
            }
        }
        return null;
    }

    public void rentCarToCustomer(String customerId) {
        Customer customer = findCustomerById(customerId);
        if (customer != null) {
            Car car = findAvailableCar();
            if (car != null) {
                customer.rentCar(car);
                car.setRented(true); // Mark the car as rented
                System.out.println("Car rented: " + car.getModel() + " to " + customer.getName());
            } else {
                System.out.println("No cars available.");
            }
        } else {
            System.out.println("Customer not found.");
        }
    }

    public void returnCarFromCustomer(String customerId) {
        Customer customer = findCustomerById(customerId);
        if (customer != null) {
            Car rentedCar = customer.getRentedCar();
            if (rentedCar != null) {
                customer.returnCar();
                rentedCar.setRented(false); // Mark the car as available again
                System.out.println(customer.getName() + " has returned the car: " + rentedCar.getModel());
            } else {
                System.out.println(customer.getName() + " has no rented car to return.");
            }
        } else {
            System.out.println("Customer not found.");
        }
    }

    public Customer findCustomerById(String id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }
}
