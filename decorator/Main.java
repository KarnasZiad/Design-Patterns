package decorator;

public class Main {
    public static void main(String[] args) {
        Boisson boisson = new Expresso(); // 10
        System.out.println("---------------"+ boisson.getDescription());
        System.out.println("------------------------------------------");
        boisson = new Caramel(boisson); // 3
        System.out.println("---------------"+ boisson.getDescription());
        boisson = new Chocolat(boisson); // 2
        System.out.println("---------------"+ boisson.getDescription());
        boisson = new Chocolat(boisson);
        System.out.println("---------------"+ boisson.getDescription());

        System.out.println("cout final = "+ boisson.cout());

//        Boisson boisson2 = new Sumatra();
//        System.out.println("---------------"+ boisson2.getDescription());
//        boisson2 = new Caramel(boisson2);
//        System.out.println("---------------"+ boisson2.getDescription());
    }
}
