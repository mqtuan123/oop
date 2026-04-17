import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Month: ");
            String m = sc.next().toLowerCase();

            System.out.print("Enter Year: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid year!");
                sc.next();
                continue;
            }

            int y = sc.nextInt();
            if (y < 0) {
                System.out.println("Invalid year!");
                continue;
            }

            int days = getDays(m, y);

            if (days == -1) {
                System.out.println("Invalid month!");
            } else {
                System.out.println("Days: " + days);
                break;
            }
        }
        sc.close();
    }

    public static int getDays(String m, int y) {
        m = m.replace(".", "");

        if (m.equals("1") || m.equals("jan") || m.equals("january") ||
                m.equals("3") || m.equals("mar") || m.equals("march") ||
                m.equals("5") || m.equals("may") ||
                m.equals("7") || m.equals("jul") || m.equals("july") ||
                m.equals("8") || m.equals("aug") || m.equals("august") ||
                m.equals("10") || m.equals("oct") || m.equals("october") ||
                m.equals("12") || m.equals("dec") || m.equals("december")) {
            return 31;
        }

        if (m.equals("4") || m.equals("apr") || m.equals("april") ||
                m.equals("6") || m.equals("jun") || m.equals("june") ||
                m.equals("9") || m.equals("sep") || m.equals("september") ||
                m.equals("11") || m.equals("nov") || m.equals("november")) {
            return 30;
        }

        if (m.equals("2") || m.equals("feb") || m.equals("february")) {
            if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
                return 29;
            else
                return 28;
        }

        return -1;
    }
}
