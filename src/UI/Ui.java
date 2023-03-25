package UI;

import java.util.Scanner;

public class Ui {
    private final Scanner sc = new Scanner(System.in);
    public String obtainWord(){
        System.out.println("---Menu Diccionario---");
        System.out.println("Ingrese su palabra... U oracion");
        return sc.nextLine();
    }
    public int obtainLenguageTo(){
        System.out.println("Ingrese a que idioma desea traducir: ");
        System.out.println("1. Español");
        System.out.println("2. Ingles");
        System.out.println("3. Frances");
        return sc.nextInt();
    }
    public void print(String text){
        System.out.println(text);
    }
}
