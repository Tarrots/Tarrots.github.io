import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        PTB2 pt2 = new PTB2(6,1,1);
        System.out.println(pt2.giaiB2());
        System.out.println(new DecimalFormat("#.##").format(1));
    }
}
