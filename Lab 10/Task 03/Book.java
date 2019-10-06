public class Book {
    
    private String name;
    private Author author;
    private double price;
    private int qty;
    
    Book (String str1, String str2, String str3, char ch, double d, int i) {
        name = str1;
        author = new Author(str2, str3, ch) ;
        price = d;
        qty = i;
    }
    
    public String getName() {
        return name;
    }
    
    public Author getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double d) {
        price = d;
    }
    
    public int getQty() {
        return qty;
    }
    
    public void setQty(int i) {
        qty = i;
    }
    
    public String toString () {
        String str = author.toString();
        return "'" + this.getName() + "' by " + str;
    }
}