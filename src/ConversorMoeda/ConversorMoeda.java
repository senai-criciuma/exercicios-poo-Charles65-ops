package ConversorMoeda;

public class ConversorMoeda implements
        ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double valor) {
        double real = valor * 5.44;
        return real;
    }
}
