package cm.ercilla;

public record PersonaRegistro(String nombre, String apellidos) {
    public  String toString(){
        //juan comento la linea que se puede eliminar
        //System.out.println("Esta instruccion es inservible");
        return "%s %s" .formatted(nombre, apellidos);
    }

}
