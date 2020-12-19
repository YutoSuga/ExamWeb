package entity;

/**
 * DeckテーブルのEntity
 */
public class Deck {
	private int deckNo;
	private String deckName;
	private int userType; // 0.ゲスト1.一般 2.host
	private int userId;
	private String deckPass;

	public Deck() {

	}

	public int getDeckNo() {
		return deckNo;
	}

	public void setDeckNo(int deckNo) {
		this.deckNo = deckNo;
	}

	public String getDeckName() {
		return deckName;
	}

	public void setDeckName(String deckName) {
		this.deckName = deckName;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDeckPass() {
		return deckPass;
	}

	public void setDeckPass(String deckPass) {
		this.deckPass = deckPass;
	}

}
