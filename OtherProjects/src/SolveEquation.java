import javax.swing.JOptionPane;

public class SolveEquation {
    public static void main(String[] args) {

        double a = Double.parseDouble(JOptionPane.showInputDialog("a = "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("b = "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("c = "));

        String result;

        if (a == 0) {
            if (b == 0) {
                result = (c == 0) ? "Vo so no" : "Vo no";
            } else {
                result = "Nghiem: "+(-c/b);
            }
        } else {
            double delta = b*b-4*a*c;

            if (delta < 0) {
                result = "Vo nghiem";
            } else if (delta == 0) {
                result = "Nghiem kep: " +(-b/(2*a));
            } else {
                double x1 = (-b+Math.sqrt(delta))/(2*a);
                double x2 = (-b-Math.sqrt(delta))/(2*a);
                result = "x1 = " + x1 + "\nx2 = " + x2;
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }
}




