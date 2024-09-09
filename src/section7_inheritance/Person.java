package section7_inheritance;

public class Person {
    // write code here
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty()) {
            return lastName;
        }
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());    // fullName=
        System.out.println("teen= " + person.isTeen());             // teen= false

        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());    // fullName= John
        System.out.println("teen= " + person.isTeen());             // teen= true

        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());    // fullName= John Smith
    }
}