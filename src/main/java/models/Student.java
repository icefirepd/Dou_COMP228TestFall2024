package models;

public class Student {
    private String studentID;
    private String fName;
    private String lName;
    private String address;
    private String city;
    private String province;
    private String postalCode;

    public String getStudentID() {return studentID; }
    public void setStudentID(String studentID) {this.studentID = studentID; }

    public String getFirstName() {return fName; }
    public void setFirstName(String firstName) {this.fName = firstName; }

    public String getLastName() {return lName; }
    public void setLastName(String lastName) {this.lName = lastName; }

    public String getAddress() {return address; }
    public void setAddress(String address) {this.address = address; }

    public String getCity() {return city; }
    public void setCity(String city) {this.city = city; }

    public String getProvince() {return province; }
    public void setProvince(String province) {this.province = province; }

    public String getPostalCode() {return postalCode; }
    public void setPostalCode(String postalCode) {this.postalCode = postalCode; }
}