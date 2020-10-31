import java.util.*;
import java.util.Random;
/**
 * This prints a random number from 0-100.
 *
 * @author (Simon Bech)
 * @version (1.0)
 */
public class RandomN
{
    Random gen;
    int index = 0;
    
    /**
     * This is the constructor which initializes the Random class from Java Librariy and
     * saves it in the field constructor
     */
    public RandomN(){
        gen = new Random();
        this.gen = gen;
    }

    /**
     * This prints out one random number from 0 to 100
     */
    public void printOneRandom(){
        int index = gen.nextInt(100);
        System.out.println(index);
    }
}
