import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = lerTeclado.nextLine();

        System.out.print("Digite o gênero (M/F/N): ");
        char genero = lerTeclado.nextLine().charAt(0);

        System.out.print("Digite a altura (em metros): ");
        double altura = lerTeclado.nextDouble();

        System.out.print("Digite o peso (em kg): ");
        double peso = lerTeclado.nextDouble();

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

            default:
                System.out.println("Gênero inválido! Considerando padrão Feminino.");
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
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Gênero: %c%n", genero);
        System.out.printf("IMC: %.2f%n", imc);
        System.out.printf("Classificação: %s%n", classificacao);


        lerTeclado.close();
    }
}