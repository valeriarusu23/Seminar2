package model.readere;

import model.clase.Angajat;
import model.clase.Aplicant;
import model.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {
    public List<Angajat> readAplicant(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Angajat> angajati = new ArrayList<Angajat>();

        while (input2.hasNext()) {
            Student student = new Student();
            super.citireAplicant(input, student);

//            String nume = input2.next();
//            String prenume = input2.next();
//            int varsta = input2.nextInt();
//            int punctaj = input2.nextInt();
//            int nr = input2.nextInt();
//            String[] vect = new String[5];
//            for (int i = 0; i < nr; i++)
//                vect[i] = input2.next();
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            Angajat a = new Angajat(nume, prenume, varsta, punctaj, nr, vect, salariu, ocupatie);
            angajati.add(a);
        }
        input2.close();
        return angajati;
    }

}
