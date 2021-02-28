package pl.radekcholuj.javafaker;

import com.github.javafaker.Faker;

public class JavaFakerExample {
    public static void main(String[] args) {
        int size = 300_000;
        Address[] addresses = new Address[size];
        Faker faker = new Faker();

        // generate
        for (int i = 0; i < addresses.length ; i++) {
            String city = faker.address().city();
            String street = faker.address().streetName();
            String houseNumber = faker.address().buildingNumber();
            addresses[i] = new Address(city, street, houseNumber);
        }

        // display
        for (Address address:addresses) {
            System.out.println(address);
        }
    }
}
