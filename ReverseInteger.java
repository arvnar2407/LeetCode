
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = reverse(-2147483412);
		System.out.println("final "+answer);
	}
	public static int reverse(int x) {
        int temp=0;
        int reverse=0;
        int first =x ;
        if(x>0 && x<10){
            return x;
        }
        
        while (x != 0) {    
            temp = x % 10;
               
           int temp3 = reverse;      
           reverse = (reverse * 10 + temp);
            long temp2 = ((long)temp3 * 10 + temp);
            System.out.println(reverse);
            System.out.println(temp2);
            if(temp2 < Integer.MIN_VALUE)
            {
                return 0;
            }
            else if(temp2 > Integer.MAX_VALUE)
            {
                return 0;
            }
             
            x = x / 10; 
            
    } 
        
        return reverse;
    }

}
