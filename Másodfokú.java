import java.util.Scanner;

public class Másodfokú {

    public static void main(String[] args)
    {
        Scanner KeyboardInput = new Scanner(System.in);
        try {
        System.out.println("A értéke: ");
        double A = KeyboardInput.nextDouble();
        System.out.println("B értéke: ");
        double B = KeyboardInput.nextDouble();
        System.out.println("C értéke: ");
        double C = KeyboardInput.nextDouble();
        double D = Math.pow(B,2)-4*A*C;
        if (A == 0){
            System.out.println("Elsőfok: " + -(C / B));
        }
        else {
            if (D > 0) {
                System.out.println("1 eredmény: " + Math.round((-(B)+ Math.sqrt(D))/ (2*A)));
                System.out.println("2 eredmény: " + Math.round((-(B)- Math.sqrt(D))/ (2*A)));
            }
            else if (D == 0 ){
                System.out.println("2 Az eredmény" + 2*A/B);
            }
            else if (D < 0) {
                System.out.println("Nincs Megoldás");
            }
            else{
                System.out.println("Hiba");
            }
        }
        }
        finally {
            KeyboardInput.close();
        }
    }
}

