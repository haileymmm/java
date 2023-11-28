//baekjoon

//2167번//2차원배열의합
/*
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt(); //행
		int m=sc.nextInt(); //열
		int[][] arr1= new int[n+1][m+1];
		int[][] arr2= new int[n+1][m+1]; //행별로 부분합 저장 배열
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				arr1[i][j]=sc.nextInt();
				arr2[i][j]=arr1[i][j]+arr2[i][j-1];
			}
		}
		int l=sc.nextInt();
		int[] sum= new int[l]; //배열합 저장 배열
		
		for(int k=0;k<l;k++) {
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			
			for(int r=x1;r<=x2;r++) {
				sum[k]+=(arr2[r][y2]-arr2[r][y1-1]);
			}
		}
		for(int i=0;i<l;i++)
			System.out.println(sum[i]);
		
		sc.close();
	}
}
*/

//9086번//문자열
//방법1
/*
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr= new String[n];
		
		for(int i=0 ;i<n;i++) {
			arr[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i].charAt(0));
			System.out.println(arr[i].charAt(arr[i].length()-1));
		}
		sc.close();
	}
}
*/
//방법2
/*
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0 ;i<n;i++) {
			String s=sc.next();
			System.out.print(s.charAt(0));
			System.out.println(s.charAt(s.length()-1));
		}
		sc.close();
	}
}
*/

//1181번//단어정렬
/*
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		String[] arr = new String[N];
		in.nextLine();	// 개행 버림
 
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				// 그 외의 경우 
				else {
					return s1.length() - s2.length();
				}
			}
		});
 
		System.out.println(arr[0]);
		
		for (int i = 1; i < N; i++) {
			// 중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
	}
}
*/

//1431번//시리얼번호
/*
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    int sum1 = 0;
                    int sum2 = 0;
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) <= '9' && o1.charAt(i) >= '0') {
                            sum1 += Integer.parseInt(String.valueOf(o1.charAt(i))); }
                    }
                    for (int i = 0; i < o2.length(); i++) {
                        if (o2.charAt(i) <= '9' && o2.charAt(i) >= '0') {
                            sum2 += Integer.parseInt(String.valueOf(o2.charAt(i))); }
                    }
                    if (sum1 == sum2)
                        return o1.compareTo(o2);
                    else
                        return sum1 - sum2;
                }
                else {
                    return o1.length() - o2.length(); }
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
*/

//1259번//팰린드롬
/*
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			boolean check=true;
			
			String N = sc.next();
			if(N.equals("0"))
				break;
			
			for(int i=0;i<N.length()/2;i++) {
				if(N.charAt(i) != N.charAt(N.length()-1-i))
					check=false;
			}
			
			if(check)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
*/

//1225번//곱셈
//A=abc, B= de
//A*B= a*d + a*e + b*d + b*e + c*d + c*e
/*
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		long sum=0; //long타입!
		for(int i=0;i<A.length();i++) {
			for(int j=0;j<B.length();j++) {
				sum+=(A.charAt(i)-'0')*(B.charAt(j)-'0');
			}
		}
		System.out.println(sum);
	}
}
*/

//2439번//별찍기2
/*
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/

//2525번//오븐시계
/*
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		
		int min=60*a+b+c;
		
		int h=(min/60)%24;
		int m=min%60;
		
		System.out.println(h+" "+m);
	}
}
*/

//2675번//문자열반복
/*
import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for(int i = 0; i < T; i++) {
	
			int R = in.nextInt();
			String S = in.next();	// nextLine() 을 쓰면 error!
			
			for(int j = 0; j < S.length(); j++) {           
				for(int k = 0; k < R; k++) {	// R 만큼 반복 출력
					System.out.print(S.charAt(j));
				}
			}
            
			System.out.println();
		}
	}
}
*/

