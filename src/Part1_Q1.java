public class Part1_Q1 {
    public static void main(String[] args) {
        final double RATE_OF_PAY = 10.25;
        final String [] WORKDAY_OF_THE_WEEK = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday"};
        int [] hoursWorked = {8,7,9,7,4};
        int totalHours = 0;
        double totalSalary = 0.00;

        System.out.printf("%9s%10s%12s\n", "Day", "Hours", "Salary");

        for(int counter = 0; counter < hoursWorked.length; counter++){
            totalHours += hoursWorked[counter];
            totalSalary += hoursWorked[counter] * RATE_OF_PAY;
            System.out.printf("%9s%10d%12.2f\n", WORKDAY_OF_THE_WEEK[counter],
                    hoursWorked[counter], hoursWorked[counter] * RATE_OF_PAY);

        }
        System.out.printf("The total hours worked: %d\n", totalHours);
        System.out.printf("The total salary for hours worked: %1.2f\n", totalSalary);


    }
}
