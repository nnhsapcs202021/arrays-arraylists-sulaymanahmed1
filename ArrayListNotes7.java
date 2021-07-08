
/**
 * Write a description of class ArrayListNotes7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListNotes7
{
   public static void main(String[] args){
     // have to write code to "grow" an array
     // ArrayList is a java generic
     // We have to specifiy the type of the elements in the list in angle brackets
     // (<>) after every ArrayList identifier
     // Primitives (int, double, boolean) are not classes and cannot be specified
     // as the type of elements in a Generic. Instead we use corresponding 
     // Wrapper Classes (Integer, Double, Boolean)
     ArrayList<Integer> myList;
       
       
    }
    /**
     * Creates and returns a refernece to an ArrayList of the specified number
     * Int elements where each element is assigned to a raondom value between
     * 1 and range
     * @param size the number of Int elemenets to add to list
     * @param range the range of random values to assign to each eleemtn
     * 
     * @return a referene to the newly created and initialized list
     */
    public static ArrayList<Integer> createRandomIntegerList(int size, int range){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < size; i++){
            int value = (int)(Math.random() * range) + 1;
            /*
             * ArrayList is a java generic
             * 
             * We have to specify the type of elemetnsv b
             * 
             */
    }
   
}
