public class Human {
    private String gender;
    private int age;
    private String name;
    Human(HumanBuilder humanBuilder){
        this.name = humanBuilder.name;
        this.gender= humanBuilder.gender;
        this.age=humanBuilder.age;
    }
    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    public int getAge(){
        return this.age;
    }
    public void printHuman(){
        System.out.println("Name-"+this.name+" Age-"+this.age+" Gender-"+gender);
    }
    public static class HumanBuilder{
        public String name;
        private String gender;
        private int age;

        public HumanBuilder setName(String name){
            this.name=name;
            return this;
        }
        public HumanBuilder setGender(String gender){
            this.gender=gender;
            return this;
        }
        public HumanBuilder setAge(int age){
            this.age=age;
            return this;
        }
        public String getName(){
            return name;
        }
        public String getGender(){
            return gender;
        }
        public int getAge(){
            return age;
        }
        public Human build() {
            return new Human(this);
        }
    }
}
