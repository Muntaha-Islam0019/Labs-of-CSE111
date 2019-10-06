class BookDemo
 {
    public static void main(String[] args) {

        Book bookOne = new Book("Developing Java Software", "Russel Winderand", 79.75);

        System.out.println("The title of the book is : " + bookOne.title);
        System.out.println("The author of the book is : " + bookOne.author);
        System.out.println("The price of the book is : " + bookOne.price);

        /* System.out.println(bookOne.toString());
         * Using this method is forbidden for this task. */
    }
}
