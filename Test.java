public class Test{
	public static void main(String[] args){
		int sum = 0;
		double[] numbers = new double[200];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (0 + Math.random() * 20);
			//System.out.println("Index: " + i + ", Value: " + numbers[i]);
			sum += numbers[i];
			}
			System.out.println("Die gesamte Summe ist: " + sum);
		}
	}
