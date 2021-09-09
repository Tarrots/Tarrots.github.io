import java.lang.Math;
import java.text.DecimalFormat;
public class PTB2 extends PTB1{ 
    private int a;
    public PTB2(int a, int b, int c) {
        super(b, c);
        this.a = a;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public static String giaiB2(int a, int b,int c){
        if(a==0) return giaiB1(b,c);
        else{
            float delta = (float) b*b - 4*a*c;
            if(delta==0){
                return "1 nghiệm kép" + -b/(2*a);
            }else
            if(delta>0){
                return "2 nghiệm x1 = "+new DecimalFormat("#.##").format((-b+Math.sqrt(delta))/(2*a))+" x2 = "+
				new DecimalFormat("#.##").format((-b-Math.sqrt(delta))/(2*a));
            }else{
                return ("Vô nghiệm");
            }
        }
    }
    public String giaiB2(){
        int a = getA();
        int b = getA();
        int c = getB();
        if(a==0) return giaiB1();
        else{
            float delta = (float) b*b - 4*a*c;
            if(delta==0){
                return ("Một nghiệm kép " + -b/(2*a));
            }else
            if(delta>0){
                return ("Hai nghiệm x1 = "+new DecimalFormat("#.##").format((-b+Math.sqrt(delta))/(2*a))+" x2 = "+
				new DecimalFormat("#.##").format((-b-Math.sqrt(delta))/(2*a)));
            }else{
                return ("Vô nghiệm");
            }
        }
    }
}
