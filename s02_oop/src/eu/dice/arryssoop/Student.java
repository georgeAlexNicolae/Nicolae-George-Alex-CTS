package eu.dice.arryssoop;

public class Student {
	private String name;
	private int[] marks;
	private float avg;
	
	public Student(String name,int[] studentMarks) {
		this.name=name;
		this.marks=studentMarks;
	}

	public String getName() {
		return this.name;
	}
	
	public float getAverageMark() {
		this.avg= this.calcAvgM();
		return this.avg;
	}
	
	private float calcAvgM() {
		float avgM = 0.0f;
		int j=0;
		while(j<this.marks.length) {
			avgM+=this.marks[j];
			j++;
			
		}
		avgM/=this.marks.length;
		
		return avgM;
	}
}
