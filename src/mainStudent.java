public class mainStudent {
    public static void main(String[] args) {

        studentProfile profileOne = new studentProfile("Silviu", "Capraru", "IT", 3.55, 2023);
        studentProfile profileTwo = new studentProfile("Ssss", "Caprafsaffru", "ITfdsf", 4.535, 1993);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);



    }
}
