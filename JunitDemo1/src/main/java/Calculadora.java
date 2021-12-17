public class Calculadora {
    private double resulFinal;
    public double suma(double primerOperando, double segundoOperando) {
        return resulFinal = primerOperando + segundoOperando;
    }
    public double resta(double primerOperando, double segundoOperando) {
        return resulFinal = primerOperando - segundoOperando;
    }
    public double multiplicacion(double primerOperando, double segundoOperando) {
        return resulFinal = primerOperando * segundoOperando;
    }
    public double division(double primerOperando, double segundoOperando) {
        return resulFinal = primerOperando / segundoOperando;
    }
    public double getResulFinal () {
        return resulFinal;
    }
}
