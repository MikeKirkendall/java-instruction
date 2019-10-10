import java.text.NumberFormat;

public class NumberFormatApp {

	public static void main(String[] args) {
		double d1 = .2533333;
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		NumberFormat pf = NumberFormat.getPercentInstance();
		
		//set minimum fraction digits
		pf.setMinimumFractionDigits(2);
		
		//set maximum fraction digits added.3333 to d1 to change
		pf.setMaximumFractionDigits(4);
		
		System.out.println(cf.format(d1));
		System.out.println(pf.format(d1));
		
		
	}

}
