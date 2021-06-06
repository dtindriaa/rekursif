package dita.program;

public class Rekursif {
    
    static int index = 0;
 
    static String str = "";
 
    public static void main(String[] args) {
 
        Fibonacci(10);
 
    }
 
    static void Fibonacci(int batas) {
 
        int temp1 = 1;
 
        int temp2 = 2;
 
        if (index < batas) {
 
            if (index == 0) {
 
                System.out.print(temp1 + " ");
 
                str += temp1 + ";";
 
            } else if (index == 1) {
 
                System.out.print(temp2 + " ");
 
                str += temp2 + ";";
 
            } else {
 
                String[] arr = str.split(";");
 
                temp1 = Integer.parseInt(arr[arr.length - 1]);
 
                temp2 = Integer.parseInt(arr[arr.length - 2]);
 
                System.out.print((temp1 + temp2) + " ");
 
                str += (temp1 + temp2) + ";";
 
            }
 
            index++;
 
            Fibonacci(batas);
 
        }
 
    }
}