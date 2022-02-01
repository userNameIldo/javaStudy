package exam21;

import java.util.Stack;

public class StackCoin {

	public static void main(String[] args) {
		
		Stack<Coin> insertCoin = new Stack<>();
		
		insertCoin.push(new Coin(100));
		insertCoin.push(new Coin(50));
		insertCoin.push(new Coin(80));
		insertCoin.push(new Coin(150));
		
		while(!insertCoin.isEmpty()) {
			Coin coin = insertCoin.pop();
			
			System.out.println("동전은 : " + coin.getCoin() + "원");
			
		}
		
	}

}
