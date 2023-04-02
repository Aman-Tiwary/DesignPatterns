import javax.naming.NameNotFoundException;

public class ProfessionFactory {
    public static Profession getProfession(String professionType){
        if(professionType == null){
            return null;
        }
        else if(professionType.equalsIgnoreCase("doctor"))
        {
            return new Doctor();
        }
        else if(professionType.equalsIgnoreCase("engineer"))
        {
            return new Engineer();
        }
        else if(professionType.equalsIgnoreCase("teacher"))
        {
            return new Teacher();
        }
        return null;
    }
}
