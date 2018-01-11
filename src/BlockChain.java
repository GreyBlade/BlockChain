import java.util.ArrayList;

public class BlockChain {

	private ArrayList<Block> chain;
	
	public BlockChain(String[] transacciones){
		Block block1 = new Block(0, transacciones);
		this.chain.add(block1);
	}
	
	
	public void Add(Block b){
		this.Add(b);
	}
	
	public void Add(String[] trans){
		int previousHash = this.chain.get(this.chain.size()).getHashCode();
		Block b1 = new Block(previousHash, trans);
		this.Add(b1);
	}
}
