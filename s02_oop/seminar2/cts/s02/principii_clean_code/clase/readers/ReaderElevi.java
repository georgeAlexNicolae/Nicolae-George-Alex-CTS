package cts.s02.principii_clean_code.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Elev;

public class ReaderElevi extends ReaderApplicant {
	

	@Override
	public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(file));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<>();

		while (input2.hasNext()) {
			Elev elev = new Elev();
			super.readFromFile(input2, elev);
			elev.setVarsta(input2.nextInt());
			elev.setPunctaj(input2.nextInt());
			elev.setNr_proiecte(input2.nextInt());
			String[] vect = new String[elev.getNr_proiecte()];
			for (int i = 0; i < elev.getNr_proiecte(); i++)
				vect[i] = input2.next();
			elev.setClasa(input2.nextInt());
			elev.setTutore(input2.next());
			elevi.add(elev);
		}
		input2.close();
		return elevi;
	}

	
}
