public class salaryCal {
    public static double totalSalary(double hoursWorkedDaily,int numOfDays, double hourlyRate ) {
        double WeeklyHours = numOfDays * hoursWorkedDaily;
        double weeklyWages = WeeklyHours * hourlyRate;
        return weeklyWages;
    }

    public static void main(String[] args) {
        double weekSal = totalSalary(5, 4, 150);
        System.out.println("Weekly salary is: "+ weekSal);

        double gross = weekSal * 52;
        System.out.println("Yearly salary is: "+ gross);
    }
}
