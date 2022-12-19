public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1988, "Максим", "Минкс", "бренд-менеджером");
        person1.live();
        Person person2 = new Person(1993, "Аня", "Москва" , "методистом образовательных программ");
        person2.live();
        Person person3 = new Person(1992, "Катя", "Калиниград","продакт-менеджером" );
        person3.live();
        Person person4 = new Person(1995, "Артем", "Москва", "директором по развитию бизнеса");
        person4.live();
    }
}