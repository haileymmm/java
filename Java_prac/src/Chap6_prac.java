//Chap6_실습문제(E)

//E-1
/*
import java.util.Scanner;

class MyPoint{
    private int x, y;
    public MyPoint(int x, int y) {this.x = x; this.y = y;}
    public String toString(){
        return "Point(" + x + ", " + y + ")";
    }
    public boolean equals(Object obj){
        MyPoint p = (MyPoint)obj;
        if(x == p.x && y == p.y){
            return true;
        }
        return false;
    }
}

public class Chap6_prac {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(4, 50);
        System.out.println(p);
        if (p.equals(q))
        	System.out.println("같은 점");
        else
        	System.out.println("다른 점");

    }
}
*/

//E-2
/*
import java.util.Scanner;

class Circle{
    private int x, y, radius;
    public Circle(int x, int y, int radius) {this.x = x; this.y = y; this.radius = radius;}
    public String toString(){
        return "Circle(" + x + ", " + y + ")반지름" + radius;
    }
    public boolean equals(Object obj){
        Circle p = (Circle)obj;
        if(x == p.x && y == p.y){
            return true;
        }
        return false;
    }
}

public class Chap6_prac {
    public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
        Circle b = new Circle(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if(a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");

    }
}
*/

//E-3 //패키지별 작성한다는 가정하에..
////etc패키지
//package etc;
//public class Calc {
//		private int x, y;
//		public Calc(int x, int y) { this.x = x; this.y = y; }
//		public int sum() { return x+y; }
//}
////main패키지
//package main;
//import etc.Calc;
//public class MainApp {
//	public static void main(String[] args) {
//		Calc c = new Calc(10, 20);
//		System.out.println(c.sum());
//	}
//}

//E-4 //패키지별 작성한다는 가정하에..
//package base;
//public class Shape {
//	public void draw() { System.out.println("Shape"); }
//}
//
//package derived;
//import base.Shape;
//public class Circle extends Shape {
//	public void draw() { System.out.println("Cirlce"); }
//}
//
//package app;
//import base.Shape
//import derived.Circle
//public class GraphicEditor {
//	public static void main(String[] args) {
//		Shape shape = new Circle();
//		shape.draw();
//	}
//}

//E-5
/*
import java.util.Calendar;

public class Chap6_prac {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        System.out.println("현재 시간은 " + hour + "시 " + minute + "분입니다.");

        if(hour > 4 && hour < 12)
            System.out.println("Good Morning");
        else if(hour >= 12 && hour < 18)
            System.out.println("Good Afternoon");
        else if(hour >= 18 && hour < 22)
            System.out.println("Good Evening");
        else
            System.out.println("Good Night");
    }
}
*/

//E-6
/*
import java.util.Calendar;
import java.util.Scanner;

class Enters{
    private Scanner sc;
    private Calendar now;
    private String enter;
    private int time;
    public int enter(){
        sc = new Scanner(System.in);
        enter = sc.nextLine();
        now = Calendar.getInstance();
        time =now.get(Calendar.SECOND);
        System.out.println("\t현재 초 시간 = "+ time);
        return time;
    }
}

public class Chap6_prac {
    public static void main(String[] args) {
        String names[] = {"황기태", "이재문"};
        Enters enter = new Enters();
        int time1, time2;
        int times[] = new int[2];
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");

        for(int i = 0; i < 2; i++){
            System.out.print(names[i] + " 시작 <Enter>키 >>");
            time1 = enter.enter();
            System.out.print(names[i] + " 10초 예상 후 <Enter>키 >>");
            time2 = enter.enter();
            if(time1 > time2)
                times[i] = (60 - time1) - time2;
            else
                times[i] = time1 - time2;
        }
        times[0] = Math.abs(times[0]);
        times[1] = Math.abs(times[1]);
        if(times[0] > times[1])
            System.out.println("황기태의 결과 "+times[0]+", 이재문의 결과 "+times[1]+", 승자는 황기태");
        else
            System.out.println("황기태의 결과 "+times[0]+", 이재문의 결과 "+times[1]+", 승자는 이재문");

    }
}
*/

//E-7(1)
/*
import java.util.Scanner;
import java.util.StringTokenizer;


public class Chap6_prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print(">>");
            String s = scanner.nextLine();
            if (s.equals("그만")) {
                System.out.println("종료합니다....");
                break;
            }
            StringTokenizer st = new StringTokenizer(s, " ");
            System.out.println("어절 개수는 " + st.countTokens());
        }
    }
}
*/

//E-7(2)
/*
import java.util.Scanner;

public class Chap6_prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print(">>");
            String s = scanner.nextLine();
            if (s.equals("그만")) {
                System.out.println("종료합니다....");
                break;
            }
            String str[] = s.split(" ");
            System.out.println("어절 개수는 " + str.length);
        }
    }
}
*/

//E-8
/*
import java.util.Scanner;

public class Chap6_prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        String sc = scanner.nextLine();
        for(int i = 0; i < sc.length(); i++){
            System.out.print(sc.substring(i));
            System.out.println(sc.substring(0, i));
        }

    }
}
*/

