import java.util.Scanner;
public class Bai_2_2_6 {
    static void The_first_degree_equation_one(){
        Scanner keybord = new Scanner(System.in);
        System.out.println("first-degree equation such as: a*x + b = 0(a!=0) \nEnter a: ");
        double a = keybord.nextDouble();
        while(a==0){
            System.out.println("Wrong!! (a !=0) Enter a:");
            a = keybord.nextDouble();
        }
        System.out.println("Enter b: ");
        double b = keybord.nextDouble();
        double x = -b/a;
        System.out.println("x = "+x);
        
    }
    static void The_first_degree_equation_two(){
        Scanner keybord = new Scanner(System.in);
        System.out.println("first-degree equation such as: \n\ta11*x1 + a12*x2 = b1\n\ta21*x1 + a22*x2 = b2");
        System.out.println("Enter a11:");
        double a11= keybord.nextDouble();
        System.out.println("Enter a12:");
        double a12= keybord.nextDouble();
        System.out.println("Enter b1:");
        double b1= keybord.nextDouble();
        System.out.println("Enter a21:");
        double a21= keybord.nextDouble();
        System.out.println("Enter a22:");
        double a22= keybord.nextDouble();
        System.out.println("Enter b2:");
        double b2= keybord.nextDouble();

        double D = a11*a22 - a12*a21;
        double Dx = b1*a22 - b2*a12;
        double Dy = a11*b2 - a21*b1;
        if(D!=0){
            System.out.println("system of equations have only one solution: \nx = "+Dx/D +"\ny = "+Dy/D);
        }
        if(D==0 &&(Dx!=0 ||Dy!=0)){
            System.out.println("system of equations with no solution");
        }
        if(D==0 &&Dx==0 &&Dy==0){
            System.out.println("Phuong trinh co vo so nghiem dang: "+a11+"*x1+"+a12+"*x2 = "+b1);
        }
        
    }
    static void The_second_degree_equation_one(){
        Scanner keybord = new Scanner(System.in);
        System.out.println("first-degree equation such as: a*x^2 + bx + c = 0 \nEnter a: ");
        double a = keybord.nextDouble();
        System.out.println("Enter b: ");
        double b = keybord.nextDouble();
        System.out.println("Enter c: ");
        double c = keybord.nextDouble();
        double delta = b*b - 4*a*c;
        if(delta < 0 ){
            System.out.println("the equation no solution");
        }else if(delta == 0) System.out.println("the equation have one solution: x = "+(-b)/(a));
        else {
            System.out.println("the equation have two solution: \n\tx1 = "+(-b+Math.sqrt(delta))/(2*a)+"\n\tx2 = "+(-b-Math.sqrt(delta))/(2*a));
        }
        
    }
    static void menu(){
        System.out.println(("=============================="));
        System.out.println("Chose equation you want to solve: ");
        System.out.println("1.The first-degree equation (linear equation) with one variable");
        System.out.println("2.The system of first-degree equations (linear system) with two variables");
        System.out.println("3.The second-degree equation with one variable");
        System.out.println("q.Quit");
        System.out.println(("=============================="));
    }
    public static void main(String[] args) {
        
        String choose = "";
        while(!choose.equals("q")){
            menu();
            Scanner key= new Scanner(System.in);
            choose = key.nextLine();
            
            switch(choose){
                case "1":
                    The_first_degree_equation_one();
                    break;
                case "2":
                    The_first_degree_equation_two();
                    break;
                case "3":
                    The_second_degree_equation_one();
                    break;
                case "q":
                    System.exit(0);
                    break;
                default: 
                    break;
            }
            
        }
    }
}
