public class Statistik {
	public static void main(String[] args){
		double sum = 0.0;
		double[] numbers = new double[200];
		double mittelwert;
		double quadratSum = 0.0;
		double varianz;
		int arrayLength = numbers.length;
		
		for(int i = 0; i < arrayLength; i++){
			numbers[i] = (0 + Math.random() * 20);
			sum += numbers[i];
			}
			
		mittelwert =  sum / arrayLength;
		
		for(int i = 0; i < arrayLength; i++){
			quadratSum += numbers[i] - mittelwert;
			}
		
			
		varianz = Math.pow(quadratSum, 2) / (arrayLength - 1);
		
		
		System.out.println("Mittelwert: " + mittelwert + "\n" + 
							"Varianz: " + varianz);
		}
	}