//E-9
/*
import java.util.Scanner;

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int select() {
        Scanner sc = new Scanner(System.in);
        System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
        return sc.nextInt();
    }
}

class Computer extends Player{
    public Computer(String name) {
        super(name);
    }

    public int select() {
        return (int)(Math.random()*3+1);
    }
}

class RSPGame {
    private final String rsp[] = {"가위", "바위", "보"};
    Player[] player = new Player[2];

    public RSPGame() {
        player[0] = new Player("철수");
        player[1] = new Computer("컴퓨터");
    }

    public void Run() {
        int userchoice, computerchoice;

        while(true) {
            userchoice = player[0].select();

            if(userchoice<1 || 4<userchoice)
                System.out.println("잘못된 입력");
            else if(userchoice == 4)
                break;

            computerchoice = player[1].select();

            System.out.println(player[0].getName() + "(" + rsp[userchoice-1] + ") : " + player[1].getName() + "(" + rsp[computerchoice-1] + ")");

            switch(userchoice-computerchoice) {
                case 0:
                    System.out.println("무승부입니다.");
                    break;
                case 2:
                case -1:
                    System.out.println(player[1].getName() + "가 이겼습니다.");
                    break;
                case -2:
                case 1:
                    System.out.println(player[0].getName() + "가 이겼습니다.");
                    break;
            }
        }
    }
}

public class Chap6_prac {
    public static void main(String[] args) {
        RSPGame game = new RSPGame();
        game.Run();
    }
}
*/

//E-10
/*
import java.util.Random;
import java.util.Scanner;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class GambleGame {
    private Person[] player = new Person[2];
    public Scanner sc;
    public int index;
    public String buffer;

    public GambleGame() {
        sc = new Scanner(System.in);
        index = 0;
    }

    public void run() {
        System.out.print("1번째 선수 이름 >>");
        player[0] = new Person(sc.nextLine());
        System.out.print("2번째 선수 이름 >>");
        player[1] = new Person(sc.nextLine());


        while(true) {
            System.out.print("[" + player[index].getName() + "]:<Enter>");
            sc.nextLine();
            int a = (int)(Math.random()*3+1);
            int b = (int)(Math.random()*3+1);
            int c = (int)(Math.random()*3+1);
            System.out.print("\t" + a + "\t" + b + "\t" + c + "\t");
            if(a == b && b == c){
                System.out.println(player[index].getName() + "님이 이겼습니다!");
                break;
            }
            else{
                System.out.println("아쉽군요!");
                index = index == 1 ? 0 : 1;
            }
        }
    }
}

public class Chap6_prac {
    public static void main(String[] args) {
        GambleGame game = new GambleGame();
        game.run();
    }
}
*/

//E-11
/*
import java.util.Scanner;

public class Chap6_prac {
    public static void main(String[] args) {
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuffer sb = new StringBuffer(text);

        while(true) {
            System.out.print("명령: ");
            String cmd = scanner.nextLine(); // 한 라인을 문자열로 읽는다.
            if(cmd.equals("그만")) {
                System.out.print("종료합니다");
                break;
            }
            String [] tokens = cmd.split("!");
            if(tokens.length != 2) {
                System.out.println("잘못된 명령입니다!");
            }
            else {
                if(tokens[0].length() == 0 || tokens[1].length() == 0) {
                    System.out.println("잘못된 명령입니다!");
                    continue;
                }

                int index = sb.indexOf(tokens[0]);
                if(index == -1) { // not found!
                    System.out.println("찾을 수 없습니다!");
                    continue;
                }
                sb.replace(index, index+tokens[0].length(), tokens[1]);
                System.out.println(sb.toString());
            }
        }
    }
}
*/

//E-12
/*
import java.util.Random;
import java.util.Scanner;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class GambleGame {
    private Person[] player;
    public Scanner sc;
    public int index, temp;
    public String buffer;

    public GambleGame() {
        sc = new Scanner(System.in);
        index = 0;
        temp = 0;
    }

    public void run() {

        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        index = sc.nextInt();
        player = new Person[index];
        buffer = sc.nextLine();
        for(int i = 0; i < index; i++){
            System.out.print(i+1 + "번째 선수 이름>>");
            player[i] = new Person(sc.nextLine());
        }

        while(true) {
            System.out.print("[" + player[temp].getName() + "]:<Enter>");
            sc.nextLine();
            int a = (int)(Math.random()*3+1);
            int b = (int)(Math.random()*3+1);
            int c = (int)(Math.random()*3+1);
            System.out.print("\t" + a + "\t" + b + "\t" + c + "\t");
            if(a == b && b == c){
                System.out.println(player[temp].getName() + "님이 이겼습니다!");
                break;
            }
            else{
                System.out.println("아쉽군요!");
                temp++;
                temp = index - 1 >= temp ? temp : 0;
            }
        }
    }
}

public class Chap6_prac {
    public static void main(String[] args) {
        GambleGame game = new GambleGame();
        game.run();
    }
}
*/
