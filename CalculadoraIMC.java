import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);

        final String RESET = "\u001B[0m";
        final String VERMELHO = "\u001B[31m";
        final String VERDE = "\u001B[32m";
        final String AMARELO = "\u001B[33m";
        final String AZUL = "\u001B[34m";
        final String ROXO    = "\u001B[35m";    

        System.out.print(AZUL + "Digite o nome: " + RESET);
        String nome = lerTeclado.nextLine();

        System.out.print(AZUL + "Digite o gênero (M/F/N): " + RESET);
        char genero = lerTeclado.nextLine().charAt(0);

        if (genero != 'M' && genero != 'm' &&
            genero != 'F' && genero != 'f' &&
            genero != 'N' && genero != 'n') {
            System.out.println(VERMELHO + "Opção inválida! Digite apenas M, F ou N.\n" + RESET);
            main(args); 
            return;     
        }

        System.out.print(AZUL + "Digite a altura (em metros, use vírgula ou ponto): " + RESET);
        String alturaStr = lerTeclado.nextLine();

        if (!alturaStr.contains(",") && !alturaStr.contains(".")) {
        System.out.println(VERMELHO + "Formato inválido! Digite usando vírgula ou ponto (ex: 1,80)." + RESET);
        lerTeclado.close();
        return;
        }

        alturaStr = alturaStr.replace(",", ".");
        double altura = Double.parseDouble(alturaStr);

        System.out.print(AZUL + "Digite o peso (em kg, use vírgula ou ponto): " + RESET);
        String pesoStr = lerTeclado.nextLine();

        if (!pesoStr.contains(",") && !pesoStr.contains(".")) {
        System.out.println(VERMELHO + "Formato inválido! Digite usando vírgula ou ponto (ex: 70,5)." + RESET);
        lerTeclado.close();
        return;
        }

        pesoStr = pesoStr.replace(",", ".");
        double peso = Double.parseDouble(pesoStr);

        double imc = peso / (altura * altura);
        String classificacao = "";

        switch (genero) {
            case 'M':
            case 'm':
                if (imc >= 40) {
                    classificacao = "Obesidade Mórbida";
                } else if (imc >= 30) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 25) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 20) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do Normal";
                }
                break;

            case 'F':
            case 'f':
            case 'N':
            case 'n':
                if (imc >= 39) {
                    classificacao = "Obesidade Mórbida";
                } else if (imc >= 29) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 24) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 19) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do Normal";
                }
                break;
        }

        System.out.println("\n--- Resultado ---");
        System.out.printf(AZUL + "Nome: %s%n" + RESET, nome);
        System.out.println(VERDE + "Gênero: " + Character.toUpperCase(genero) + RESET);
        System.out.printf(AMARELO + "IMC: %.2f%n" + RESET, imc);
        System.out.printf(ROXO + "Classificação: %s%n" + RESET, classificacao);
        System.out.println(VERMELHO + "ATENÇÃO: O resultado é apenas para fins de estudo e não possui validação científica" + RESET);


        lerTeclado.close();
    }
}
