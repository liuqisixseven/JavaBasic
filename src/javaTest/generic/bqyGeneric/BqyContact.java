package javaTest.generic.bqyGeneric;

public class BqyContact implements BqyInfo{
    private String address;
    private String phoneNumber;
    private String zipcode;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public BqyContact(String address,String phoneNumber,String zipcode){
        //super();
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "BqyContact{" +
                "address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
