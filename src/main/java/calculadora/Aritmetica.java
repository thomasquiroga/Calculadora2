package calculadora;

public class Aritmetica {
    double a;
    double b;
    double resultado;

    public double sumar(){
      resultado = a + b;
      return resultado;
    }
    public double restar(){
        resultado = a - b;
        return resultado;
    }
    public double dividir(){
        resultado = a / b;
        return resultado;
    }
    public double multiplicar(){
        resultado = a * b;
        return resultado;
    }

}
