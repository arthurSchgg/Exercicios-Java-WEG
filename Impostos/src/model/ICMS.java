package model;

public class ICMS implements Impostos{

    @Override
    public double calcular(double valor) {
        double imposto = valor * 0.18;
        System.out.println("Calculando ICMS...");
        return imposto;
    }
}
