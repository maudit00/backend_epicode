package it.epicode.week2.day3;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Harry Potter", "Books", 110);
        Product p2= new Product(2, "Il Signore degli anelli ", "Books", 200);
        Product p3 = new Product(3, "Tre Metri sopra il cielo", "Books", 10);
        Product p4 = new Product(4, "Paperella di gomma", "Baby", 10);
        Product p5 = new Product(5, "Coltellino Svizzero", "Boys", 30);
        Product p6 = new Product(6, "Bavaglino", "Baby", 8);
        Product p7 = new Product(7, " Maglia Squadra del cuore", "Boys", 80);

        Customer c1 = new Customer(1, "Mario Rossi", 2);
        Customer c2 = new Customer(2, "Bruno Giordano", 1);
        Customer c3 = new Customer(3, "Antonio Verdi", 2);
        Customer c4 = new Customer(4, "Maria Cicala", 3);

        Order o1 = new Order(1, "delivered", LocalDate.parse("2021-02-02"), LocalDate.parse("2021-02-05"), List.of(p1,p3,p7), c1);
        Order o2 = new Order(2, "delivered", LocalDate.parse("2021-02-03"), LocalDate.parse("2021-02-05"), List.of(p1,p5,p4), c3);
        Order o3 = new Order(3, "delivered", LocalDate.parse("2023-05-07"), LocalDate.parse("2023-05-17"), List.of(p2,p3,p6), c2);
        Order o4 = new Order(4, "delivered", LocalDate.parse("2023-06-07"), LocalDate.parse("2023-06-17"), List.of(p2,p3,p6), c2);
        Order o5 = new Order(5, "delivered", LocalDate.parse("2021-02-03"), LocalDate.parse("2021-02-05"), List.of(p1,p5,p4), c4);

        LocalDate orderFilterMin = LocalDate.of(2021, Month.FEBRUARY, 01);
        LocalDate orderFilterMax = LocalDate.of(2021, Month.APRIL, 01);

        List<Product> productList = List.of(p1,p2,p3,p4,p5,p6,p7);
        List<Order> orderList = List.of(o1,o2,o3,o4,o5);

        Stream<Product> productStream = productList.stream();

        List<Product> bookOverHundred = productStream.filter(element -> element.getCategory()== "Books" && element.getPrice() > 100).toList();

        printList(bookOverHundred);

        List<Order> babyProductsOrders = orderList.stream().filter(el -> {
            List products =  el.getProducts().stream().filter(product -> product.getCategory() == "Baby").toList();
            if (products.isEmpty()){
                return false;
            }
            return true;
        }).toList();

        printOrders(babyProductsOrders);

        List<Product> boysProducts= productList.stream().filter(element -> element.getCategory() == "Boys").toList();

        printList(boysProducts);
        boysProducts.stream().forEach(el -> el.setPrice(el.discountPrice(10)));
        printList(boysProducts);

        List<Product> tier2 = orderList.stream()
                .filter(order -> order.getOrderDate().isAfter(orderFilterMin) && order.getOrderDate().isBefore(orderFilterMax) && order.getCustomer().getTier() == 2)
                .flatMap(order -> order.getProducts().stream())
                .distinct()
                .toList();


        printList(tier2);
    }

    public static void printList(List<Product> list){
        System.out.println("Stampa lista: ");
        for(Product p:list){
            System.out.println(p);
        }
    }
    public static void printOrders(List<Order> list){
        System.out.println("Stampa ordini: ");
        for(Order p:list){
            System.out.println(p);
        }
    }


}
