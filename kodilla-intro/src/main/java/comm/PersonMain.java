package comm;

public class PersonMain {
    public static void main(String[] args) {
        Person application = new Person("Adam", 40.5, 178);
        System.out.println(application.name + " " + application.age + " " + application.height);
        application.checkUser();
    }
}