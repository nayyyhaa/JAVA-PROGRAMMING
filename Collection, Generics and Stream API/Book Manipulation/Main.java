import java.util.*;
public class Main{
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int ch;
        Library obj1=new Library();
        do{
            System.out.println("1.Add Book\n2.Display all book details\n3.Search Book by author\n4.Count number of books -by book name\n5.Exit");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    Book obj=new Book();
                    System.out.println("Enter the isbn no:");
                    obj.setIsbnno(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Enter the book name:");
                    obj.setBookName(sc.nextLine());
                    System.out.println("Enter the author name:");
                    obj.setAuthor(sc.nextLine());
                    obj1.addBook(obj);
                    break;
                case 2:
                    ArrayList<Book> AllBooks=new ArrayList<Book>();
                    AllBooks=obj1.viewAllBooks();
                    for(Book obb:AllBooks)
                    System.out.println("ISBN no:"+obb.getIsbnno()+"\nBook name:"+obb.getBookName()+"\nAuthor name:"+obb.getAuthor());
                    break;
                case 3:
                    ArrayList<Book> allB=new ArrayList<Book>();
                    System.out.println("Enter the author name:");
                    String str=sc.nextLine();
                    allB=obj1.viewBooksByAuthor(str);
                    if(allB.size()==0)
                        System.out.println("None of the book published by the author "+str);
                    else
                        for(Book objAuthor:allB)
                        System.out.println("ISBN no:"+objAuthor.getIsbnno()+"\nBook name:"+objAuthor.getBookName()+"\nAuthor name:"+objAuthor.getAuthor());
                        break;
                case 4:
                    System.out.println("Enter the book name");
                    String myName=sc.nextLine();
                    int res=obj1.countnoofbook(myName);
                    System.out.println("Count is "+res);
                    break;
                case 5:
                    break;
            }
        }while(ch!=5);
    }
}