package exam1;

public class referenceType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] checkScore =  new int[3][3];
		
		for(int i = 0; i<checkScore.length; i++)
		{
			for(int j = 0; j < checkScore.length; j++) {
				
				checkScore[i][j] = i + j;
				System.out.println("checkScore[" + i + "][" + j + "] result : " + checkScore[i][j]);				
				System.out.println("checkScore[" + i + "][" + j + "] : " + System.identityHashCode(checkScore[i][j]));
				
			}
			
		}
		
		System.out.println("checkScorehashCode3 : " + checkScore.hashCode());

	}

}
