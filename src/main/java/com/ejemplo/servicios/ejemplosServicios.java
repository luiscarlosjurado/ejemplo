public class ejemplosServicios {

    public static String saludar(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return "Hola, usuario";
        }
        return "Hola, " + nombre.trim();
    }

    public static int sumar(int primerNumero, int segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public static void main(String[] args) {
        System.out.println(saludar("Ana Sofía"));
        System.out.println("Resultado: " + sumar(5, 3));
    }
}