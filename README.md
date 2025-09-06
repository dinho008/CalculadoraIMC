#  Calculadora de IMC em Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

Uma aplicação de console simples e interativa, desenvolvida em Java, para calcular o Índice de Massa Corporal (IMC) de um usuário. O programa personaliza a classificação do IMC com base no gênero informado e utiliza códigos de cores ANSI para uma interface mais amigável no terminal.

## ✨ Funcionalidades

- **Cálculo de IMC**: Calcula o IMC com base no peso e altura fornecidos.
- **Entrada Interativa**: Solicita dados do usuário como nome, gênero, altura e peso diretamente no console.
- **Classificação por Gênero**: Utiliza faixas de IMC ligeiramente diferentes para os gêneros Masculino (M) e Feminino/Não-Binário (F/N).
- **Interface Colorida**: Melhora a legibilidade e a experiência do usuário no terminal com textos coloridos.
- **Validação de Entrada**: Realiza verificações básicas para garantir que o gênero e o formato dos números (altura/peso) sejam válidos.
- **Loop de Execução**: Permite que o usuário realize múltiplos cálculos sem precisar reiniciar o programa.
- **Compatibilidade de Decimais**: Aceita tanto vírgula (`,`) quanto ponto (`.`) como separadores decimais.

## ⚙️ Como Funciona

### 1. Entrada de Dados
O programa utiliza a classe `java.util.Scanner` para capturar as entradas do usuário:
- **Nome**: `String`
- **Gênero**: `char` (aceita 'M', 'm', 'F', 'f', 'N', 'n')
- **Altura**: `String` que é convertida para `double`
- **Peso**: `String` que é convertida para `double`

### 2. Cálculo do IMC
O IMC é calculado usando a fórmula padrão:
$$
IMC = \frac{peso}{altura^2}
$$
Onde o peso está em quilogramas (kg) e a altura em metros (m).

### 3. Lógica de Classificação
O programa usa uma estrutura `switch` para aplicar diferentes faixas de classificação de IMC com base no gênero.

**Para Gênero Masculino (`M`):**
| IMC             | Classificação        |
| --------------- | -------------------- |
| ≥ 40            | Obesidade Mórbida    |
| ≥ 30            | Obesidade Moderada   |
| ≥ 25            | Obesidade Leve       |
| ≥ 20            | Normal               |
| < 20            | Abaixo do Normal     |

**Para Gênero Feminino (`F`) ou Não-Binário (`N`):**
| IMC             | Classificação        |
| --------------- | -------------------- |
| ≥ 39            | Obesidade Mórbida    |
| ≥ 29            | Obesidade Moderada   |
| ≥ 24            | Obesidade Leve       |
| ≥ 19            | Normal               |
| < 19            | Abaixo do Normal     |

### 4. Exibição dos Resultados
Após o cálculo, o programa exibe:
- Os dados do usuário (Nome e Gênero).
- O valor do IMC calculado, formatado com duas casas decimais.
- A classificação correspondente, baseada na lógica interna do código.
- Uma legenda com a classificação padrão da **Organização Mundial da Saúde (OMS)** como referência.
- Um aviso destacando que os resultados são para fins de estudo.

## 🚀 Como Usar

### Pré-requisitos
- Ter o **Java Development Kit (JDK)** instalado e configurado no seu sistema.

### Passos para Execução
1. Clone este repositório ou salve o arquivo `CalculadoraIMC.java` em um diretório de sua preferência.

2. Abra um terminal ou prompt de comando e navegue até o diretório onde o arquivo foi salvo.

3. Compile o código-fonte Java com o seguinte comando:
   ```shell
   javac CalculadoraIMC.java
   ```

4. Após a compilação bem-sucedida (que criará um arquivo `CalculadoraIMC.class`), execute o programa:
   ```shell
   java CalculadoraIMC
   ```
5. Siga as instruções exibidas no terminal para inserir seus dados.

## 📸 Exemplo de Uso

```text
Digite o nome: Maria
Digite o gênero (M/F/N): F
Digite a altura (em metros, use vírgula ou ponto): 1,65
Digite o peso (em kg, use vírgula ou ponto): 60

--- Resultado ---
Nome: Maria
Gênero: F
IMC: 22.04
Classificação (padrão do código): Normal

Legenda de classificação (OMS):

- Abaixo do peso: IMC < 18,5
- Peso normal: 18,5 ≤ IMC < 25,0
- Sobrepeso: 25,0 ≤ IMC < 30,0
- Obesidade grau I: 30,0 ≤ IMC < 35,0
- Obesidade grau II: 35,0 ≤ IMC < 40,0
- Obesidade grau III: IMC ≥ 40,0

ATENÇÃO: O resultado é apenas para fins de estudo e não possui validação científica

Deseja calcular novamente? [S/n]: n
```

## ⚠️ Aviso Importante
As classificações de IMC utilizadas na lógica interna deste código são apenas um exemplo para fins didáticos e **não substituem a avaliação de um profissional de saúde**. Para uma análise precisa da sua saúde, consulte um médico ou nutricionista.