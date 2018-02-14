import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Headphone korvaKlapid1 = new Headphone("Bludio", 50, false);
		System.out.println(korvaKlapid1);
		System.out.println("Kas on kallis: " + korvaKlapid1.isExpensiveString());
		System.out.println(korvaKlapid1.isExpensive() ? "K�rvaklapid on kallid" : "K�rvaklapid on odavad");
		
		Headphone korvaKlapid2 = new Headphone("Samsung");
		korvaKlapid2.setPrice(154.50);
		System.out.println(korvaKlapid2);
		
		List<String> specs = new ArrayList<>(Arrays.asList("mikrofon", "m�rasummutaja"));
		Headphone korvaklapid3 = new Headphone("Sony", 180, false, specs);
		korvaklapid3.addSpecification("NFC");
		System.out.println(korvaklapid3);
	}
}
