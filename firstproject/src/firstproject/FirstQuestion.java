package firstproject;

public class FirstQuestion {
	static long findReverse(long number) {
		long temp = number, reverseNumber=0, lastNumber;
		while(temp != 0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber *10) + lastNumber;
			temp /=10;
		}
		return reverseNumber;
	}
	
	static boolean isPolindrom(long number) {
		return findReverse(number) == number ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxChainLength = 0;
		int maxChainNum = 0;
		String maxChain = "";
		for(int i=10; i<=100; i++) {
			long temp = i;
			int chainLength= 0;
			String chain = "";
			while(!isPolindrom(temp)) {
				long reverse = findReverse(temp);
				long oldTemp = temp;
				temp = temp + reverse;
				String word = String.format("%d + %d = %d ", oldTemp, reverse, temp);
				chain += word;
				chainLength ++;
			}
			if(chainLength > maxChainLength ) {
				maxChainLength = chainLength;
				maxChainNum = i;
				maxChain = chain;
			}
		}
		System.out.println(maxChain);

	}

}
