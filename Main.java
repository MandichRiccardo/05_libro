import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Libro l1 = new Libro();
        Libro l2 = new Libro();
        l1.sconta(2023);
        l2.sconta(2023);
        output(l1.getInfoLibro());
        output(l2.getInfoLibro());
        output(l1.ugualeA(l2)+"");
    }
    
    public static void output(String a){
        System.out.print(a+"\n");
    }
    public static int input(String a){
        output(a);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static String strput(String a){
        output(a);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static double douput(String a){
        output(a);
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}