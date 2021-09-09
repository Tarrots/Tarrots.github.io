package JUnit;

public class PTB1 {
	private int a,b;
	public PTB1()
	{
		this.a = 0;
		this.b = 0;
	}
	public PTB1(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public PTB1(PTB1 ptb1)
	{
		this.a = ptb1.a;
		this.b = ptb1.b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public static void GiaiPTB1(int a, int b) {
		
	}
	
}
