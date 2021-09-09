import java.util.Scanner;

public class TamGiac {
	public static Scanner inp = new Scanner(System.in);

	public static void ktra_TamGiac(int a, int b, int c) {
		if ((a + b) <= c || (b + c) <= a || (a + c) <= b)
			System.out.println("\nĐây không phải là tam giác");
		else if (a == b && b == c)
			System.out.println("\nĐây tam giác đều");
		else if (a == b || a == c || b == c)
			System.out.println("\nĐây là tam giác cân");
		else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a)
			System.out.println("\nĐây là tam giác vuông");
		else
			System.out.println("\nĐây là tam giác thường");
	}

	public static void main(String[] args) {
		int a, b, c;
		// Nhập độ dài 3 cạnh của tam giác
		System.out.println("========== Nhập độ dài 3 cạnh của tam giác! ==========\n");
		System.out.print("Nhập độ dài cạnh thứ nhất: ");
		a = inp.nextInt();
		System.out.print("Nhập độ dài cạnh thứ hai: ");
		b = inp.nextInt();
		System.out.print("Nhập độ dài cạnh thứ ba: ");
		c = inp.nextInt();

		// Kiểm tra
		ktra_TamGiac(a, b, c);
	}

}
