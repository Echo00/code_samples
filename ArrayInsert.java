public class ArrayInsert{
	public static void main(String[] args){
		System.out.println("Wie viele Elemente sollte das Element enthalten ? :");
		int arrLength = Terminal.readInt();
		int[] digits = new int[arrLength];
		for(int i = 0; i < arrLength; i++){
			digits[i] = Terminal.askInt("i: ");
			}
			for(int j = 0; j < arrLength; j++){
				System.out.println("Folgende Werte wurden hinzugefügt:");
				System.out.println("index " + j + ", value: " + digits[j]);
				}
		}
	}
