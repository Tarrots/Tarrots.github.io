import java.util.Scanner;

public class MangMotChieu {
	public static Scanner inp = new Scanner(System.in);
	public static void max(int arr[], int n)
	{
		int max = arr[0];
		for(int i = 1; i < n; i ++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("\nGiá trị lớn nhất mảng là: " + max);
	}
	public static void main(String[] args) {
		int n;
		System.out.println("============= Mảng Một Chiều =============\n");
		System.out.print("Nhập độ dài của mảng: ");
		n = inp.nextInt();
		System.out.println("\n");
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++)
		{
			System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
			arr[i] = inp.nextInt();
		}
		max(arr, n);
	}
}
