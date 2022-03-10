
public class UC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int parttime = 1;
	        int fulltime = 2;
	        int empwageperhr = 20;
	        int emphrs = 0;
	        int empwage = 0;
	        double empcheck = Math.floor(Math.random()*10)%3;
	        if(empcheck == parttime)
	            emphrs = 4;
	        else if(empcheck == fulltime)
	            emphrs = 8;
	        else
	            emphrs = 0;
	        empwage = emphrs * empwageperhr;
	        System.out.println("Emp wage:" + empwage);
	}

}
