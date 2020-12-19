package entity;

/**
 * StandardテーブルのEntity
 */
public class Standard {

	private Int NeoStandard_No;
	private String NeoStandard_Name;//ex 探偵オペラミルキィホームズ
	private String NeoStandard_ShortName;//MK

	public Standard() {

	}

	public Int getNeoStandard_No() {
		return NeoStandard_No;
	}

	public void setNeoStandard_No(Int neoStandard_No) {
		NeoStandard_No = neoStandard_No;
	}

	public String getNeoStandard_Name() {
		return NeoStandard_Name;
	}

	public void setNeoStandard_Name(String neoStandard_Name) {
		NeoStandard_Name = neoStandard_Name;
	}

	public String getNeoStandard_ShortName() {
		return NeoStandard_ShortName;
	}

	public void setNeoStandard_ShortName(String neoStandard_ShortName) {
		NeoStandard_ShortName = neoStandard_ShortName;
	}

}
