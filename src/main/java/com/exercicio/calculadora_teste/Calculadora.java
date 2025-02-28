package com.exercicio.calculadora_teste;

public class Calculadora {

    public double calcular(double numero1, double numero2, int operacao) throws Exception {
        switch (operacao) {
            case 1: // Adição
                return numero1 + numero2;
            case 2: // Subtração
                return numero1 - numero2;
            case 3: // Multiplicação
                return numero1 * numero2;
            case 4: // Divisão
                if (numero2 == 0) {
                    throw new Exception("Erro: Divisão por zero não é permitido!");
                }
                return numero1 / numero2;
            case 5: // Porcentagem
                return numero1 * numero2 / 100;
            default:
                throw new Exception("Operação inválida!");
        }
    }
}
