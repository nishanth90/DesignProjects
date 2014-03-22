/**
 * 
 */
package com.lib.DomainObjects;

/**
 * @author aniket
 *
 */
public class VCD extends DomainObjects{

	private String albumName;
	
	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	private String artist;
	
    private boolean isAvailable;
	
	private int numOfCopies;

	@Override
	protected void generateKey() {
		this.key = this.getAlbumName()+"$"+this.getArtist();
	}	
	
}
