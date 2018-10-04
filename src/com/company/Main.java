package com.company;

//별찍기16번
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i <= n ; i++){
            for(int j=n-i; j > 0; j--){
                System.out.print(" ");
             }
            for(int j=0; j< i*2-1; j++){
                if( j % 2 ==0 || j==i*2-2)   {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//   if(j==0 || j==i*2-2) {
//   if(i%2==1){


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

//별찍기8번
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

// 별찍기9번
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


//별찍기12
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



//별찍기13
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


//별찍기15번
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
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
//

//별찍기20번
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
//            if(i%2==1){
//                System.out.print(" ");
//            }
//            for(int j=0; j< n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//별찍기16번
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
