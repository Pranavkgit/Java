import java.text.DecimalFormat;
import java.math.RoundingMode;
public class bike_time {
    
    public static void main(String[] args) {
        int n=808;
        float x=((float)n)/60;
        DecimalFormat df=new DecimalFormat(".00");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println(df.format(x));
    }
}