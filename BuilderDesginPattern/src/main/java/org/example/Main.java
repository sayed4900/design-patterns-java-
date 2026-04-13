package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Product p1 = new Product.Builder()
                .id(1)
                .name("Beer")
                .color("green")
                .build();


        Product p2 = new Product.Builder()
                .name("x")
                .build();

        Product p3 =  Product.builder() // Like Lombok
                .name("y")
                .build();

        User user1 = new User.Builder()
                .setId(1)
//                .setName("s")
                .build();
        System.out.println(user1.toString());

        User user2 = User.builder()
                .setName("user2")
                .build();
        System.out.println(user2.toString());
    }
}
