
public class UC4 {
		// TODO Auto-generated method stub
		 public static final int parttime = 1;
		    public static final int fulltime = 2;
		    public static final int empwageperhr = 100;
		    public static void main(String[] args) {
		        int emphrs = 0;
		        int empwage = 0;
		        int empcheck = (int) Math.floor(Math.random()*10)%3;
		        switch(empcheck) {
		            case parttime:
		                emphrs = 5;
		                break;
		            case fulltime:
		                emphrs = 10;
		                break;
		        default:
		                emphrs = 0;
		        }
		        empwage = emphrs * empwageperhr;
		        System.out.println("Emp wage:" + empwage);

	}

}
