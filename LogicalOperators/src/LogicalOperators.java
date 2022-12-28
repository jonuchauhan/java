import javax.swing.JOptionPane;

public class LogicalOperators {

    public static void main(String args[]) {

        String Dept = JOptionPane.showInputDialog("Enter your department");
        int salary = Integer.parseInt(JOptionPane.showInputDialog("Enter your Salary"));

        if (Dept == "HR" && salary == 200000) { // and operator

            double new_salary = salary + (salary * 0.3);
            JOptionPane.showMessageDialog(null, "Your new salary is :- " + new_salary);

        }

        else if ((Dept == "IT" || Dept == "Admin") && salary == 300000) { // or and and operator
            double new_salary = salary + (salary * 0.5);
            JOptionPane.showMessageDialog(null, "Your new salary is :- " + new_salary);

        }

        else {

            double new_salary = salary + (salary * 0.2);
            JOptionPane.showMessageDialog(null, "Your new salary is :- " + new_salary);

        }

    }

}