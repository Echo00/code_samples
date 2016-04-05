public class EvenNumber{
	public static void main(String[] args){
		System.out.println("Bitte die erste Zahl eingeben");
		int a = Terminal.readInt();
		System.out.println("Bitte die zweite Zahl eingeben");
		int b = Terminal.readInt();
		int i = 0;
		if( a % 2 == 0){
			i = a;
			} else {
				i = a + 1;
				}
		while( i <= b){
				System.out.println( i + " ist eine gerade Zahl");
				i = i + 2;
			}
		}
	}
