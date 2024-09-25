public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Add Cars to the agency
        Car car1 = new Car("1", "CRV", "Honda");
        Car car2 = new Car("2", "Supra", "Toyota");
        Car car3 = new Car("3", "CX5", "Mazda");
        agency.addCar(car1);
        agency.addCar(car2);
        agency.addCar(car3);

        // Add Customers to the agency
        Customer customer1 = new Customer("101", "Ian Kiburio");
        Customer customer2 = new Customer("102", "Juliet");
        Customer customer3 = new Customer("103", "Michael");
        agency.addCustomer(customer1);
        agency.addCustomer(customer2);
        agency.addCustomer(customer3);

        System.out.println("\n--- Renting cars to all customers ---");
        agency.rentCarToCustomer("101");
        agency.rentCarToCustomer("102"); 
        agency.rentCarToCustomer("103"); 

        printCustomerStatus("Status after renting cars", customer1, customer2, customer3);
        printCarStatus("Car status after rentals", car1, car2, car3);
        
        System.out.println("\n--- Returning cars from all customers ---");
        agency.returnCarFromCustomer("101");
        agency.returnCarFromCustomer("102"); 
        agency.returnCarFromCustomer("103"); 

        printCustomerStatus("Status after returning cars", customer1, customer2, customer3);
        printCarStatus("Car status after returns", car1, car2, car3);
    }

    private static void printCustomerStatus(String title, Customer... customers) {
        System.out.println("\n--- " + title + " ---");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    private static void printCarStatus(String title, Car... cars) {
        System.out.println("\n--- " + title + " ---");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
