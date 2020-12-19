package entity;

/**
 * CardテーブルのEntity
 */
public class Card {
	private Interger cardNo;
	private String cardName;
	private String cardCharacterName;
	private String side;
	private Interger neoStandardNo;
	private String cardText;
	private Interger cardColor;
	private String cardType;
	private Int cardLevel;
	private int cardPower;
	private int cardSoul;
	private int cardCost;
	private int cardTrigger;
	private Interger cardCxTrigger;
	private Interger cardOption;  //1.カウンター2.アラーム
	private String cardFeature1;//特徴
	private String cardFeature2;
	private String cardFeature3;

	public Card() {

	}

	public Interger getCardNo() {
		return cardNo;
	}

	public void setCardNo(Interger cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardCharacterName() {
		return cardCharacterName;
	}

	public void setCardCharacterName(String cardCharacterName) {
		this.cardCharacterName = cardCharacterName;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public Interger getNeoStandardNo() {
		return neoStandardNo;
	}

	public void setNeoStandardNo(Interger neoStandardNo) {
		this.neoStandardNo = neoStandardNo;
	}

	public String getCardText() {
		return cardText;
	}

	public void setCardText(String cardText) {
		this.cardText = cardText;
	}

	public Interger getCardColor() {
		return cardColor;
	}

	public void setCardColor(Interger cardColor) {
		this.cardColor = cardColor;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Int getCardLevel() {
		return cardLevel;
	}

	public void setCardLevel(Int cardLevel) {
		this.cardLevel = cardLevel;
	}

	public int getCardPower() {
		return cardPower;
	}

	public void setCardPower(int cardPower) {
		this.cardPower = cardPower;
	}

	public int getCardSoul() {
		return cardSoul;
	}

	public void setCardSoul(int cardSoul) {
		this.cardSoul = cardSoul;
	}

	public int getCardCost() {
		return cardCost;
	}

	public void setCardCost(int cardCost) {
		this.cardCost = cardCost;
	}

	public int getCardTrigger() {
		return cardTrigger;
	}

	public void setCardTrigger(int cardTrigger) {
		this.cardTrigger = cardTrigger;
	}

	public Interger getCardCxTrigger() {
		return cardCxTrigger;
	}

	public void setCardCxTrigger(Interger cardCxTrigger) {
		this.cardCxTrigger = cardCxTrigger;
	}

	public Interger getCardOption() {
		return cardOption;
	}

	public void setCardOption(Interger cardOption) {
		this.cardOption = cardOption;
	}

	public String getCardFeature1() {
		return cardFeature1;
	}

	public void setCardFeature1(String cardFeature1) {
		this.cardFeature1 = cardFeature1;
	}

	public String getCardFeature2() {
		return cardFeature2;
	}

	public void setCardFeature2(String cardFeature2) {
		this.cardFeature2 = cardFeature2;
	}

	public String getCardFeature3() {
		return cardFeature3;
	}

	public void setCardFeature3(String cardFeature3) {
		this.cardFeature3 = cardFeature3;
	}

}
