public class Main {

    public static void main(String []args) {
        User user1 = new User ("123@mail.com",
                "password1","Adam","Smith");

        User guest = new User ("321@ukr.net");
        System.out.println("Shopping as a guest");

        User user2 = new User ("32123@blablabla.com",
                "password", "Joan", "D'Arc");

        Product p1 = new Product ("Rolex", "10 000 USD",
                "666",666);
        Product p2 = new Product ("Parker", "100 USD",
                "645", 0);
        Product p3 = new Product("something that costs five",
                "5 USD", "dsf333", 3);


    }
}
