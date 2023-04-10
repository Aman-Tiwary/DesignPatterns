public class MainBuilder {
    public static void main(String[] args) {
        Human human1= new Human.HumanBuilder().setAge(5).setGender("Male").setName("Aman").build();
        human1.printHuman();
    }
}
