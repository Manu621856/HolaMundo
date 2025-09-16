package cm.ercilla;

import java.util.Scanner;

public class Mensaje {
    public String solicitardatos(String Mensaje){
        System.out.print(Mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

    public void saludar(String nombre) {
System.out.println("Hola %s, bienvenido a java \n", nombre);
    }
}
