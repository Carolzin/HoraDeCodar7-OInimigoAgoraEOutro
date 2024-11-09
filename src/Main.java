import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        //1 - Baby Steps
        //Escreva um programa em Java e crie uma variável chamada "Planeta" e atribua-a um valor "Plutão".
        //Exiba o valor

        String planeta = "Plutão";
        System.out.println("O nome do planeta é: " + planeta);

        //2 -  Hello Clarice
        //Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]"

        System.out.println("Digite o seu nome: ");
        String nomeDoUsuario = leia.nextLine();
        System.out.println("O seu nome é: " + nomeDoUsuario);

        //3 - A Bit of Information
        //Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

        System.out.println("Digite o seu nome: ");
        String nome = leia.nextLine();
        System.out.println("Digite sua idade: ");
        int idadeDousuario = leia.nextInt();
        System.out.println("Olá, " + nome + " sua idade é: " + idadeDousuario + " anos!");

        //4 - A Bit of Geometry
        //Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.

        //Área retangulo
        System.out.println("Digite o valor da base do retângulo: ");
        int baseRetangulo = leia.nextInt();
        System.out.println("Digite o valor da altura do retângulo: ");
        int alturaRetangulo = leia.nextInt();
        int areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.println("O valor da área do retângulo é: " + areaRetangulo);

        //Área quadrado
        System.out.println("Digite o valor do lado do quadrado");
        int ladoQuadrado = leia.nextInt();
        int areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("A área do quadrado é: " + areaQuadrado);

        //Area losangulo
        System.out.println("Informe o valor da diagonal maior do losango: ");
        float diagonalMaiorLosango = leia.nextFloat();
        System.out.println("Informe o valor da diagonal menor do losango: ");
        float diagonalMenorLosango = leia.nextFloat();
        float areaLosango = diagonalMaiorLosango * diagonalMenorLosango / 2;
        System.out.println("O tamanho da área do losango é: " + areaLosango);

        //Área trapézio
        System.out.println("Informe o valor da base maior do trapézio: ");
        float baseMaiorTrapezio = leia.nextFloat();
        System.out.println("Informe o valor da base menor do trapézio: ");
        float baseMenorTrapezio = leia.nextFloat();
        System.out.println("Informe o valor da altura do trapézio: ");
        float alturaTrapezio = leia.nextFloat();
        float areaTrapezio = baseMenorTrapezio * baseMaiorTrapezio * alturaTrapezio / 2;
        System.out.println("A área do trapézio é: " + areaTrapezio);

        //Área paralelogramo
        System.out.println("Informe o valor da base do paralelograma: ");
        float baseParalelograma = leia.nextFloat();
        System.out.println("Informe a altura do paralelograma: ");
        float alturaParalelograma = leia.nextFloat();
        float areaParalelograma = baseParalelograma * alturaParalelograma;
        System.out.println("A área do paralelograma é: " + areaParalelograma);

        //Área triangulo
        System.out.println("Informe o valor da base do trangulo: ");
        float baseTriangulo = leia.nextFloat();
        System.out.println("Informe o valor da altura do triangulo: ");
        float alturaTriangulo = leia.nextFloat();
        float areaTrianglo = baseTriangulo * alturaTriangulo / 2;
        System.out.println("A área do trianglo é: " + areaTrianglo);

        // Área do círculo
        System.out.println("Informe o raio do círculo: ");
        float raioCirculo = leia.nextFloat();
        double areaCirculo = Math.PI * (raioCirculo * raioCirculo);
        System.out.println("A área do círculo é: " + areaCirculo);

        //5 - 1, 2 e 3
        //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.
        System.out.println("informe um número: ");
        int numero = leia.nextInt();
        if (numero > 0) {
            System.out.println("O número é positivo!");
        } else if (numero < 0) {
            System.out.println("O número é negativo! ");
        } else {
            System.out.println("O número é neutro!");
        }

        //6 - Qual o maior?
        //Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
        System.out.println("Informe o primeiro número: ");
        int numero1 = leia.nextInt();
        System.out.println("Informe o segundo número: ");
        int numero2 = leia.nextInt();
        System.out.println("Informe o terceiro número: ");
        int numero3 = leia.nextInt();
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O " + numero1 + " é o maior entre os números informados!");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O " + numero2 + " é o maior entre os números informados!");
        } else {
            System.out.println("O " + numero3 + " é o maior entre os números informados!");
        }

        //6.1 - Qual o maior? (4 vezes pior)
        //Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles.
        System.out.println("Informe o primeiro número: ");
        int num2 = leia.nextInt();
        System.out.println("Informe o segundo número: ");
        int num3 = leia.nextInt();
        System.out.println("Informe o terceiro número: ");
        int num1 = leia.nextInt();
        System.out.println("Informe o quarto número: ");
        int num4 = leia.nextInt();
        if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println("O " + num1 + " é o maior entre os números informados!");
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            System.out.println("O " + num2 + " é o maior entre os números informados!");
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            System.out.println("O " + num3 + " é o maior entre os números informados!");
        } else {
            System.out.println("O " + num4 + " é o maior entre os números informados!");
        }

        //7.1 - 5 vezes?
        //Faça um programa que leia 5  valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
        System.out.println("Informe o primeiro número: ");
        int valor1 = leia.nextInt();
        System.out.println("Informe o segundo número: ");
        int valor2 = leia.nextInt();
        System.out.println("Informe o terceiro número: ");
        int valor3 = leia.nextInt();
        System.out.println("Informe o quarto número: ");
        int valor4 = leia.nextInt();
        System.out.println("Informe o quinto número: ");
        int valor5 = leia.nextInt();
        int maiorValor = valor1;
        int segundoMaiorValor = valor2;
        if (valor2 > maiorValor) {
            maiorValor = valor2;
            segundoMaiorValor = valor1;
        }
        if (valor3 > maiorValor) {
            segundoMaiorValor = maiorValor;
            maiorValor = valor3;
        } else if (valor3 > segundoMaiorValor) {
            segundoMaiorValor = valor3;
        }
        if (valor4 > maiorValor) {
            segundoMaiorValor = maiorValor;
            maiorValor = valor4;
        } else if (valor4 > segundoMaiorValor) {
            segundoMaiorValor = valor4;
        }
        if (valor5 > maiorValor) {
            segundoMaiorValor = maiorValor;
            maiorValor = valor5;
        } else if (valor5 > segundoMaiorValor) {
            segundoMaiorValor = valor5;
        }
        int soma = maiorValor + segundoMaiorValor;
        System.out.println("A soma dos dois maiores números é: " + soma);

        //8 - Enquanto isso
        //Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo. O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
        System.out.println("Informe o primeiro número: ");
        int numeroPrincipal = leia.nextInt();
        int numeroSecundario;
        do {
            System.out.println("Informe o segundo número (não pode ser zero ou negativo): ");
            numeroSecundario = leia.nextInt();
        } while (numeroSecundario <= 0);
        int resultadoDivisao = numeroPrincipal / numeroSecundario;
        System.out.println("O resultado da divisão é: " + resultadoDivisao);

        // 9-  Cansar de Digitar
        //Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
        System.out.println("Infome 10 valores: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Valor " + i + ": ");
            int numeroInformado = leia.nextInt();
            soma += numeroInformado;
        }
        int mediaNumeros = soma / 10;
        System.out.println("A média dos valores informados é: " + mediaNumeros);

        //10 - Parabéns
        //Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).
        System.out.println("informe as notas do aluno: ");
        float somaNotas = 0;
        int numeroDeNotas = 4;
        System.out.println("Informe as notas das 4 avaliações do aluno: ");
        for (int i = 1; i <= numeroDeNotas; i++) {
            System.out.print("Nota " + i + ": ");
            float nota = leia.nextFloat();
            somaNotas += nota;
        }
        float media = somaNotas / numeroDeNotas;
        System.out.println("A média do semestre é: " + media);
        if (media >= 6.0) {
            System.out.println("PARABÉNS! aluno aprovado!");
        } else {
            System.out.println("Infelizmente, alno reprovado.");
        }

        //11 - BOOOOMMM
        //Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. Escreva a contagem em tela e no final da repetição escreva "EXPLOSÃO".
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("A contagem foi interrompida.");
            }
        }
        System.out.println("EXPLOSÃO");

        //13 - De quanto até quanto?
        //Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.
        System.out.print("Informe o primeiro número (menor): ");
        int primeiroNumero = leia.nextInt();
        System.out.print("Informe o segundo número (maior): ");
        int segundoNumero = leia.nextInt();
        if (primeiroNumero >= segundoNumero) {
            System.out.println("O primeiro número deve ser menor que o segundo.");
        } else {
            int somaAluno = 0;
            int contador = 0;
            for (int i = primeiroNumero; i <= segundoNumero; i++) {
                somaAluno += i;
                contador++;
            }
            double mediaAluno = (double) somaAluno / contador;
            System.out.println("A média aritmética dos números entre " + primeiroNumero + " e " + segundoNumero + " é: " + mediaAluno);
        }
    }
}




