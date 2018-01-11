import java.util.ArrayList;

public class BlockChain {

	private ArrayList<Block> chain= new ArrayList<Block>();
	
	public BlockChain(String[] transacciones){
		Block block1 = new Block(0, transacciones);
		this.chain.add(block1);
	}
	
	
	public void Add(Block b){
		this.Add(b);
	}
	
	public void AddtoBlock(String[] trans){
		int previousHash = chain.get(chain.size()-1).getHashCode();
		Block b1 = new Block(previousHash, trans);
		this.chain.add(b1);
	}
	
	public int GetHashBlock(int index){
		return ((Block)chain.toArray()[index]).getHashCode();
	}
	
	
}
