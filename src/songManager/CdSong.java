package songManager;

public class CdSong extends Song{
	  private int idCd;
	  private int indexOnCd;
	  
	  public CdSong(String name, Genre[] genre, int length, String author, int rating,
	      int idCd, int indexOnCd) {
	    super(name, genre, length, author, rating);
	    this.idCd = idCd;
	    this.indexOnCd = indexOnCd;
	    
	  }
	  @Override
	  public String whereIsLocated() {
	    return "som na cd " + idCd + ", piesen cislo " + this.indexOnCd;
	  }
	  
	  
	}