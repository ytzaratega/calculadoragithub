/**
 * 
 */
package calculadora;

/**
 * Clase CalculadoraEjemplo que realiza operaciones matemáticas básicas
 * como suma, resta, multiplicación y división.
 * <p>
 * Esta clase contiene atributos para dos operandos y el resultado, y métodos
 * para ejecutar cada una de las operaciones. La clase está diseñada para ser utilizada
 * desde un programa principal (main).
 * </p>
 * 
 * @author Yudi Zarate
 * @version 1.0
 * @since 2024-11-03
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {

    /** Primer operando para las operaciones matemáticas. */
    private double operando1;

    /** Segundo operando para las operaciones matemáticas. */
    private double operando2;

    /** Resultado de la última operación realizada. */
    private double resultado;

    /**
     * Constructor para inicializar los operandos de la calculadora.
     *
     * @param operando1 El primer número para las operaciones.
     * @param operando2 El segundo número para las operaciones.
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Realiza la suma de operando1 y operando2.
     *
     * @return El resultado de la suma.
     */
    public double sumar() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Realiza la resta de operando1 y operando2.
     *
     * @return El resultado de la resta.
     */
    public double restar() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Realiza la multiplicación de operando1 y operando2.
     *
     * @return El resultado de la multiplicación.
     */
    public double multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Realiza la división de operando1 entre operando2.
     * Si operando2 es cero, muestra un mensaje de error y retorna NaN.
     *
     * @return El resultado de la división, o NaN si operando2 es cero.
     */
    public double dividir() {
        if (operando2 != 0) {
            resultado = operando1 / operando2;
            return resultado;
        } else {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
    }

    /**
     * Muestra el resultado de una operación en consola.
     *
     * @param operacion El nombre de la operación realizada.
     */
    public void mostrarResultado(String operacion) {
        System.out.println("Resultado de la " + operacion + ": " + resultado);
    }

    /**
     * Obtiene el resultado de la última operación realizada.
     *
     * @return El resultado de la última operación.
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * Método principal para probar la clase CalculadoraEjemplo.
     * Crea un objeto de la clase y ejecuta cada una de las operaciones básicas.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear objeto de CalculadoraEjemplo con valores de prueba
        CalculadoraEjemplo calc = new CalculadoraEjemplo(10, 5);

        // Realizar y mostrar cada operación
        calc.sumar();
        calc.mostrarResultado("suma");

        calc.restar();
        calc.mostrarResultado("resta");

        calc.multiplicar();
        calc.mostrarResultado("multiplicación");

        calc.dividir();
        calc.mostrarResultado("división");
    }
}
