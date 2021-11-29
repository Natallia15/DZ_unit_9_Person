public class Person {
    String fullName;
    int age;
    Person(){

    }
    Person (String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public void move () {
        System.out.println(fullName + " ходит" );
    }
    public void talk () {
        System.out.println(fullName + " говорит" );
    }
}
