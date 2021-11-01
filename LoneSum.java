package Logic2;

public class LoneSum {
	public  static int loneSum(int a, int b, int c) {
		 if ( a == b && b == c)
			     return 0;
			   if (a == b)
			     return c;
			   if (b == c)
			     return a;
			   if (a == c)
			     return b;
			   else
			     return a + b + c;

		  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoneSum loneSum=new LoneSum();
		System.out.println(LoneSum.loneSum(1, 2, 3));
		System.out.println(LoneSum.loneSum(3, 2, 3));
		System.out.println(LoneSum.loneSum(3, 3, 3));


	}

}
