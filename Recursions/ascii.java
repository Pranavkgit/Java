public class ascii{
   public static void solution(String code) {
        double sum=0;
        int idx=0;
        double p=0;
        double x=2;
        for(int i=code.length()-1;i>=0;i--)
        {
            int c=code.charAt(i)-'0';
            sum=sum+(c*Math.pow(x,p));
            idx++;
            p++;
            if(idx>7)
            {
                System.out.println(sum);
                sum=0;
                idx=0;
                p=0;
            }
        }
    }
    public static void main(String[] args)
    {
       String code= "010010000110010101101100011011000110111100100001";
       solution(code);
    }
}