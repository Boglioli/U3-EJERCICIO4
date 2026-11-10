public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("juan" , "123");
        estudiante.agregarNotas(8);
        estudiante.agregarNotas(9);
        estudiante.agregarNotas(10);
        estudiante.agregarNotas(-5);
        estudiante.agregarNotas(6);
        System.out.println("promedio final: " + estudiante.calcularPromedio());
    }
}