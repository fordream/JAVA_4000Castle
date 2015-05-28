package Data;

import java.util.ArrayList;

public class Game 
{
	private ArrayList< Map > mapList;
	private ArrayList< Block > blockList;
	
	
	// constructor ///////////////////////////////////////////////////
	public Game()
	{
		mapList = new ArrayList< Map >();
		blockList = new ArrayList< Block >();
	}
	
	
	
	// getter setter /////////////////////////////////////////////////
	public ArrayList<Map> getMapList() {
		return mapList;
	}

	public void setMapList(ArrayList<Map> mapList) {
		this.mapList = mapList;
	}
	
	public ArrayList<Block> getBlockList() {
		return blockList;
	}

	public void setBlockList(ArrayList<Block> blockList) {
		this.blockList = blockList;
	}
}
