import java.util.Scanner;
public class Bai_6_4 {
    static int FindMonth(String month , String[] months){
        for(int i = 0 ; i<months.length;i++){
            if(month.equals(months[i])) return i+1;
        }
        return 0;
    };
    public static void main(String[] args) {
        String[] monthsFull = {"january","february","march","april","may","june","july","august","september","october","november","december"};
        String[] monthsAbbre = {"jan.","feb.","mar.","apr.","may","june","july","aug.","sept.","oct.","nov.","dec."};
        String[] monthsThreeLetter = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        String[] monthsNumb = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a month: ");
        String month = keyboard.nextLine().toLowerCase();
        int index = 0;
        while(index==0){
            index = FindMonth(month,monthsFull);
            if(index !=0 ) break;
            index = FindMonth(month,monthsAbbre);
            if(index !=0 ) break;
            index = FindMonth(month,monthsThreeLetter);
            if(index !=0 ) break;
            index = FindMonth(month,monthsNumb);
            if(index !=0 ) break;
            System.out.println("Wrong month!! Enter a month: ");
            month = keyboard.nextLine().toLowerCase();
        };
        System.out.println("Enter a year : ");
        int year = keyboard.nextInt();
        while (year <=0 ){
            System.out.println("Wrong!! Enter a year : ");
            year = keyboard.nextInt();
        }
        switch(index){
            case 1 : 
                System.out.println("January has 31 days "+ "in "+ year);
                break;
            case 2 : 
                if(year%4==0) {
                    if(year%100==0 && year %400!=0) System.out.println("February has 28 days "+ "in "+ year);
                    else System.out.println("February has 29 days "+ "in "+ year);
                }
                else System.out.println("February has 28 days "+ "in "+ year);
                break;
            case 3 : 
                System.out.println("March has 31 days "+ "in "+ year);
                break;
            case 4 : 
                System.out.println("April has 30 days "+ "in "+ year);
                break;
            case 5 : 
                System.out.println("May has 31 days "+ "in "+ year);
                break;
            case 6 : 
                System.out.println("June has 30 days "+ "in "+ year);
                break;
            case 7 : 
                System.out.println("July has 31 days "+ "in "+ year);
                break;
            case 8 : 
                System.out.println("August has 31 days "+ "in "+ year);
                break;
            case 9 : 
                System.out.println("September has 30 days "+ "in "+ year);
                break;
            case 10 : 
                System.out.println("October has 31 days "+ "in "+ year);
                break;
            case 11 : 
                System.out.println("November has 30 days "+ "in "+ year);
                break;
            case 12: 
                System.out.println("December has 31 days "+ "in "+ year);
                break;
        }
        keyboard.close();
    }
}
