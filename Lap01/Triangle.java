import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter height of the triangle : ");
        int n = keyboard.nextInt();
        for(int i = 0;i<n;i++){
            String star ="";
            for(int j = 0 ; j<=2*n;j++){
                if(j>=(n-i) && j<=(n+i)) star +="*";
                else star +=" ";
            }
            System.out.println(star);
        }
    }
}
