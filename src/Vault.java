import java.util.Random;

public class Vault {
		
		int secretCode = new Random().nextInt(1_000_001);
		
		boolean tryCode(int number){
			return (number == secretCode); 
		}
		
}
