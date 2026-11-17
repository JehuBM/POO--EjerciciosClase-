import java.util.Scanner;

public class Validacion {
    Scanner sc = new Scanner(System.in);
    public int num = 0;

    public int validarEnteros(){
        while(true){
            System.out.println("Ingresa un numero entero!");
            if(sc.hasNextInt()){
                this.num = sc.nextInt();
                break;
            } else{
                System.out.println("No es un numero valido...");
                sc.nextLine();
            }
        }
        sc.close();
        return num;
    }
}
