public class Main {

    public static void main(String []args) {
        User user1 = new User ("123@mail.com",
                "password1","Adam","Smith");
        System.out.println(user1.getName() + " " + user1.getLastName());

        User guest = new User ("321@ukr.net");
        System.out.println("Shopping as a guest");

        User user2 = new User ("32123@blablabla.com",
                "password", "Joan", "D'Arc");
        System.out.println(user2.getName() + " " + user2.getLastName());

        Product p1 = new Product ("Rolex", "10 000 USD",
                "666",666);
        System.out.println();
        Product p2 = new Product ("Parker", "100 USD",
                "645");
        Product p3 = new Product("something that costs five",
                "5 USD", "dsf333", 3);
        System.out.println(p3.getNumberOfItems());


    }
}
