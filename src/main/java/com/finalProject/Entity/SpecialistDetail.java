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
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "This is SpecialistDetail Entiy ,To perform various operations on SpecialistDetail")
public class SpecialistDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int specialistDetailId;
	@Column
	private String name;
	@Column
	private String areaOfExpertise;
	@Column
	private int experienceInYears;
	@Column
	private String contactNumber;
	public int getSpecialistDetailId() {
		return specialistDetailId;
	}
	public void setSpecialistDetailId(int specialistDetailId) {
		this.specialistDetailId = specialistDetailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAreaOfExpertise() {
		return areaOfExpertise;
	}
	public void setAreaOfExpertise(String areaOfExpertise) {
		this.areaOfExpertise = areaOfExpertise;
	}
	public int getExperienceInYears() {
		return experienceInYears;
	}
	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
//	public SpecialistDetail(int specialistDetailId, String name, String areaOfExpertise, int experienceInYears,
//			String contactNumber) {
//		super();
//		this.specialistDetailId = specialistDetailId;
//		this.name = name;
//		this.areaOfExpertise = areaOfExpertise;
//		this.experienceInYears = experienceInYears;
//		this.contactNumber = contactNumber;
//	}
//	public SpecialistDetail() {
//		super();
//	}
	
}
