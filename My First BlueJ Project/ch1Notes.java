
/**
 * John Aabram
 * 8/23/22
 *Chapter 1 Notes
 *Notes from class
 *Who helped me: 
 *
 * @author (john aabram)
 * @version (a version number or a date)
 */
import java.util.Scanner;//class is last arg
import java.util.Random;




public class ch1Notes
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ch1Notes
     */
    public ch1Notes()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * this is code notes for ch 1
     *
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        
        //basic data types
        int x = 9,y,z; 
        boolean choice = false;
        char letter = 'b';
        float number2 = 9;
        double numer = 8.9, number3;
        short num = 6;
        long numbbbbber = 9999999;
        
        
        //these are Objects
        //Class id         memory    Constructor
        String  word =     new       String("John Aabram");
        Integer number =   new       Integer(47);
        Double  anumber =  new       Double(45.8);
        
        System.out.print(word);
        
    }
}
