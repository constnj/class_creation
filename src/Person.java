public class Person {
    String fullName;
    int age;

    public void move() {
        System.out.println("don " + this.fullName + " is walking");
    }

    public void talk() {
        System.out.println("don " + this.fullName + ", aged " + this.age + " is talking");
    }

    public Person() {
        System.out.println("plain Person object is created");
    }

    public Person(String fullName,int age) {
        this.fullName = fullName;
        this.age = age;
        System.out.println( this.fullName + " is born");
    }
}
