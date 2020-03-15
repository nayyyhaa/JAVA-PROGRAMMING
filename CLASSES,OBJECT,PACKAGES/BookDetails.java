/*
Create a class Book with the following private member variables

String bookName
int bookPrice 
String authorName
Include appropriate getters and setters method.
Create a class TestBook which has the main method.  Get the details as shown in the sample input. Create an object for book class and assign the value for its attrbutes using the setters.  Print the output as shown in the sample output using the getters method. 

Note: Use the same attribute names as given in the question and camel case notation for methods.  Name of book and author can have space in between.

Sample Input 1:

Enter the Book name:
Java
Enter the price:
500
Enter the Author name:
Einstein

Sample Output 1:

Book Details
Book Name :Java
Book Price :500
Author Name :Einstein
*/
import java.util.Scanner;
class TestBook
{
  public static void main (String[] args) {
    Scanner s=new Scanner(System.in);
    Book b=new Book();
    System.out.println("Enter the Book name:");
    String name=s.nextLine();
    System.out.println("Enter the price:");
    int price=s.nextInt();
    System.out.println("Enter the Author name:");
    String aname=s.next();
    aname+=s.nextLine();
    b.setBookName(name);
    b.setBookPrice(price);
    b.setAuthorName(aname);
    System.out.println("Book Details");
    System.out.println("Book Name :"+b.getBookName());
    System.out.println("Book Price :"+b.getBookPrice());
    System.out.println("Author Name :"+b.getAuthorName());
  }
}

public class Book
{
  private String bookName;
  private int bookPrice;
  private String authorName;
  public void setBookName(String sname)
  {
    this.bookName=sname;
  }
  public void setBookPrice(int sprice)
  {
    this.bookPrice=sprice;
  }
  public void setAuthorName(String saname)
  {
    this.authorName=saname;
  }
  public String getBookName(){
    return bookName;
  }
  public int getBookPrice(){
    return bookPrice;
  }
  public String getAuthorName(){
    return authorName;
  }
}
