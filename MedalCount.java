
/**
 * Write a description of class MedalCount here.
 *
 * @author Sulayman Ahmed
 * @version 29jan2021
 */
public class MedalCount
{
   final int COUNTRIES = 7;
   final int MEDALS = 3;
   
   private int[][] counts = new int[][]
   {
       {1, 0, 1 },
       {1, 1, 0},
       {0, 1, 0},
       {1, 1, 0},
       {0, 1, 1}, 
       {0, 0, 0},
       {1, 1, 1}
       
       
};

public MedalCount(){
    /*
     * Alternate way to create 2D array, initialization followed by nested loops to initalize each element
     * 
     */
    }
    
    public void printTable()
    {
       
        //good: for (int row = 0; row < COUNTRIES; row++)
        // better:
        for(int row = 0; row < this.counts.length]; row++)
        {
            for(int col = 0; col < this.counts[row].length; col++)
            {
                System.out.print(this.counts[row][col] + "\t");
            }
        }
    }
    public int sumMedalsForCountry(int countyIndex)
    {
        int sum = 0;
        for(int col = 0; col < this.counts[countyIndex].length; col
        ++)
        {
            sum += this.counts[countryIndex][col];
        }
    return sum;
    }
    
    public int sumMedalsforType(int medalIndex){
        int sum = 0;
        for(int row = 0; row < this.counts.length; row++)
        {
            sum += this.counts[row][medalIndex];
        }
        return sum;
    }


}