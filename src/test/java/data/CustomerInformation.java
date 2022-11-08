package data;

public enum CustomerInformation {
    CUSTOMER_1("John", "Doe", "12345");

    private String firstName;
    private String lastName;
    private String zip;

    CustomerInformation(String firstName, String lastName, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zip = zip;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getZip() {
        return this.zip;
    }

    @Override
    public String toString() {
        return String.format("%s %s - %s", firstName, lastName, zip);
    }
}
