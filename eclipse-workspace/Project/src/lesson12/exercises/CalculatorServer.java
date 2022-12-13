package lesson12.exercises;

import java.io.IOException;
import java.net.ServerSocket;

public class CalculatorServer extends ServerSocket {
 
	public CalculatorServer(int port) throws IOException {
		super(port); 
	}
 
	public String menu() {
		return "1. Mblidh\n"
				+ "2. Zbrit\n"
				+ "3. Shumezo\n"
				+ "4. Pjesto\n"
				+ "5. Gjej Mbetjen\n"
				+ "6. Perfundo\n";
	}

	public String calculateSum(double n1, double n2) {
		return "Shuma e numrave " + n1 +
				" dhe " + n2 + " eshte " + 
				(n1 + n2) + ".";
	}

	public String calculateDiff(double n1, double n2) {
		return "Difrenca e numrave " + n1 +
				" dhe " + n2 + " eshte " + 
				(n1 - n2) + ".";
	}

	public String calculateMul(double n1, double n2) {
		return "Prodhimi i numrave " + n1 +
				" dhe " + n2 + " eshte " + 
				(n1 * n2) + ".";
	}

	public String calculateRap(double n1, double n2) {
		if(n2 == 0) {
			return "Raporti i numrave " + n1 +
					" dhe " + n2 + 
					" eshte i pallogaritshem.";
		}
		return "Raporti i numrave " + n1 +
				" dhe " + n2 + " eshte " + 
				(n1 / n2) + ".";
	}

	public String calculateRem(double n1, double n2) {
		if(n2 == 0) {
			return "Mbetja nga raporti i plote i numrave " + n1 +
					" dhe " + n2 + " eshte e pallogaritshme.";
		}
		return "Mbetja nga raporti i plote i numrave " + n1 +
				" dhe " + n2 + " eshte " + (n1 % n2) + ".";
	}
	
}
