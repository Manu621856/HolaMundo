package cm.ercilla;

public record PersonaRegistro(String nombre, String apellidos) {
    public  String toString(){
        return "%s %s" .formatted(nombre, apellidos);
    }

}
