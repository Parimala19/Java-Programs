import java.util.Scanner;
public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.print("Enter 5 sub marks : ");
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        sc.close();
    }
}
