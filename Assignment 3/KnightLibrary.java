// [Joshua Estime]
// Assignment 3
// COP3330
public class KnightLibrary {
   
    public static void main(String[] args) {
        //Creating my books

        //Book 1 creates a new instance of the book class
       Book book1 =new Book();
    
       //Set properties of book 1
       book1.setTitle("The Hitchhiker's Guide to the Galaxy");
       book1.setAuthor("Douglas Adams");
       book1.setIsbn("978-0-345-39180-3");

       //Create book 2 and three but this time use paramaterized inputs
       Book book2=new Book("Dune","Frank Herbert","978-0-441-17271-9");

       Book book3= new Book("1984","George Orwell","978-0-451-52493-5");

       //Call utility methods, check out and return
       book2.checkout();
       book3.returnBook();

        //Print details using getDescription
       System.out.println("Book 1 Details:");
       System.out.println(book1.getDescription());
       System.out.println("------------------------");
       System.out.println("Book 2 Details:");
       System.out.println(book2.getDescription());
       System.out.println("------------------------");
       System.out.println("Book 3 Details:");
       System.out.println(book3.getDescription());
       System.out.println("------------------------");








        
    }



    
    
}
