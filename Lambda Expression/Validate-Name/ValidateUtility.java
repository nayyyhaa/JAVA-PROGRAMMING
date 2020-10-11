import java.util.*;
import java.util.regex.Pattern;
public class ValidateUtility
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  String en=sc.nextLine();
  String pn=sc.nextLine();
  Validate v=validateEmployeeName();
  if(v.validateName(en))
  System.out.println("Employee name is valid");
  else
  System.out.println("Employee name is invalid");
  Validate v1=validateProductName();
  if(v1.validateName(pn))
  System.out.println("Product name is valid");
  else
  System.out.println("Product name is invalid");
  //System.out.println(v.validateName()+" "+v1.validateName());
}
public static Validate validateEmployeeName()
{
  return (name)->{
  if(Pattern.matches("[a-zA-Z ]{5,20}",name))
  return true;
  else return false;
  };
}
public static Validate validateProductName()
  {
      {
      return (name)->{
      if(Pattern.matches("[a-zA-Z]{1}[0-9]{5}+",name))
      return true;
      else
      return false;
      };
  }
}
