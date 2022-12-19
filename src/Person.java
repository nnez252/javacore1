public class Person {
    int yearOfBrith;
    String name;
    String town;
    String jobTitel;
    void live() {
        System.out.println("Привет! Меня зовут "+ name+". Я из города "+ town+ ". Я родился  в  "+ yearOfBrith +" Я работаю на должности "+jobTitel+ " Будем знакомы!" );
    }
    public Person(int yearOfBrith, String name, String town, String jobTitel) {
        this.yearOfBrith = yearOfBrith;
        this.name = name;
        this.town = town;
        this.jobTitel = jobTitel;
    }
}
