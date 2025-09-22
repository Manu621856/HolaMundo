package cm.ercilla;

public record PersonaRegistro(String nombre, String apellidos) {
    public  String toString(){
        System.out.println("Esta instruccion es inservible");
        return "%s %s" .formatted(nombre, apellidos);
    }

}
