package pack;

public class CarrerExpert {

	public String giveAdvice(String qualification) {
		if(qualification.equalsIgnoreCase("BE")) {
			return "DAC";
		}
		if(qualification.equalsIgnoreCase("MCOM")) {
			return "Tally";
		}
		else
			return "enter valid qualification";
	}

}
