public class Main {

    public static void main(String[] args) {
        double[] grades = {89, 78, 100, 84, 82};
        Student testStudent = new Student("Rei", grades);
        testStudent.calculateGrade();
    }

}
