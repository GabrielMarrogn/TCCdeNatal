import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println("Eu odeio a professora!");
        }else if(b -a >= 3){
            System.out.println("Muito bem! Apresenta antes do Natal!");
        }else if(b - a < 3){
            System.out.println("Parece o trabalho do meu filho!");
            b += 2;
            if(b > 24){
                System.out.println("Fail! Entao eh nataaaaal!");
            }else{
                System.out.println("TCC Apresentado!");
            }
        }

        sc.close();
    }

}
