package eu.dice.arryssoop;

public class ProgMainStudentMarksOop {

	public static void main(String[] args) {
		int noS = 2;
		Student[] g1050= new Student[noS];
		g1050[0]=new Student("Andreea", new int [] {9,7,5});
		g1050[1]=new Student("Mihai", new int [] {6,6,10});
		
		for(int i=0; i< g1050.length;i++)
			System.out.println("Avg mark for studdent " + i + " = " + g1050[i].getAverageMark());
	}

}
