package songManager;

public class Mp3 extends Song {

	private String fileName;
	private int fileSize;
	
	public Mp3 (String name, Genre[] genre, int length, String author, int rating, String fileName,int fileSize){
		super(name, genre, length, author, rating);
		this.fileName = fileName;
		this.fileSize = fileSize;
	}
	
	public String whereIsLocated() {
	    return this.fileName;
	  }
	

	
	//public String whereIsLocated(){
		//return this.filePath;
	//}
	
}
