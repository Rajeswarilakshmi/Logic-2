package Logic2;

public class BlackJack {
	public static int blackjack(int a, int b) {
		if (a > 21 && b > 21) {
			      return 0;
			  }else if (a > 21) {
			      return b;

			  } else if (b > 21) {
			      return a;
			  }
			  int sumA = 21 - a;
			  int sumB = 21 - b;
			  if (sumA > sumB) {
			      return b;
			  } else {
			      return a;
			  }  
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackJack blackjack=new BlackJack();
		System.out.println(BlackJack.blackjack(19, 21));
		System.out.println(BlackJack.blackjack(21, 19));
		System.out.println(BlackJack.blackjack(19, 22));
		

	}

}
