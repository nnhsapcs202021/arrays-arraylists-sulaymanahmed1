import java.util.ArrayList;
/**
 * Write a description of class ArrayListOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListOperations
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
        String[] newnames = {"Alice", "Bob", "Connie", "David", "Edward", "Fran", "Gomez", "Harry"};
        for (int i = 0; i < newnames.length; i++){
            names.add(newnames[i]);
        }
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(names.size() - 1));
        int number = names.size();
        System.out.println(number);
        System.out.println(names.get(number - 1));
        names.set(0, "Alice B. Toklas");
        System.out.println(names);
        names.add(4, "Doug");
        System.out.println(names);
        for (String initial: names){
            System.out.println(initial);
        }
        
        ArrayList<String> names2 = new ArrayList<String>(names);
        
        names.remove(0);
        System.out.println(names);
        System.out.println(names2);


        

    }
}

