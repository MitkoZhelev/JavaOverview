package DefiningClasses;

import java.lang.reflect.Field;

public class DefineClass {
    public static void main (String [] args) throws Exception
    {
       Class person = Personj.class;
       Field [] fields = person.getDeclaredFields();
        System.out.println(fields.length);
        Personj pers = new Personj();
        Personj pers2 = new Personj(5);
        Personj pers3 = new Personj(5, "Mitko");
        System.out.println(pers.getAge() + pers.getName());
        System.out.println(pers2.getAge() + pers2.getName());
        System.out.println(pers3.getName() + pers3.getAge());
    }
}
