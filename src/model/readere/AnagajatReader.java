package model.readere;

import model.clase.Angajat;
import model.clase.Aplicant;
import model.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnagajatReader extends AplicantReader{
    public static List<Aplicant> readStudents(String file) throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> angajati = new ArrayList<>();

        while (input.hasNext()) {
           Angajat anagajat = new Angajat();
           super.citireAplicant(input2, anagajat);

           int salariu = input2.nextInt();
           anagajat.setSalariu(salariu);
           String ocupatie = input2.next();
           anagajat.setOcupatie(ocupatie);

        }
        input.close();
        return angajati;
    }

//    @Override
//    public List<Angajat> readAplicant(String file) {
//        return null;
//    }
}
