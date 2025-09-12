package cursojava;

import entities.NoteStudent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcStudentNotes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        NoteStudent noteStudent = new NoteStudent();

        noteStudent.name = String.valueOf(br.readLine());
        noteStudent.note1 = Double.parseDouble(br.readLine());
        noteStudent.note2 = Double.parseDouble(br.readLine());
        noteStudent.note3 = Double.parseDouble(br.readLine());

        noteStudent.finalGrade();

    }
}
