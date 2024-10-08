package estrutura.service;

import org.springframework.stereotype.Service;

@Service
public class ImpostoService {
    public double calcularImposto(double salario) {
        double imposto;
        if (salario < 22847.76) {
            imposto = calcular(salario, 0, 0);
        } else if (salario < 33919.80) {
            imposto = calcular(salario, 0.075, 1713.58);
        } else if (salario < 45012.60) {
            imposto = calcular(salario, 0.15, 4257.57);
        } else if (salario < 55976.16) {
            imposto = calcular(salario, 0.225, 7633.51);
        } else {
            imposto = calcular(salario, 0.275, 10432.32);
        }
        return imposto;
    }
    private double calcular(double salario, double taxa, double deducao){
        double imposto;
        imposto = (salario * taxa) - deducao;
        return imposto;
    }
}

