package com.company;
import java.util.Scanner;

//형성평가3
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        dice(n, m);

    }
    static int a = 0;
    static int[] sum = new int [10];
    // String[] weeks = new String[7];      #배열선언


    static void dice(int N, int M)
    {
        int i=0;
        for (i = 1; i <= 6; ++i)
        {
            sum[a] = i;
            if (a == N - 1)
            {
                int total = 0;
                for (int j = 0; j <= a; ++j)
                    total += sum[j];

                if (total == M)
                {
                    for (int k = 0; k < N; ++k)
                        System.out.print(sum[k]);
                        System.out.print("\r\n");
                    return;
                }
            }
            else
            {
                a++;
                dice(N, M);
                a--;
            }
        }
    }

}

//import java.util.Scanner;
//
//class Printclass {
//    void print(int n) {
//        for (int i = n; i > 0; i--) {
//            System.out.print(i);
//            System.out.print(" ");
//
//        }
//        System.out.println();
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        new Printclass().print(n);
//    }
//
//}



//별찍기1번
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; ++i ){
//            for (int j = 0; j < i+1 ; ++j ) {
//                System.out.print("*");
//            }
//
//
//            System.out.println();
//        }
//    }
//}

//별찍기1번
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; ++i ){
//            for (int j = 0; j < i+1 ; ++j ) {
//                System.out.print("*");
//            }
//
//
//            System.out.println();
//        }
//    }
//}


//별찍기2번
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; ++i ){
//            for (int j = 0; j < n - i-1 ; ++j ) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i+1 ; ++k ) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//
//
//
//별찍기3번
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; ++i ){
//            for (int j = 0; j < n - i ; ++j ) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


// 별찍기4번
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; ++i ){
//            for (int j = 0; j < i ; ++j) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < n-i ; ++k) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//별찍기5번
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i< n ; ++i ){
//            for (int j = 0; j < n - i-1 ; ++j ) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < (2*i)+1 ; ++k ) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//별찍기6번
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i< n ; ++i ){
//            for (int j = 0; j < i ; ++j ) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < (2*n)-(2*i+1) ; ++k ) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//별찍기7번
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i< n ; ++i ) {
//            for (int j = 0; j < n-i-1; ++j) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <(2*i)+1; ++k) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        for (int i = 1; i< n ; ++i ) {
//            for (int j = 0; j < i; ++j) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < (2*n)-(2*i+1); ++k) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }
//}

//별찍기 8번
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i< n ; ++i ) {
//            for (int j = 0; j < i + 1; ++j) {
//                System.out.print("*");
//            }
//            for (int k = 0; k < (2 * n) - 2 * (i + 1); ++k) {
//                System.out.print(" ");
//            }
//            for (int z = 0; z < i + 1; ++z) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i< n ; ++i ) {
//            for (int j = 0; j < n-i ; ++j) {
//                System.out.print("*");
//            }
//            for (int k = 0; k <(2*i); ++k) {
//                System.out.print(" ");
//            }
//            for (int z = 0; z < n-i ; ++z) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//
//    }
//}

// 별찍기 9번
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i< n ; ++i ) {
//            for (int j = 0; j < i; ++j) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < (2 * n) - (2*i)-1; ++k) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//        for (int i = 1; i < n ; ++i ) {
//            for (int j = 0; j < n-i-1; ++j) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <(2*i)+1; ++k) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }
//}


//별찍기 12_old
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; ++i) {
//            for (int j = 0; j < n - i - 1; ++j) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i + 1; ++k) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i < n; ++i) {
//            for (int j = 0; j < i ; ++j) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < n-i; ++k) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//}

//별찍기 12
//import java.util.Scanner;
//        import static java.lang.Math.abs;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=0; i < n *2; i++){
//            for(int j=0 ;j< abs(i - 2); j++) {
//                System.out.print(" ");
//            }
//            for(int k=0 ; k < n-abs(i-2); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//별찍기 13_old
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; ++i) {
//            for (int j = 0; j < i + 1; ++j) {
//                System.out.print("*");
//            }
//            System.out.println();
//            }
//        for (int i = 1; i < n; ++i) {
//            for (int j = 0; j < n - i; ++j) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//별찍기 13번
//import java.util.Scanner;
//        import static java.lang.Math.abs;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=0; i < n *2; i++){
//            for(int j=0 ;j< n-abs(i - 2); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//별찍기 15번
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=1; i <= n ; i++){
//            for(int j=n-i; j > 0; j--){
//                System.out.print(" ");
//             }
//            for(int j=0; j< i*2-1; j++){
//                if(j==0 || j==i*2-2) {
//                    System.out.print("*");
//                }
//                    else {
//                    System.out.print(" ");
//                    }
//            }
//            System.out.println();
//        }
//    }
//}
//


//별찍기 16번_old
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=1; i <= n ; i++){
//            for(int j=n-i; j > 0; j--){
//                System.out.print(" ");
//            }
//            for(int j=0; j< i*2-1; j++){
//                if( j % 2 ==0 || j==i*2-2)   {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//별찍기 20번
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i = 0; i< n; i++){
//            if(i%2==1) {
//                System.out.print(" ");
//            }
//            for(int j=0; j< n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//자가진단1_old
//import java.util.Scanner;
//
//class Printclass {
//    void print(int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.print("recursive");
//            System.out.println();
//        }
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        new Printclass().print(n);
//    }
//
//}

//자가진단1
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        print(n);
//    }
//
//    static void print(int x) {
//        if( x > 0 ){
//            System.out.println("recursive");
//            x--;
//            print(x);
//        }
//
//    }
//}




//자가진단2_old
//import java.util.Scanner;
//
//class Printclass {
//    void print(int n) {
//        for (int i = n; i > 0; i--) {
//            System.out.print(i);
//            System.out.print(" ");
//
//        }
//        System.out.println();
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        new Printclass().print(n);
//    }
//
//}


//자가진단2
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        print(n);
//    }
//
//    static void print(int x) {
//        if( x > 0 ){
//            System.out.print(x);
//            System.out.print(" ");
//
//            x--;
//            print(x);
//        }
//
//    }
//}

//자가진단3
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int z= sum(n);
//        System.out.println(z);
//    }
//
//    static int sum(int x) {
//
//        if (x > 0) {
//            return x + sum(x - 1);
//        }
//        return 0;
//    }
//
//}

//자가진단 6
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int z= gop(n);
//        System.out.println(z);
//    }
//
//    static int gop(int x) {
//
//        if (x == 0) {
//            return 0;
//        }
//        return ((x % 10) * (x%10) + gop(x/10));
//    }
//}


//형성평가2
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        pr(n);
//    }
//
//    static int pr(int x) {
//        if (x <+ 0) {
//            return 0;
//        }
//        pr(x-2);
//
//        if (x > 0){
//            System.out.print(x + " ");
//        }
//        return 0;
//    }
//}

//형성평가3 (소스코드 이해안감 설명필요)
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        dice(n, m);
//
//    }
//    static int a = 0;
//    static int[] sum = new int [10];
//    // String[] weeks = new String[7];      #배열선언
//
//
//    static void dice(int N, int M)
//    {
//        int i=0;
//        for (i = 1; i <= 6; ++i)
//        {
//            sum[a] = i;
//            if (a == N - 1)
//            {
//                int total = 0;
//                for (int j = 0; j <= a; ++j)
//                    total += sum[j];
//
//                if (total == M)
//                {
//                    for (int k = 0; k < N; ++k)
//                        System.out.print(sum[k]);
//                    System.out.print("\r\n");
//                    return;
//                }
//            }
//            else
//            {
//                a++;
//                dice(N, M);
//                a--;
//            }
//        }
//    }
//
//}