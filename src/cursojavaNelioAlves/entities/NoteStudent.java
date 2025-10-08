package cursojavaNelioAlves.entities;

public class NoteStudent {
    public String name;
    public double note1;
    public double note2;
    public double note3;


    public void finalGrade(){
        double average = note1 + note2 + note3;
        if (average >= 60.00){
            System.out.printf("FINAL GRADE = %.2f%n", average);
            System.out.println("PASS");
        }
        else{
            System.out.printf("FINAL GRADE = %.2f%n", average);
            System.out.println("FAILED");
            System.out.println("MISSING "+ String.format("%.2f", Math.abs(average - 60))+ " POINTS");
        }
    }
}
