public class Vertauschen{
	public static void main(String[] args){
		int[] digits = {2, 4, 6};
		int p = Terminal.askInt("p: ");
		while(p > digits.length -1){
			System.out.println("Wert ausserhalb der Array Länge");
			p = Terminal.askInt("p: ");
		}
		int q = Terminal.askInt("q: ");
		while(q > digits.length -1){
			System.out.println("Wert ausserhalb der Array Länge");
			q = Terminal.askInt("q: ");
		}
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
