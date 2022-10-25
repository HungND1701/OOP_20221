import javax.swing.JOptionPane;
public class Bai_6_1 {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Dow you want change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You'vs chosen: "+ (option==JOptionPane.YES_OPTION?"yes":"No"));
        System.exit(0);
    }
}
