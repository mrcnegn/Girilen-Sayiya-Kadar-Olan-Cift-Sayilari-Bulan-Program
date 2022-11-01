package ortalama;
import java.util.Scanner;
public class ortalama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int a,i=1,total=0,t;
	    int b=1;
	    System.out.println("bir sayý giriniz: ");
	    a = input.nextInt();
	    for(;i<=a;i++) {
	    	
	    	if(i%3==0 && i%4==0) {
	    		
	    		total +=i;
	    		b++;
		    	
	    	System.out.println("say11136ý: " + i);
	    	}
	    }
	    t=(total/(b-1));
	    	
	    System.out.println("sayý: " + t);

	}

}
