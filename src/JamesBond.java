
public class JamesBond {
	
	public static void main(String[] args) {
		
		Vault v = new Vault();
		findCode(v);
	}
	 public static int findCode (Vault v) {
		 for (int i = 0; i < 1000000; i++) {
			if (v.tryCode(i)) {
				return i;
			}
		}
		return -1; 
	 }
	
}
