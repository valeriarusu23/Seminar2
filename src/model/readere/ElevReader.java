package model.readere;

import model.clase.Angajat;
import model.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader{
    public List<Angajat> readAplicant(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Angajat> angajati = new ArrayList<Angajat>();

        while (input2.hasNext()) {
            Elev elev = new Elev();
            super.citireAplicant(input2, elev);


//            String nume = input2.next();
//            String prenume = input2.next();
//            int varsta = input2.nextInt();
//            int punctaj = input2.nextInt();
//            int nr = input2.nextInt();
//            String[] vect = new String[5];
//            for (int i = 0; i < nr; i++)
//                vect[i] = input2.next();
            int clasa = input2.nextInt();
            elev.setClasa(clasa);
            String tutore = input2.next();
            elev.setTutore(tutore);
            angajati.add(e);
        }
        input2.close();
        return angajati;
    }
}






