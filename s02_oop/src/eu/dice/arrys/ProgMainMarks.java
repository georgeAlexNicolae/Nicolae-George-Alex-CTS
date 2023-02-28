package eu.dice.arrys;

public class ProgMainMarks {

	public static void main(String[] args) {
		int noS =2;
		int noD =3;
		//read matrix
		int [][] mM= new int[][] {{9,7,5},{6,6,10}};
		float[] avgM = new float [noS];
		int i,j;
		
		i=0;
		while (i< noS) {
			avgM[i]=0.0f;
			
			j=0;
			while(j<noD) {
				avgM[i]+=mM[i][j];
				j++;
				
			}
			avgM[i]/=noD;
			i++;
		}
		
		//"display array"
//		i=0;
//		while(i<avgM.length) {
//			System.out.println("Avg mark for studdent " + i +" =" +avgM[i]);
//			i++;
//		}
		for(i=0; i< avgM.length;i++)
				System.out.println("Avg mark for studdent " + i + " = " + avgM[i]);
	}//end main

}