//1256번//사전
/*
import java.util.Scanner;

public class Main {
	static double[][] dp= new double[101][101];
	static StringBuilder sb= new StringBuilder(); 
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		//N은 a개수, M은 z개수, K번째 문자열을 구해야함.
		//N, M은 100이하, K는 10억 이하의 수
		int N= scan.nextInt();
		int M= scan.nextInt();
		double K= scan.nextDouble();
		
		if(check(N, M)<K) {
			System.out.println("-1");
		}else {
			makeS(N, M, K);
			System.out.println(sb.toString());
		}
	}//main
	
	//개수 구하는 함수
	public static double check(int a, int z) {
		if(a==0||z==0) return 1;
		if(dp[a][z]!=0) return dp[a][z];
		
		return dp[a][z]= Double.min(check(a-1, z)+check(a, z-1), 1000000001);
	}
	
	//문자열 만드는 함수
	public static void makeS(int a, int z, double k) {
		if(a==0) {
			for(int i=0; i<z; i++)
				sb.append("z");
			return;
		}
		if(z==0) {
			for(int i=0; i<a; i++)
				sb.append("a");
			return;
		}
		
		double check= check(a-1, z);
		if(k>check) {
			sb.append("z");
			makeS(a, z-1, k-check);
		}else {
			sb.append("a");
			makeS(a-1, z, k);
		}
	}
}
*/

//2751번//수정렬
/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        for (int i = 0; i < N; i++) {
            sb.append(arr.get(i)).append('\n');
        }
        System.out.println(sb);
        sc.close();
    }
}
*/

//25305번//커트라인
/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n - k]);
    }
}
*/

//2910번//빈도정렬
/*
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //백준 풀때는 Scanner 보단 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과값 출력을 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        //문자열 끊어서 받기 위한 StringTokenizer
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        //LinkedHashMap 생성
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            //문자열 숫자 변환
            int num = Integer.parseInt(st.nextToken());
            // 해시맵 안에 num이 있으면 기존 값에 +1을 해주어 저장
            // 존재하지 않으면 새로 값을 추가
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // 키를 모두 ArrayList에 저장
        List<Integer> list = new ArrayList<>(map.keySet());

        // ArrayList에 저장된 값 기준 내림차순으로 정렬
        //비교를 위해 Collections 클래스의 sort 메소드 이용
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                //list.get(b) 와 list.get(a)의 위치가 바뀌면 오름차순이 됨
                return Integer.compare(map.get(b), map.get(a));
            }
        });

        //Iterator로 순회하여 출력
        Iterator<Integer> it = list.iterator();
        //Iterator it 에 다음 값이 없을때까지 반복하여 sb에 저장
        while (it.hasNext()) {
            Integer element = it.next();
            for (int i = 0; i < map.get(element); i++) {
                sb.append(element + " ");
            }
        }
        System.out.println(sb);
    }
}
*/

//11652번//카드
/*
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap <Long, Integer> map = new HashMap<>();
		
		// HashMap에 카드 정보 저장
		for(int i = 0; i < n; i++) {
			long tmp = sc.nextLong();
			// 이미 있는 카드 값이 들어오면 원래 값에서 + 1
			map.put(tmp, map.getOrDefault(tmp, 0) + 1);
		}
		
		// HashMap에서 가장 큰 값을 가진 Index 리턴 
		int max = Integer.MIN_VALUE;
		long  answer = 0;
		for(long x: map.keySet()) {
			if(map.get(x) > max) {
				max = map.get(x);
				answer = x;
			} else if(map.get(x) == max) {
				answer = Math.min(answer, x);
			}	
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
*/

//10807번//개수 세기
/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;						 // b 와 일치할시 갯수를 올리는 변수
        int N = sc.nextInt();
        int[] arr = new int[N];				 // 배열 생성, 길이는 N만큼

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();			 // 배열에 입력한 정수들 넣어주기
        }
        int b = sc.nextInt();				 // [문제] 입력 세번째 줄 정수

        for(int j = 0; j < arr.length; j++){ // 배열 길이만큼 반복문 돌리면서 변수 b 와 같은
            if(b == arr[j]){				 // 숫자 찾기. 같으면 count 변수 1씩 증가
                count++;
            }
        }
        System.out.println(count);
    }
}
*/

//10818번//최소,최대
/*
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
		int[] arr = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
        
		in.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
	}
}
*/

