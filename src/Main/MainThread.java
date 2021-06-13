package Main;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phẩn tử thứ " + (i + 1));
            array[i] = scanner.nextInt();
            if (array[i] >= max) {
                max = array[i];
            }
        }
        System.out.printf("Phần tử lớn nhất của mảng là: %d", max);

    }
}
