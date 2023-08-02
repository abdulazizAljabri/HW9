package Abstract;

public class Book extends Product {
    private String author;

    public Book() {

    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
       double discount = getPrice() * 0.05;
       setPrice(getPrice() - discount);
       return discount;
    }

    public String toString() {
        {
            return "BookInfo{" +
                    "author ='" + author + '\'' +
                    ", name='" + getName() + '\'' +
                    ", price after discount =" + getPrice() +
                    '}';
        }
    }
}
