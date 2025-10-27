package strategy;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contexte contexte = new Contexte();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("wich startegy you want ?");
            String strName = scanner.next();
            if(strName.equals("q"))break;
            try{
                Class<?> clazz = Class.forName(strName);
                Strategy str = (Strategy) clazz.getDeclaredConstructor().newInstance();
                contexte.setStrategie(str);
                contexte.effectuerStrategy();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
