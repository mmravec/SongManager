package songManager;

public interface CrudInterface {
	
	public void writeToString();
	
	public void addSong(Song song);
	
	public Song getRandomSong();
	
	public void clera();

}
