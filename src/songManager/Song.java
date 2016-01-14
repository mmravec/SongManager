package songManager;

public abstract class Song {

	private String name;
	private Genre[] genre;
	// dlzka v sekundach
	public int length;
	private String author;
	// v percentach
	protected int rating;

	// prazdny konstruktor
	public Song() {

	}

	public Song(String name, Genre[] genre, int length, String author, int rating) {
		super();
		this.name = name;
		this.genre = genre;
		this.length = length;
		this.author = author;
		this.rating = rating;
	}

	public void setName(String songName) {
		this.name = songName;
	}

	public String getName() {
		return this.name;
	}

	public Genre[] getGenre() {
		return genre;
	}

	public void setGenre(Genre[] genre) {
		this.genre = genre;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	/*public String whereIsLocated() {
		return "neviem";
	}*/

	public void play() {
		// tu prehra piesen
	}

	public abstract String whereIsLocated();

	// prekryta metoda z Objectu
	@Override
	public String toString() {
		return "(" + name + ": " + rating + ")";
	}

	// tu by sa este dali dat nejake porovnania referencii
	@Override
	public boolean equals(Object object) {
		if (object instanceof Song) {
			Song ja = this;
			Song naPorovnanie = (Song) object;
			return ja.getName().equals(naPorovnanie.getName());
		} else {
			return false;
		}
	}
}
