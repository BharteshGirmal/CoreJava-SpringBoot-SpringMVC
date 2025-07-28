public class Student {

    String name;
    int age;

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return ("This is a Student Class with\nName :"+this.name+"\nAge : "+this.age);
    }
}
