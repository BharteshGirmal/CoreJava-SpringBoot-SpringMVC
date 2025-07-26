public class StaticKeyWord {

    static  int wheels = 4;

    int myAge = 27;
    String name="bhatresh";

    public static void main(String[] args) {
        System.out.println("Static Keyword in Java");
        System.out.println(wheels);

        StaticKeyWord staticWord = new StaticKeyWord();

        System.out.println("Accessing the Non static variable using object instance in Static method");
        System.out.println(" myAge: "+staticWord.myAge);
        System.out.println("Name: "+staticWord.name);
//            System.out.println(myAge);
//        java: non-static variable myAge cannot be referenced from a static context
//        }catch (error){
//            System.out.println("Cannot Access Non Static variables in Static method");
//        }
    }

    public void myNonStaticMethod(){
        System.out.println("Inside Non Static Method");
        System.out.println("myAge: "+myAge);
        System.out.println("Accessing Static variable in Non Static Method");
        System.out.println("wheels: "+wheels);
    }

}
