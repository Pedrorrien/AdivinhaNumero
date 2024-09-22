import java.util.Random; 
import java.util.Scanner;

public class jogoAdivinha {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int numeroSorteado = aleatorio.nextInt(101);
        
        Scanner lerTeclado = new Scanner(System.in);
        int vidas = 10;
        boolean acertou = false;
        System.out.println("Bem Vindo ao Jogo de Adivinhação! Você possui 10 tentativas!");

        while(vidas > 0){
            System.out.println("Digite o número: ");
            int numeroChutado = lerTeclado.nextInt();
            lerTeclado.nextLine();
            if (numeroChutado == numeroSorteado){
                acertou = true;
                vidas = vidas - 1;
                break;
            } else if (numeroChutado > numeroSorteado){
                System.out.println("O número sorteado é menor! Tente novamente");
                vidas = vidas - 1;
            } else{
                System.out.println("O número sorteado é maior! Tente novamente");
                vidas = vidas - 1;
            }
        }
        if (acertou == true){
            System.out.printf("Você acertou o número! E sobraram Vidas: %d", vidas);
        } else{
            System.out.printf("Não foi dessa vez! O núemro era: %d", numeroSorteado);
        }
        lerTeclado.close();
    }
}