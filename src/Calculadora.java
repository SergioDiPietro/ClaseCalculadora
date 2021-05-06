public class Calculadora {

// Atributos

    int a;
    int b;

// Constructores

    public Calculadora() {
        a = 0;
        b = 0;
    }

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

// Getters & Setters

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // Métodos

    public int suma() {
        return a+b;
    }

    public int resta() {
        return a-b;
    }

    public double division() {
        return (double)a/b;
    }

    public int valorAbsoluto() {
        return Math.abs(a);
    }

    public double elevar(int exponente) {
        return Math.pow(b, exponente);
    }

    public boolean esPositivo() {
        if (a>0) return true;
        else return false;
    }
}