package songManager;

import java.util.Arrays;
import java.util.Comparator;


public class Playlist implements CrudInterface {

	private Song[] songs;

	public Playlist(Song[] songs) {
		super();
	    this.songs = songs;
	}

	public Song[] getByName(String name) {
		Song[] results = new Song[0];
		for (int i = 0; i < songs.length; i++) {
			if (songs[i].getName().contains(name)) {
				results = this.add(results, songs[i]);

			}

		}
		return null;
	}
	// privatna metoda, ktora zvacsuje pole a na koniec

	/**
	 * 
	 * @param songs
	 * @param newSong
	 * @return prida newSong
	 */
	private Song[] add(Song[] songs, Song newSong) {
		Song[] biggerArrayOfSongs = new Song[songs.length + 1];
		for (int i = 0; i < songs.length; i++) {
			biggerArrayOfSongs[i] = songs[i];
		}
		// System.arraycopy(songs, 0, biggerArrayOfSongs, 0, songs.length);
		// biggerArrayOfSongs[songs.length] = newSong;
		return biggerArrayOfSongs;
	}

	public boolean hasSong(Song s) {
		for (int i = 0; i < songs.length; i++) {
			if (songs[i].equals(s)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void writeToString() {
		for (Song song : songs) {
			System.out.println(song);
		}
	}

	@Override
	public void addSong(Song song) {
		// TODO Auto-generated method stub

	}

	@Override
	public Song getRandomSong() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clera() {
		songs = new Song[0];

	}

	public void sortByName() {
		Arrays.sort(songs, new Comparator<Song>() {

			@Override
			public int compare(Song o1, Song o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}
	
	public void sortByReating(){
		Arrays.sort(songs);
	}

}
