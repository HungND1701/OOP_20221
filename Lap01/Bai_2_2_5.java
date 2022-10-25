import javax.swing.JOptionPane;
public class Bai_2_2_5 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
        

        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1*num2;
        double quotient = num1/num2;
        JOptionPane.showMessageDialog(null, "Sum : "+sum +"\nDifference: "+difference+"\nProduct: "+product+"\nQuotient: "+quotient, "Show result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
