package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import model.clase.Angajat;
//import model.clase.Utils;
import model.clase.Aplicant;
import model.readere.AnagajatReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AnagajatReader anagajatReader = new AnagajatReader();
		try {
			listaAngajati = anagajatReader.readAplicanti("angajati.txt");
			for(Aplicant aplicant:listaAngajati)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
