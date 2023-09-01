//PART_02
package oop_lab_work;

import java.util.ArrayList;

public class Book_Store 
{
        
    private final ArrayList < Book > books;

    public Book_Store() 
    {
        books = new ArrayList <  > ();
    }
    
    //book_add
    public void addBook(Book book) 
    {
        books.add(book);
    }
    
    //book_remove
    public void removeBook(Book book) 
    {
        books.remove(book);
    }

    public ArrayList < Book > getBooks() 
    {
       return books;
    }
}
