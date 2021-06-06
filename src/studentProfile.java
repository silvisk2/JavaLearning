public class studentProfile {

    String firstName ;
    String lastName ;
    String declaredMajor;
    double gpa;
    int expectedYearToGraduate;

    public studentProfile (String firstName, String lastName, String declaredMajor, double gpa, int expectedYearToGraduate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;

    }


    public void incrementExpectedGraduationYear() {
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;

    }


}
