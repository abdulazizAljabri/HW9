package Abstract;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
     Book book1 = new Book("book1", 100, " Abdulaziz");
        System.out.println(" The discount is : "+book1.getDiscount());
        System.out.println(book1.toString());
        System.out.println("-----------------------");
        Movie movie1 = new Movie("movie1", 50, "Abdulaziz");
        System.out.println(" The discount is : "+movie1.getDiscount());
        System.out.println(movie1.toString());
    }
}