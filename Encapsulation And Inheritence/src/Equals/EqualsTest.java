package Equals;

public class EqualsTest {

    public static void main(String[] args) {
        Person person1 = new Person("Bhartesh", "Girmal", "26/09/1998", 71);
        Person person2 = new Person("Bhartesh", "Girmal", "26/09/1998", 71);

        System.out.println(person1);

        if(person1.equals(person2)){
            System.out.println("Person1 is equals to Person2");
        }
        if(person1 == person2){
            System.out.println("Hashcode of Person1 and Person2 are equal");
        }

        int hash1 = person1.hashCode();
        System.out.println("Hashcode of Person1 Object : "+ hash1);
        int hash2 = person2.hashCode();
        System.out.println("Hashcode of Person2 Object : "+ hash2);

        if(hash1 == hash2){
            System.out.println("Hashcode of Person1 and Person2 are equal");
        }
    }
}


