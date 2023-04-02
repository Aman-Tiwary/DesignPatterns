
public class MainProfession {
    public static void main(String[] args){
       Profession teacher = ProfessionFactory.getProfession("Teacher");
       teacher.printProfession();
       Profession doctor = ProfessionFactory.getProfession("DOCTOR");
       doctor.printProfession();
       Profession engineer = ProfessionFactory.getProfession("EngiNeer");
       engineer.printProfession();
       Profession math = ProfessionFactory.getProfession("math");
       math.printProfession();
       
    }
}
