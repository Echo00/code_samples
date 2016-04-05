public class Game {
	public static void main(String[] args){
		String firstPlayer;
		String secondPlayer;
		int summe = 0;
		int digitPlayerOne;
		int digitPlayerTwo;
		// Namen des ersten Spieler erfragen
		System.out.println("Bitte name des ersten Spieler eingeben:");
			firstPlayer = Terminal.readString();
			// Prüfe ob Name nicht leer ist, wenn ja Meldung ausgeben und erneuet erfragen
			while(firstPlayer.equals("")){
				System.out.println("Ungültige Name!");
				System.out.println("Bitte Gültiger Name des ersten Spieler eingeben:");
				firstPlayer = Terminal.readString();
			}
		// Namen des zeiten Spieler erfragen
		System.out.println("Bitte name des zweiten Spieler eingeben:");
			secondPlayer = Terminal.readString();
			// Prüfe ob Name nicht leer ist, wenn ja Meldung ausgeben und erneuet erfragen
			while(secondPlayer.equals("")){
				System.out.println("Ungültige Name!");
				System.out.println("Bitte Gütiger Name des zweiten Spieler eingeben:");
				secondPlayer = Terminal.readString();
			}
		System.out.println("Name von Spieler 1: " + firstPlayer);
		System.out.println("Name von Spieler 2: " + secondPlayer);
		
		// Solange 100 nicht erreicht ist
		while( summe < 100 ){
			// Mit dem ersten Spieler beginnen
		System.out.println(firstPlayer + ", bitte gib eine Zahl zwischen 1 und 10 ein!");
		digitPlayerOne = Terminal.readInt();
			if(digitPlayerOne < 1 || digitPlayerOne > 10){
				System.out.println("Falsche Zahl. Bitte Zahl zwischen 1 und 10 eingeben!");
				}
				summe += digitPlayerOne; 
		System.out.println(secondPlayer + ", bitte gib eine Zahl zwischen 1 und 10 ein!");
		digitPlayerTwo = Terminal.readInt();
			if(digitPlayerTwo < 1 || digitPlayerTwo > 10){
				System.out.println("Falsche Zahl. Bitte Zahl zwischen 1 und 10 eingeben!");
				}
				summe += digitPlayerTwo;
				if(summe == 100){
						System.out.println(firstPlayer + " hat gewonnen!");
						} else {
						System.out.println(secondPlayer + " hat gewonnen!");
							}

		 }
	}
}
