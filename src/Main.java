import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        float areaTrapezio = baseMenorTrapezio * baseMaiorTrapezio * alturaTrapezio /2;
        System.out.println("A área do trapézio é: " + areaTrapezio);







    }
    }

