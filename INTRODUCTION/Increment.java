/*
The increment is done based on the salary and the performance appraisal rating.

If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
If the appraisal rating is between 3.1 and 4, the increment is  25% of the salary.
If the appraisal rating is between 4.1 and 5, the increment is  30% of the salary.
Help them to do this,  by writing a program that displays the incremented salary.

Note   :   If either the salary is 0 or negative  (or) if the appraisal rating is not in the range 1 to 5 (inclusive), then the output should be “Invalid Input”.

Sample Input 1 :

Enter the salary

8000

Enter the Performance appraisal rating

3

Sample Output  1 :

8800

 

Sample Input  2 :

Enter the salary

7500

Enter the Performance appraisal rating

4.3

Sample Output  2 :

9750



Sample Input  3 :

Enter the salary

-5000

Enter the Performance appraisal rating

6

Sample Output  3 :

Invalid Input

*/

import java.util.Scanner;
class IncrementCalculation
{
  public static void main (String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the salary");
    float salary=s.nextFloat();
    System.out.println("Enter the Performance appraisal rating");
    float app=s.nextFloat();
    if(salary>0 && app>=1 && app<=5)
    {
      if(app>=1 && app<=3)
        salary+=(salary*0.1);
      else if(app>3 && app<=4)
        salary+=(salary*0.25);
      else
        salary+=(salary*0.3);
      System.out.println((int)salary);
    }
    else
      System.out.println("Invalid Input");
    }
}
