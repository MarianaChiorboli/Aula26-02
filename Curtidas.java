import java.util.Scanner;

public class Curtidas {
    public static void main (String[] args){

        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de posts a serem analisadas");
        int publicacoes = entrada.nextInt();

        int cont = 0;
        int curtidas = 0;

        while ( cont<publicacoes){
            cont=cont+1;
            System.out.println("Curtidas publicação" + cont + ":");
           int like= entrada.nextInt();
            curtidas=curtidas +like;
            if(like>=100){
                System.out.println("publicação popular");
            }
            else{
                System.out.println("flopou");
            }
        }
        double media= (double) curtidas / (double) publicacoes;
        System.out.println("media:"+ media );
        System.out.println("Total:" + curtidas);
        entrada.close();
    }
}



