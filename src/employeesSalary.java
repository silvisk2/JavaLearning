public class employeesSalary {

    public static double salaryCalculator(double hoursPerWeek, double amountPerHour, int vacationDays) {
        if(hoursPerWeek < 0){
            return -1;
        }

        if(amountPerHour < 0 ) {
            return -1;
        }

        double weeklyPaychecks = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDays * amountPerHour * 8;
        return (weeklyPaychecks * 52) - unpaidTime;

    }

    public static void main(String[] args) {
        double salary = salaryCalculator(40, 15, 8 );
        System.out.println(salary);

    }
}
