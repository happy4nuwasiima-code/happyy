package Abc;
import java.util.Scanner;

class Clas {

	public  void cal(String a) {
		
		
		a="student's payment";
		System.out.println(a);
	}
	public void cal(int fesspaid) {
		Scanner scan =new Scanner(System.In);
		int feespaid,surcharge=50000;
		feespaid=scan.nextInt();
		if(feespaid<=1000000) {
			
			System.out.println("late Registration");
			
	        System.out.println("surcharge:Ugs"+surcharge);
		}else {
			
		    System.out.println("regestered succssfully");
			
		}
        }

       }
 class A extends Clas{
	 public static void main(String[] args) {
		 A obj = new A();
		 obj.cal(0);
		 
		 
	 }
	
}

	

	
	

