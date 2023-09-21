package ClasseDATE;
import java.util.Scanner;
public class DataTeste {

    public static void main(String[] args){

        int CalculoIdade;
        int AnoNasc;
        int AnoAtual;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o ano de nascimento");
        AnoNasc = input.nextInt();

        System.out.println("informe o ano e que está");
        AnoAtual = input.nextInt();

        CalculoIdade = AnoAtual - AnoNasc;

        if(CalculoIdade <18){
            System.out.println("Não pode tirar habilitação");

        }else{
            System.out.println(" Pode tirar habilitação");
        }




    }
}
