package com.finalProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "This is PackageDetail Entiy ,To perform various operations on PackageDetail")
public class PackageDetail 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PackageDetail_PK")
	private int packageDetailId;
	@Column
	private String TreatmentPackageName;
	@Column
	private String TestDetails;
	@Column
	private int cost;
	@Column
	private int treatmentDuration;
	public int getPackageDetailId() {
		return packageDetailId;
	}
	public void setPackageDetailId(int packageDetailId) {
		this.packageDetailId = packageDetailId;
	}
	public String getTreatmentPackageName() {
		return TreatmentPackageName;
	}
	public void setTreatmentPackageName(String treatmentPackageName) {
		TreatmentPackageName = treatmentPackageName;
	}
	public String getTestDetails() {
		return TestDetails;
	}
	public void setTestDetails(String testDetails) {
		TestDetails = testDetails;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getTreatmentDuration() {
		return treatmentDuration;
	}
	public void setTreatmentDuration(int treatmentDuration) {
		this.treatmentDuration = treatmentDuration;
	}
//	public PackageDetail(int packageDetailId, String treatmentPackageName, String testDetails, int cost,
//			int treatmentDuration) {
//		super();
//		this.packageDetailId = packageDetailId;
//		TreatmentPackageName = treatmentPackageName;
//		TestDetails = testDetails;
//		this.cost = cost;
//		this.treatmentDuration = treatmentDuration;
//	}
//	public PackageDetail() {
//		super();
//	}
	
}
