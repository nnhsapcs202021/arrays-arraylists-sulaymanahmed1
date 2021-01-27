
/**
 * Write a description of class ArrayOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayOperations
{
 /** * Write a description of class arrayoperations here. * * @author (your name) * @version (a version number or a date) */ public class ArrayOperations { public static void array(){ double[] x = new double[]{8,4, 5, 21, 7, 9, 18, 2,100}; int arrayLength = x.length; System.out.println(arrayLength); System.out.println(x[0]); System.out.println(x[arrayLength-1]); for(int i=0; i<arrayLength;i++ ){ System.out.println(x[i]); } for(int i=0; i<arrayLength;i++ ){ System.out.println(x[i]+" "+i); } for(int i=8; i>0;i-- ){ System.out.println(x[i]+" "+i); } for ( double y: x){ System.out.println(y); } } }