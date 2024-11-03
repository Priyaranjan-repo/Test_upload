
public class NearestNo {

	public static void main(String[] args) {

		double no = 47;

		double nearestNo = 0;
		if (Math.floor(Math.sqrt(no)) - Math.sqrt(no) == 0) {
			nearestNo = Math.floor(Math.sqrt(no));
		} else
			nearestNo = Math.floor(Math.sqrt(no)) + 1;
		System.out.println("Nearest sq no: " + (int) nearestNo);
	}
}
