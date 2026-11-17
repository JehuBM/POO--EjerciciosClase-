import java.util.Scanner;

public class Radio {
    
    public Scanner sc = new Scanner(System.in);
    public double area = 0;
    public int radio = 0;
    final public double pi = 3.1416;

    public void validarRadio(){
        while (true) {
            System.out.println("Escribe el radio del circulo");
            if(this.sc.hasNextInt()){
                this.radio = this.sc.nextInt();
                break;
            }else{
                System.out.println("Introducelo bien...");
                this.sc.nextLine();
            }
        }
    }

    public void AreaDar(){
        this.area = Math.PI * Math.pow(radio, 2);
        return;
    }

    public void dar(){
        System.out.println("El area es: " +this.area);
    }


}
