import java.util.Scanner;

public class xuLy {
    public static void main(String[] args) {
        int n;
        int size = 20;

        Scanner nhap = new Scanner(System.in);

        System.out.print("Nhập số phần tử mảng: (n<=20) ");
        n = nhap.nextInt();

        int [] arr = new int[size];

        for (int i =0; i < n; i++){
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            arr[i] = nhap.nextInt();
        }
        System.out.println("Mảng sau khi nhập: ");
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("Nhập phần tử muốn thêm: ");
        int x = nhap.nextInt();

        insert(arr,size,n,x);
        System.out.println("Sau khi thêm: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
    public static int insert (int[]arr, int size, int n, int x){
        if (n > size && n<0){
            return n;
        }
        arr[n] = x;
        return n+1;
    }
}
