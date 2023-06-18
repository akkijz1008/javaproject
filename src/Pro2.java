
public class Pro2 {
    //program to list factorial of numbers 1 to 10
	public static void main(String[] args) {
		   int num = 1;
		   while(num<=10){
			  int factorial = 1;
			  int i = num;
			  while(i>0){
				  factorial *= i;
				  i--;
			  }
    System.out.println("factorial of " + num + " is :" + factorial);
                        num++;
		   }

	}

}
