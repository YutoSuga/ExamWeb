package entity;

/**
 * DeckDtlテーブルのEntity
 */
public class DeckDtl {
	private int deckNo;
	private int cardNo;
	private int cardStock;

	public DeckDtl() {

	}

	public int getDeckNo() {
		return deckNo;
	}

	public void setDeckNo(int deckNo) {
		this.deckNo = deckNo;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public int getCardStock() {
		return cardStock;
	}

	public void setCardStock(int cardStock) {
		this.cardStock = cardStock;
	}

}
