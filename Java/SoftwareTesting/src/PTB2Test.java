import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PTB2Test {
    private static int a[] = {0,0,0,1,8,6};
    private static int b[] = {0,0,1,2,4,1};
    private static int c[] = {1,0,5,1,-12,1};
    private static String outputGiaiB1[] = {"Vô nghiệm","Vô số nghiệm","Có một nghiệm là -5",
							"Một nghiệm kép -1","2 nghiệm x1 = 1 x2 = -1.5","Vô nghiệm"};
    @Test
    void testGiaiB1() {
        for(int i = 0; i < 3;i++){
            int b = this.b[i];
            int c = this.c[i];
            assertEquals(this.outputGiaiB1[i],PTB1.giaiB1(b,c));
        }
    }
    @Test
    void testGiaiB2() {
        for(int i = 0; i < 3;i++){
            int a = this.a[i];
            int b = this.b[i];
            int c = this.c[i];
            assertEquals(this.outputGiaiB1[i],PTB2.giaiB2(a,b,c));
        }
    }
}