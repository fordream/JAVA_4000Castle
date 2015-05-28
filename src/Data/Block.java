package Data;

public class Block 
{
	private String imagePath;
	private int tag;
	
	
	// constructors /////////////////////////////////////////////////////
	public Block( String imagePath, int tag )
	{
		setImagePath( imagePath );
		setTag( tag );
	}
	
	
	
	// getter setter ////////////////////////////////////////////////////
	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	
	public int getTag() {
		return tag;
	}


	public void setTag(int tag) {
		this.tag = tag;
	}
	
}
