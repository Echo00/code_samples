public class Vertauschen{
	public static void main(String[] args){
		int[] digits = {2, 4, 6};
		int p = Terminal.askInt("p: ");
		int q = Terminal.askInt("q: ");
		for(int i = 0; i < digits.length; i++){
			for(int j = 0; j < digits.length; j++){
				if(i == p && j == q){
					int tmp1 = digits[i];
					int tmp2 = digits[j];
					digits[j] = tmp1;
					digits[i] = tmp2;
					}
				}
			}
		for(int i = 0; i < digits.length; i++){
			System.out.println(digits[i]);
			}
		}
	}
