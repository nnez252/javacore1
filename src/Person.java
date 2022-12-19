public class Person {
    int yearOfBrith;
    String name;
    String town;
    String jobTitel;

    public Person(int yearOfBrith, String name, String town, String jobTitel) {
        if(yearOfBrith >0 ){
            this.yearOfBrith = yearOfBrith;
        }else {
            this.yearOfBrith = Math.abs(yearOfBrith);
        }
        if (name == null) {
            System.out.println("Информация не указана");
        } else {
            this.name = name;
        }
        if (town == null) {
            System.out.println("Информация не указана");
        } else {
            this.town = town;
        }
        if (jobTitel == null) {
            System.out.println("Информация не указана");
        } else {
            this.jobTitel = jobTitel;
        } ;
    }
    void live() {
        System.out.println("Привет! Меня зовут "+ name+". Я из города "+ town+ ". Я родился  в  "+ yearOfBrith +" Я работаю на должности "+jobTitel+ " Будем знакомы!" );
    }
}
