import javax.swing.JOptionPane;

public class BasicGui {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name ");
        JOptionPane.showMessageDialog(null, name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age "));
        JOptionPane.showMessageDialog(null, age);

    }
}