import java.util.*;
class Program1{
	public static void main(String args[]){
		int val;
		Scanner sc = new Scanner(System.in);

		first:
		System.out.println("Enter the row and column for first matrix");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		System.out.println("Enter elements of first matrix");
		int mat1[][] = new int[r1][c1];
		for(int i = 0; i < r1; i++){
			for(int j = 0; j < c1; j++){
				val = sc.nextInt();
				mat1[i][j] =  val;
			}
		}
		
		System.out.println("Enter the row and column for second matrix");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		System.out.println("Enter elements of second matrix");
		int[][] mat2 = new int[r2][c2];
		for(int i = 0; i < r2; i++){
			for(int j = 0; j < c2; j++){
				val = sc.nextInt();
				mat2[i][j] =  val;
			}
		}
		
		System.out.println("Press 1 for addition and 2 for multiplication");
		int num = sc.nextInt();
		switch(num){
			case 1:
				if(r1 == r2 && c1 == c2){
				int sumMat[][] = new int[r2][c2];
				for(int i = 0; i < r1; i++){
					for(int j = 0; j < c1; j++){
						sumMat[i][j] = mat1[i][j] + mat2[i][j];
					}
				}
				for(int[] temp : sumMat){
					for(int t : temp){
						System.out.print(t + " ");
					}
					System.out.println();
				}
				}else{
					System.out.println("Both matrix are not same to perform addition");
				}
				break;	
				case 2:
					if(c1 == r2){
					int sumMat[][] = new int[r1][c2];
					for(int i = 0; i < r1; i++){
						for(int j = 0; j < c2; j++){
							for(int k = 0; k < c1; k++){
								sumMat[i][j] += mat1[i][k] * mat2[k][j]; 
							}
						}
					}
					for(int temp[] : sumMat){
						for(int t : temp){
							System.out.print(t + " ");
						}
						System.out.println();
					}
					}else{
						System.out.println("Cannot multiply matrix");
					}
					break;
				default:
					System.out.println("Enter valid choice");
					break;
			}
		}
	}
