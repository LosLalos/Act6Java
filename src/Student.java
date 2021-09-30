public class Student {

    private String name;
    private double[] grades = new double[5];

    public Student(String name, double[] grades){
        this.name = name;
        System.arraycopy(grades, 0, this.grades, 0, 5);
    }

    private double getAverage(){
        double sum = 0;

        for (int clock = 0; clock < 5; clock++) {
            sum += grades[clock];
        }
        sum = sum / 5;

        return sum;
    }

    private char getFinalGrade(double average){

        if(average <= 100 && average >= 91){
            return 'A';
        }else if(average <= 90 && average >= 81){
            return 'B';
        }else if(average <= 80 && average >= 71){
            return 'C';
        }else if(average <= 70 && average >= 61){
            return 'D';
        }else if(average <= 60 && average >= 51){
            return 'E';
        }else{
            return 'F';
        }

    }

    public void calculateGrade(){
        double average = getAverage();
        char finalGrade = getFinalGrade(average);

        System.out.println("Student's name: " + name);

        for (int clock = 0; clock < 5; clock++) {
            System.out.println("Grade " + (clock+1) + ": " + grades[clock]);
        }

        System.out.println("Average grade score: " + average);

        System.out.println("Final grade score: " + finalGrade);
    }

}
