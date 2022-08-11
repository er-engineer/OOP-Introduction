package main;

public class Corporate extends Account{
	private int foundingYear;
	private String companyName;
	private String companyIndustry;
	
	
	// Overloading the constructor methods.
	// Names of the methods are same but their signatures are not.
	public Corporate() {
	}
	
	public Corporate(int id, Owner owner, int foundingYear, String companyName, String companyIndustry) {
		super(id, owner);
		this.foundingYear = foundingYear;
		this.companyName = companyName;
		this.companyIndustry = companyIndustry;
	}

	public int getFoundingYear() {
		return foundingYear;
	}

	public void setFoundingYear(int foundingYear) {
		this.foundingYear = foundingYear;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyIndustry() {
		return companyIndustry;
	}

	public void setCompanyIndustry(String companyIndustry) {
		this.companyIndustry = companyIndustry;
	}

}
