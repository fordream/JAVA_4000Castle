package Data;

import java.util.ArrayList;

public class Map 
{
	private final int size = 10;
	private final Block emptyBlock = new Block("", 0);
	
	// x y�� arrayBlock[ y ][ x ] �̷� ������ ó���Ѵ�.
	private Block arrayBlock[][];
	private ArrayList< Block > useBlockList;
	private int bestGrade;
	
	
	// constructors /////////////////////////////////////////////////////////
	public Map()
	{
		// �׵θ��� �־� �ֱ� ���ؼ� size + 2�� ��
		arrayBlock = new Block[ size + 2 ][ size + 2 ];
		useBlockList = new ArrayList< Block >();
		bestGrade = 0;
		
		// ��� ������� empty�� ����
		for ( int y = 0; y <= size + 1; y++ )
			for ( int x = 0; x <= size + 1; x++ )
				arrayBlock[ y ][ x ] = emptyBlock;
	}

	
	
	
	// getter setter ///////////////////////////////////////////////////////
	public Block[][] getArrayBlock() {
		return arrayBlock;
	}

	public void setArrayBlock(Block[][] arrayBlock) {
		this.arrayBlock = arrayBlock;
	}

	public ArrayList<Block> getUseBlockList() {
		return useBlockList;
	}

	public void setUseBlockList(ArrayList<Block> useBlockList) {
		this.useBlockList = useBlockList;
	}

	public int getBestGrade() {
		return bestGrade;
	}

	public void setBestGrade(int bestGrade) {
		this.bestGrade = bestGrade;
	}
	
	
}
