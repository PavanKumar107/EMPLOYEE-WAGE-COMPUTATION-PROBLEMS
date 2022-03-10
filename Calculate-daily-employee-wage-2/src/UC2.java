
public class UC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 1;
	        int empwageperhr = 20;
	        int emphrs = 0;
	        int empwage = 0;
	        double empcheck = Math.floor(Math.random()*10)%2;
	        if(empcheck == a)
	            emphrs = 8;
	        else
	            emphrs = 0;
	        empwage = emphrs * empwageperhr;
	        System.out.println("Emp wage:" + empwage);
	}

}
