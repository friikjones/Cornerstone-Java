public class NumberOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int insideLength = 5;
		int outsideLength = 3;
		int initialNumber = 1;
		
		//int[][] numberArray = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		int[][] numberArray = new int[outsideLength][insideLength];;
		
		int input = initialNumber;
		
		for (int i=0; i<outsideLength; i++) {
			for (int j=0; j<insideLength; j++) {
				numberArray[i][j]=input;
				input++;
			}
		}
		
		for (int i=0; i<numberArray.length; i++) {
			for (int j=0; j<numberArray[i].length; j++) {
				System.out.print(numberArray[i][j]);
				if(j!=numberArray[i].length-1)
					System.out.print(",");
			}System.out.println();
		}
	}

}
