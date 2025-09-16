package cm.ercilla;

public class Holamundo {

    public static void main (String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitardatos("escibre tu nombre");
        msg.saludar(nombre);
    }
}
