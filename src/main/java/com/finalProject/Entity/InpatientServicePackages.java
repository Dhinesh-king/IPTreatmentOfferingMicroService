package com.finalProject.Entity;

public class InpatientServicePackages {
	
	private String AilmentCategory;
	private String TreatmentPackageName;
	private String Testdeatils;
	private int cost;
	private int Treatmentduration;

	public InpatientServicePackages() {
	}

	public InpatientServicePackages(String ailmentCategory, String treatmentPackageName, String testdeatils, int cost,
			int treatmentduration) {
		super();
		AilmentCategory = ailmentCategory;
		TreatmentPackageName = treatmentPackageName;
		Testdeatils = testdeatils;
		this.cost = cost;
		Treatmentduration = treatmentduration;
	}

	public String getAilmentCategory() {
		return AilmentCategory;
	}

	public void setAilmentCategory(String ailmentCategory) {
		AilmentCategory = ailmentCategory;
	}

	public String getTreatmentPackageName() {
		return TreatmentPackageName;
	}

	public void setTreatmentPackageName(String treatmentPackageName) {
		TreatmentPackageName = treatmentPackageName;
	}

	public String getTestdeatils() {
		return Testdeatils;
	}

	public void setTestdeatils(String testdeatils) {
		Testdeatils = testdeatils;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getTreatmentduration() {
		return Treatmentduration;
	}

	public void setTreatmentduration(int treatmentduration) {
		Treatmentduration = treatmentduration;
	}

}
