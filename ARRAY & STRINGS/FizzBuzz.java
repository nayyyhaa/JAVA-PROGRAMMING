public class FizzBuzz
{
    // algorithm replaces multiples of 3 with 'Fizz'
    // multiples of 5 are replaced with 'Buzz'
    // if a number is a multiple of both it will print 'FizzBuzz'
    public static void main(String[] args)
    {
        for (int i = 1; i < 101; i++)// loops through body 100 times
        {
            if(i % 5 == 0)// % or mod checks for remainders
            {
                if(i % 3 == 0)// nested conditional to check if both instances are true
                    System.out.println("FizzBuzz");
                else
                    System.out.println("Buzz");
            }
            else
            {
                if(i % 3 == 0)
                    System.out.println("Fizz");
                else
                    System.out.println(i);
            }
        }// end of for loop
    }
}
