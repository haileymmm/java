//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {

		
		//백준 10951번 A+B-4 (예외처리)
		/*
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			System.out.println(A+B);
		}
		sc.close();
		*/
		
		//백준 10871번 X보다 작은 수 (for문)
		/*
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		int X=sc.nextInt();
		
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			if(A[i]<X)
				System.out.print(A[i]+" ");
		}
		sc.close();
		*/
		/*
		//백준 8958번 (배열)
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		
		String arr[]=new String[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.next();
		}
		
		for(int i=0;i<num;i++) {
			int count=0;
			int sum=0;
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O')
					count++;
				else
					count=0;
				sum+=count;
			}
			System.out.println(sum);
		}
		sc.close();
		*/
		
		//백준1546번 //for문,배열
		/*
			Scanner scanner= new Scanner(System.in);
			int n= scanner.nextInt();
			int grade[]= new int[n];
			
			for(int i=0;i<n;i++) {
				grade[i]=scanner.nextInt();
			}
			
			double sum=0;
			int max=0;
			for(int i=0;i<n;i++) {
				if(max<grade[i])
					max=grade[i];
					sum+=grade[i];
			}
			System.out.println(sum/max*100/n);
			scanner.close();
			*/
//	}
//}



















