public class Person {
    // Unsere Klassen haben KEINE main-Methode
    public int uniqueID;
    public String firstName;
    public String lastName;
    public int ageInYears;
    public String mailAddress;


    // Methoden innerhalb der Klasse sind MEIST (99%) NICHT static
    public void print() {
        System.out.println("uniqueID = " + uniqueID);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("ageInYears = " + ageInYears);
        System.out.println("mailAddress = " + mailAddress);

    }

    public String fullName(){
        return lastName.toUpperCase() + " " + firstName;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;                 // Code -> Generate -> "Getter und Setter"
    }

    @Override                                       // Code -> Generate -> "toString()"
    public String toString() {
        return "Person{" +
                "uniqueID=" + uniqueID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ageInYears=" + ageInYears +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void changeAge(int newAge) {
        if (newAge > ageInYears && newAge > 0 && newAge < 150) {
            ageInYears = newAge;
        }
        else {
            System.out.println("404 - This age is not correct: " + newAge);
        }
    }



}


