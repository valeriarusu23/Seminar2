package model.readere;

import model.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface AplicantReader {
    public abstract List<Aplicant> readAplicanti(String file) throws FileNotFoundException;

    public Aplicant citireAplicant(Scanner input 2, Aplicant aplicant){
        String nume = input2.next();
        String prenume = input2.next();
        int varsta = input2.nextInt();
        int punctaj = input2.nextInt();
        int nr = input2.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input2.next();

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr_proiecte(nr, vect);
    }
}
