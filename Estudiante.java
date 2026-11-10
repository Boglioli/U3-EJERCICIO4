public class Estudiante {
    private String nombre;
    private String legajo;
    private double[] notas;
    private int cantidadNotas;
    public Estudiante(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.notas = new double[10];
        this.cantidadNotas = 0;
    }
    public void agregarNotas(double nota) {
        if (nota >= 0 && nota <= 10) {
            if (cantidadNotas < notas.length) {
                notas[cantidadNotas] = nota;
                cantidadNotas++;
                System.out.println("nota agregada correctamente");
            } else {
                System.out.println("error: no se pueden agregar mas notas");
            }
        } else {
            System.out.println("error: la nota debe estar entre 0 y 10");
        }
    }
    public double calcularPromedio() {
        if (cantidadNotas == 0) {
            return 0;
        }
        double suma = 0;
        for (int i = 0; i < cantidadNotas; i++) {
            suma = suma + notas[i];
        }
        return suma / cantidadNotas;
    }
}
