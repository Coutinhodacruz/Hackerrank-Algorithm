import javax.swing.JOptionPane;

public class DayOfProgrammer {

    public static String dayOfProgrammer(int year) {

        if (year == 1918) {

            return "26.09.1918";
        }

        if (year < 1918) {
            if (year % 4 == 0) {
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        }
        

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return "12.09." + year;
        } else {
            return "13.09." + year;
        }
    }

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null, "Enter a year between 1700 and 2700:", "Input Year", JOptionPane.QUESTION_MESSAGE);
        
        try {

            int year = Integer.parseInt(input);

            if (year < 1700 || year > 2700) {
                JOptionPane.showMessageDialog(null, "Year out of range! Please enter a year between 1700 and 2700.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                String result = dayOfProgrammer(year);
                JOptionPane.showMessageDialog(null, "Day of the Programmer in year " + year + ": " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid year.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
