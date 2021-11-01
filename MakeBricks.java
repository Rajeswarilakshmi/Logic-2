package Logic2;

public class MakeBricks {
	public static  boolean makeBricks(int small, int big, int goal) {
			  int digit = goal % 10;
			  if (goal > small + (big * 5))
			   return false;
			  if (digit < 5 && small < digit)
			    return false;
			  else if (digit > 5 && digit > small + 5)
			    return false;
			  else
			    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeBricks makeBricks=new MakeBricks();
		System.out.println(MakeBricks.makeBricks(3, 1, 8));
		System.out.println(MakeBricks.makeBricks(3, 1, 9));
		System.out.println(MakeBricks.makeBricks(3, 2, 10));



	}

}
