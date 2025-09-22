package cm.ercilla;

public class Holamundo {

    public static void main (String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitardatos("escibre tu nombre");
        String apellidos = msg.solicitardatos("escibre tus apellidos");
        Persona P1 = new Persona(nombre, apellidos);
        msg.saludar(P1);
    }
}
