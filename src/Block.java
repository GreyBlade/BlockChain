import java.util.Arrays;

public class Block {

	private String[] transacciones;
	private int previousHash;
	private int currentHash;
	
	public Block(int previousHash, String[] trans){
		this.transacciones = trans;
		this.previousHash = previousHash;
		Object[] hashes = {Arrays.hashCode(this.transacciones), this.previousHash};
		this.currentHash = Arrays.hashCode(hashes);
	}
	
	public int getHashCode(){
		return this.currentHash;
	}
	
}
