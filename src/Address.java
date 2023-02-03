public class Address {
    private String streetName;
    private String streetNumber;
    private String zipCode;
    private String additionalAddressLine;
    private String state;

    public Address(String streetName, String streetNumber, String zipCode, String additionalAddressLine, String state) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.additionalAddressLine = additionalAddressLine;
        this.state = state;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String  getZipCode() {
        return zipCode;
    }

    public String getAdditionalAddressLine() {
        return additionalAddressLine;
    }

    public String getState() {
        return state;
    }
}
