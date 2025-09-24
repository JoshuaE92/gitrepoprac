// [Joshua Estime]
// Assignment 3
// COP3330
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

   //Constructors, used to create both a blank book or a book with paramaters

    public Book(){
        this.title=" ";
        this.author=" ";
        this.isbn=" ";
        this.isAvailable=true;
    }

    public Book(String title, String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.isAvailable=true;
    }

    //Methods

    //Getters access teh specified object property and return said value

    public String getTitle(){
        return title;
    }

      public String getAuthor(){
        return author;
    }

      public String getIsbn(){
        return isbn;
    }

      public boolean getIsAvailable(){
        return isAvailable;
    }


    public void setTitle(String title){
        this.title=title;

    }

    //Setters acces the specified object property and set said value to desired input

    public void setAuthor(String author){
        this.author=author;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;

    }

    //Utility

    //Checkout, sets the availability to false
    public void checkout(){
        this.isAvailable=false;
    }
    //ReturnBook reverses the checkout proccess
    public void returnBook(){
        this.isAvailable=true;

    }
    //Prints out a specified input if the book is or is not available
    public String getDescription(){
     
        if(this.isAvailable){
            return("Title: "+this.title+", Author: "+this.author+", ISBN: "+this.isbn+" (Available)");
            
        }else{
            return("Title: "+this.title+", Author: "+this.author+", ISBN: "+this.isbn+" (Checked Out)");
            

        }




    }
    








    //Methods

    
    
}
