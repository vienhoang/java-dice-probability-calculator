import java.text.DecimalFormat;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] times = new int[6];
		int total = 0;
		String inputRolls;
		int rolls;
		
		System.out.println("Vien's Dice Probability Calculator");
		inputRolls = InputHelper.getInput("Enter how many times you want roll the dice: ");
		rolls = Integer.parseInt(inputRolls);
		
		
		for (int i = 0; i < rolls; i++) {
			times[rand.nextInt(6)] +=1;
		}
		
		System.out.println("\nFace\tTimes\tPercent");
		
		for (int i = 0; i < times.length; i++) {
			total += times[i];
			double percent = ((double)times[i] * 100 / rolls);
			// alt. String roundedPercent = new DecimalFormat("0.00").format(percent);
			
			System.out.println((i+1) + "\t" + times[i] + "\t" +String.format("%.2f", percent));
		}
		
		System.out.println("\nTotal times the dice has been rolled: " + total);
		

	}

}
