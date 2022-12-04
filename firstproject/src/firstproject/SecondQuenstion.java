package firstproject;

public class SecondQuenstion {
	static void draw(int starLength) {
		int wordLength= (starLength*2) + 2;
		
		for(int i=1; i<=starLength; i++) {
			String word = "";
			for(int j=0; j < wordLength; j++) {
				if(j < i || wordLength - j  <= i) {
					word += "*";
					
				}
				else {
					word += " ";
				}
			}
			System.out.println(word);
			
		}
		
	}
	
	public static void main(String[] args) {
		draw(5);
	}

}
