//Chap6
//모듈, 패키지, Object클래스, Wrapper클래스, String클래스, 
//StringBuffer클래스, StringTokenizer클래스, Math클래스, Calendar클래스

//예제6-1
//객체 레퍼런스만으로 객체의 클래스명, 해시코드 값, 객체의 문자열 출력
/*
class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

public class Chap6 {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); //클래스 이름
		System.out.println(obj.hashCode()); //해시코드 값
		System.out.println(obj.toString()); //객체를 문자열로 만들어 출력
		System.out.println(obj); //객체 출력
	}
	
	public static void main(String[] args) {
		Point p= new Point(2,3);
		print(p);
	}
}
*/

//예제6-2
//Point클래스에 Point객체를 문자열로 리턴하는 toString()메소드 작성
/*
class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}
}

public class Chap6 {
	public static void main(String[] args) {
		Point p= new Point(2,3);
		System.out.println(p.toString());
		System.out.println(p); //p는 toString으로 자동변환
		System.out.println(p+"입니다.");
	}
}
*/

//예제6-3
//Point클래스에 두점의좌표가 같으면 true를 리턴하는 equals() 작성
/*
class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public boolean equals(Object obj) {
		Point p= (Point)obj; //다운캐스팅
		if(x==p.x && y==p.y)
			return true;
		else return false;
	}
}

public class Chap6 {
	public static void main(String[] args) {
		Point a= new Point(2,3);
		Point b= new Point(2,3);
		Point c= new Point(3,4);
		if(a==b)
			System.out.println("a==b");
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
	}
}
*/

//예제6-4
//int타입의 width,height필드 갖는 Rect클래스, 면적이 같으면 두 Rect클래스 객체가 같은 것으로 판별하는 equals() 작성
/*
class Rect {
	private int width, height;
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	@Override
	public boolean equals(Object obj) {
		Rect p= (Rect)obj; //다운캐스팅
		if(width*height==p.width*p.height)
			return true;
		else return false;
	}
}

public class Chap6 {
	public static void main(String[] args) {
		Rect a= new Rect(2,3);
		Rect b= new Rect(3,2);
		Rect c= new Rect(3,4);
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(b.equals(c))
			System.out.println("b is equal to c");
	}
}
*/

//예제6-5
//Wrapper클래스 활용
/*
public class Chap6 {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		
		char c1='4', c2='F';
		if(Character.isDigit(c1))
			System.out.println(c1+"는 숫자");
		if(Character.isAlphabetic(c2))
			System.out.println(c2+"는 영문자");
		
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toHexString(28));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
		
		Double d= Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		
		boolean b= (4>3); //true
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
	}
}
*/

//예제6-6
//박싱, 언박싱
/*
public class Chap6 {
	public static void main(String[] args) {
		int n=10;
		Integer intObject=n; //자동 박싱
		System.out.println("intObject = "+intObject);
		int m= intObject+10; //자동 언박싱
		System.out.println("m = "+m);
	}
}
*/

//예제6-7
//String클래스 활용
/*
public class Chap6 {
	public static void main(String[] args) {
		String a= new String(" C#");
		String b= new String(",C++ ");
		
		System.out.println(a+"의 길이는 "+a.length());
		System.out.println(a.contains("#"));
		
		a= a.concat(b);
		System.out.println(a);
		
		a= a.trim();
		System.out.println(a);
		
		a=a.replace("C#", "Java");
		System.out.println(a);
		
		String s[]= a.split(",");
		for(int i=0;i<s.length;i++)
			System.out.println("분리된 문자열"+i+": "+s[i]);
		a= a.substring(5);
		System.out.println(a);
		
		char c= a.charAt(2);
		System.out.println(c);
	}
}
*/

//예제6-8
//StringBuffer클래스 활용
/*
public class Chap6 {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("This");
		
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7," my");
		System.out.println(sb);
		
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		sb.delete(8, 13);
		System.out.println(sb);
		
		sb.setLength(4);
		System.out.println(sb);
	}
}
*/

//예제6-9
//StringTokenizer클래스 활용
/*
import java.util.StringTokenizer;
public class Chap6 {
	public static void main(String[] args) {
		StringTokenizer st= new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
*/

//예제6-10
//Math클래스 활용
/*
public class Chap6 {
	public static void main(String[] args) {
		double a= Math.PI;
		System.out.println(Math.PI);
		System.out.println(Math.ceil(a));
		System.out.println(Math.floor(a));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.exp(2));
		System.out.println(Math.round(3.14));

		System.out.print("이번주 행운의 번호는 ");
		for(int i=0;i<5;i++)
			System.out.print((int)(Math.random()*45+1)+" ");
	}
}
*/

//예제6-11
//Calendar클래스 활용
/*
import java.util.Calendar;
public class Chap6 {
	public static void printCalendar(String msg, Calendar cal) {
		int year= cal.get(Calendar.YEAR);
		int month= cal.get(Calendar.MONTH);
		int day= cal.get(Calendar.DAY_OF_MONTH);
		int dayOfweek= cal.get(Calendar.DAY_OF_WEEK);
		int hour= cal.get(Calendar.HOUR);
		int hourOfday= cal.get(Calendar.HOUR_OF_DAY);
		int ampm= cal.get(Calendar.AM_PM);
		int minute= cal.get(Calendar.MINUTE);
		int second= cal.get(Calendar.SECOND);
		int millisecond= cal.get(Calendar.MILLISECOND);
		System.out.print(msg+year+"/"+month+"/"+day+"/");
		
		switch(dayOfweek) {
			case Calendar.SUNDAY: System.out.print("일요일"); break;
			case Calendar.MONDAY: System.out.print("월요일"); break;
			case Calendar.TUESDAY: System.out.print("화요일"); break;
			case Calendar.WEDNESDAY: System.out.print("수요일"); break;
			case Calendar.THURSDAY: System.out.print("목요일"); break;
			case Calendar.FRIDAY: System.out.print("금요일"); break;
			case Calendar.SATURDAY: System.out.print("토요일"); break;
		}
		System.out.print("("+hourOfday+"시)");
		if(ampm==Calendar.AM)
			System.out.print("오전");
		else
			System.out.print("오후");
		System.out.println(hour+"시 "+minute+"분 "+second+"초 "+millisecond+"밀리초");
	}
	
	public static void main(String[] args) {
		Calendar now= Calendar.getInstance();
		printCalendar("현재 ", now);
		
		Calendar firstDate= Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2016, 11, 25);
		
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("처음 데이트한 날은 ", firstDate);
	}
}
*/

