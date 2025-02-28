package com.exercicio.calculadora_teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculadoraTesteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculadoraTesteApplication.class, args);

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha a operação: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Porcentagem");
            int operacao = scanner.nextInt();

            System.out.println("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.println("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            double resultado = 0;
            boolean operacaoValida = true;

            switch (operacao) {
                case 1: // Adição
                    resultado = numero1 + numero2;
                    break;
                case 2: // Subtração
                    resultado = numero1 - numero2;
                    break;
                case 3: // Multiplicação
                    resultado = numero1 * numero2;
                    break;
                case 4: // Divisão
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        operacaoValida = false;
                    }
                    break;
                case 5: // Porcentagem
                    resultado = (numero1 * numero2) / 100;
                    break;
                default:
                    System.out.println("Operação inválida!");
                    operacaoValida = false;
            }

            if (operacaoValida) {
                System.out.println("Resultado: " + resultado);
            }

            System.out.println("Deseja realizar outra operação? (s/n)");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
                System.out.println("Programa encerrado!");
            }
        }
        scanner.close();
    }
}
