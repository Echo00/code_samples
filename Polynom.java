public class Polynom {
	public static void main(String[] args){
		double x;
		double y;
		x = 0;
		y = 0;
		x = 2.5;
		y = ((Math.pow((x - 6), 2)/5) * x) + (2 * Math.pow(x, 2)) - x + 1/8;
		System.out.println("y(" + x +") = " + y);
	}
}
