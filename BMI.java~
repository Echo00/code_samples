public class BMI {
	public static void main(String[] args){
		
		double kGrösse = Terminal.askDouble("Bitte geben Sie Ihrer Körpergröße in Metern ein:");
		while(kGrösse < 0){
			kGrösse = Terminal.askDouble("Körpergröße kann nicht negativ sein! "+ "\n" +
							" Bitte geben Sie Ihrer Körpergröße in Metern ein:");
		}
		System.out.println();
		double gewicht = Terminal.askDouble("Bitte geben Sie Ihr Gewicht ein:");
		while(kGrösse < 0){
			gewicht = Terminal.askDouble("Gewicht kann nicht negativ sein! " + "\n"
							+ "Bitte geben Sie Ihr Gewicht ein:");
		}
		String klassifizierung;
		double bmi = gewicht/Math.pow(kGrösse, 2);
		if(bmi < 18.5){
				klassifizierung = "Untergewicht";
				System.out.println(klassifizierung);
			} else if(bmi < 25){
				klassifizierung = "Normalgewicht";
				System.out.println(klassifizierung);
			} else if(bmi < 30){
				klassifizierung = "Übergewicht";
				System.out.println(klassifizierung);
			} else {
				klassifizierung = "Adipositas";
				System.out.println(klassifizierung);
			}
	}
}
