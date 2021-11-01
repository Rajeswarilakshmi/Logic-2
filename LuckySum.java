package Logic2;

public class LuckySum {
	public static  int luckySum(int a, int b, int c) {
		 if (a == 13)
			    return 0;
			  else if (b == 13)
			    return a;
			  else if (c == 13)
			    return a + b;
			  else
			    return a + b +c;
			
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuckySum luckySum=new LuckySum();
		System.out.println(LuckySum.luckySum(1, 2, 3));
		System.out.println(LuckySum.luckySum(1, 2, 13));
		System.out.println(LuckySum.luckySum(1, 13, 3));

	}

}
