/**
 * 
 */
package calculadora;

/**
 * Clase CalculadoraEjemplo que realiza operaciones matem�ticas b�sicas
 * como suma, resta, multiplicaci�n y divisi�n.
 * <p>
 * Esta clase contiene atributos para dos operandos y el resultado, y m�todos
 * para ejecutar cada una de las operaciones. La clase est� dise�ada para ser utilizada
 * desde un programa principal (main).
 * </p>
 * 
 * @author Yudi Zarate
 * @version 1.0
 * @since 2024-11-04
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {

    /** Primer operando para las operaciones matem�ticas. */
    private double operando1;

    /** Segundo operando para las operaciones matem�ticas. */
    private double operando2;

    /** Resultado de la �ltima operaci�n realizada. */
    private double total;

    /**
     * Constructor para inicializar los operandos de la calculadora.
     *
     * @param operando1 El primer n�mero para las operaciones.
     * @param operando2 El segundo n�mero para las operaciones.
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
        total = operando1 + operando2;
        return total;
    }

    /**
     * Realiza la resta de operando1 y operando2.
     *
     * @return El resultado de la resta.
     */
    public double restar() {
        total = operando1 - operando2;
        return total;
    }

    /**
     * Realiza la multiplicaci�n de operando1 y operando2.
     *
     * @return El resultado de la multiplicaci�n.
     */
    public double multiplicar() {
        total = operando1 * operando2;
        return total;
    }

    /**
     * Realiza la divisi�n de operando1 entre operando2.
     * Si operando2 es cero, muestra un mensaje de error y retorna NaN.
     *
     * @return El resultado de la divisi�n, o NaN si operando2 es cero.
     */
    public double dividir() {
        if (operando2 != 0) {
            total = operando1 / operando2;
            return total;
        } else {
            System.out.println("Error: Divisi�n por cero.");
            return Double.NaN;
        }
    }

    /**
     * Muestra el resultado de una operaci�n en consola.
     *
     * @param operacion El nombre de la operaci�n realizada.
     */
    public void mostrarResultado(String operacion) {
        System.out.println("Resultado de la " + operacion + ": " + total);
    }

    /**
     * Obtiene el resultado de la �ltima operaci�n realizada.
     *
     * @return El resultado de la �ltima operaci�n.
     */
    public double getResultado() {
        return total;
    }

    /**
     * M�todo principal para probar la clase CalculadoraEjemplo.
     * Crea un objeto de la clase y ejecuta cada una de las operaciones b�sicas.
     *
     * @param args Argumentos de l�nea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear objeto de CalculadoraEjemplo con valores de prueba
        CalculadoraEjemplo calc = new CalculadoraEjemplo(15, 5);

        // Realizar y mostrar cada operaci�n
        calc.sumar();
        calc.mostrarResultado("suma");

        calc.restar();
        calc.mostrarResultado("resta");

        calc.multiplicar();
        calc.mostrarResultado("multiplicaci�n");

        calc.dividir();
        calc.mostrarResultado("divisi�n");
    }
}
