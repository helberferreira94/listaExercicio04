import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double mediaNotas;
        // ação do usuario: digitar as notas
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite a primeira nota: ");
        nota1 = teclado.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = teclado.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = teclado.nextDouble();
        teclado.close();


        mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print("A média das quatro notas bimestrais é " + mediaNotas);




    }
}
