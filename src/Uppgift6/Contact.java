package Uppgift6;

public class Contact {
    private final String name;
    private final int age;
    private final String phone;

    public Contact(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
