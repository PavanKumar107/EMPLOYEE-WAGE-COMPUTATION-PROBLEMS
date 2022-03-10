
public class UC5 {
		public static final int parttime = 1;
	    public static final int fulltime= 2;
	    public static final int empwageperhr = 100;
	    public static final int numofworkingdays = 20;
	    public static void main(String[] args) {
	        int emphrs = 0;
	        int empwage = 0;
	        int totalempwage = 0;
	        for(int day=0; day<numofworkingdays; day++) {
	            int empcheck = (int) Math.floor(Math.random()*10)%3;
	            switch(empcheck) {
	            case parttime:
                    emphrs = 4;
                    break;
                case fulltime:
                    emphrs = 8;
                    break;
                default:
                    emphrs = 0;
	          }
            empwage = emphrs * empwageperhr;
            totalempwage+=empwage;
            System.out.println("Emp wage:" + empwage);
	        }
        System.out.println("Total emp wage:" + totalempwage);
	    }

}

