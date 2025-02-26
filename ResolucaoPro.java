import java.util.Scanner;

public class ResolucaoPro {
    public static void main (String[] args){

        Scanner entrada = new Scanner (System.in);
    
        System.out.println ("Digite a quantidade de publicações curtidas");
        int publicacoes = entrada.nextInt();
        int totalCurtidas = 0; // acumuladora

        for (int i =1; i<= publicacoes; i++){
            System.out.printf("Curtidas de publicação #%d:", i);
            int numeroCurtidas = entrada.nextInt();

            totalCurtidas = totalCurtidas = totalCurtidas + numeroCurtidas;

            if (numeroCurtidas >= 100) {
                System.out.println("Publicação Popular!");

            }

            else {
                System.out.println ("Flopou!");
            }
        }
            double mediaCurtidas = (double) totalCurtidas /(double) publicacoes;
            System.out.printf("Média de curtidas = %.1f\n", mediaCurtidas);
            System.out.printf("numero publicação = "+ publicacoes );
            entrada.close();

        }

    }


        
