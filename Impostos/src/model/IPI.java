package model;

public class IPI implements Impostos{

    @Override
    public double calcular(double valor) {
        double imposto = valor * 0.10;
        System.out.println("Calculando ICMS...");
        return imposto;
    }
}
