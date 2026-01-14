import java.util.*;

/*Write a program to perform addition, subtraction, multiplication, transpose, to check square
matrix, to check matrix is diagonal, and to check matrix is identity.
*/

class twoDArrayOperations{
	static void Addition(){
		System.out.println("Enter the Size of 2 D Array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr1 = new int[n][n];
		int[][] arr2 = new int[n][n];
		int[][] arr3 = new int[n][n];
		System.out.println("Enter first array : ");
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Second array : ");
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				arr2[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("The Addition of the matrix is : ");
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
	static void Subtraction(){
		System.out.println("Enter the Size of 2 D Array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr1 = new int[n][n];
		int[][] arr2 = new int[n][n];
		int[][] arr3 = new int[n][n];
		System.out.println("Enter first array : ");
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Second array : ");
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				arr2[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				arr3[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		
		System.out.println("The subtraction of the matrix is : ");
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
	
	static void Multiplication(){
		System.out.println("Enter the Size of 2 D Array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr1 = new int[n][n];
		int[][] arr2 = new int[n][n];
		int[][] arr3 = new int[n][n];
		System.out.println("Enter first array : ");
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Second array : ");
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				arr2[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				arr3[i][j]= 0;
					for(int k = 0; k<n; k++){
					
						arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
					}
			}
		}
		
		System.out.println("The Multiplication of the matrix is : ");
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
	static void Transpose(){
		System.out.println("Enter the Size of 2 D Array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr1 = new int[n][n];
		int[][] arr2 = new int[n][n];
		System.out.println("Enter an array : ");
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				arr1[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				arr2[i][j] = arr1[j][i];
			}
		}
		
		System.out.println("The Transpose of the matrix is : ");
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args){
		Scanner  sc =  new Scanner(System.in);
		System.out.println("For insertion press '+'");
		System.out.println("For Deletion press '-'");
		System.out.println("For Binary Search press '?'");
		System.out.println("For linear Search press '/'");
		
		
		char ch;
		System.out.println("Enter your Choice : ");
		
		
		ch = sc.next().charAt(0);
		
		switch(ch){
			
			case '+':
				Addition();
				break;
				
			case '-':
				Subtraction();
				break;
				
			case '?':
				Multiplication();
				break;
			
			case '/':
				Transpose();
				break;
				
		
				
			default:
				System.out.println("Invalid Input");
					
		}
	}

}