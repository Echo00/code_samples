public class ArraySearch{
	public static void main(String[] args){
		int[] digits = {2, 4, 6, 2, 0};
		int tmp = -1;
		int searchKey = Terminal.askInt("value: ");
		for(int i = 0; i < digits.length; i++){
			if(digits[i] == searchKey){
				tmp = i;
				}						
			}
			if(tmp < 0){
				System.out.println("Error");
				} else {
					System.out.println(tmp);
					}
			
		}
	}
