import java.util.Arrays;

public class JavaBlockChain {

	
	public static void main(String[]args) {
		
		String[] transaccion1 = {"a","b","c"};
		String[] transaccion2 = {"a2","b2","c2"};
		
		System.out.println("trans1 -> " + Arrays.hashCode(transaccion1));
		System.out.println("trans2 -> " + Arrays.hashCode(transaccion2));

		
		BlockChain chain1 = new BlockChain(transaccion1);
		System.out.println("hash posicion 2 -> " + chain1.GetHashBlock(0));
		chain1.AddtoBlock(transaccion2);
		System.out.println("hash posicion 1 -> " + chain1.GetHashBlock(1));

	}
}
