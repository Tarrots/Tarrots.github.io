import java.text.DecimalFormat;
// Quy ước bx + c = 0; 
public class PTB1 {
    private int b;
    private int c;

    public PTB1(int b, int c) {
        this.b = b;
        this.c = c;
    }
    public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public static String giaiB1(int b, int c){
        if(b == 0){
            if(c == 0)
                return ("Vô số nghiệm");
            else
                return ("Vô nghiệm");
        }else{
            return ("Có một nghiệm là " + new DecimalFormat("#.##").format(-c/b));
        }
    }
    public String giaiB1(){
        if(b == 0){
            if(c == 0)
                return ("Vô số nghiệm ");
            else
                return ("Vô nghiệm");
        }else{
            return ("Có một nghiệm là " + new DecimalFormat("#.##").format(-c/b));
        }
    }
}
