
public class test2 {

	
	public static void main(String[] args) {
		
		String word ="baaabbabbb";
		
		char[] array_word = new char[word.length()];
		int count = 0 ;
		for(int i=0; i<array_word.length; i++) {
			
			array_word[i] = word.charAt(i);
			
//			if(array_word[i] == array_word[i+1]) {
//				 count += 1;
//			}
		}
		for(int j =0; j < array_word.length-1; j++) {
			if((array_word[j] == array_word[j+1])) {
				count += 1;
				System.out.println("╬хЁГ");
			}
			System.out.print("д╚©Нем "+count);
//			System.out.print(array_word[j]+ " ");
		}
		
	}
}
