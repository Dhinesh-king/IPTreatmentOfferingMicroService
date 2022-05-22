package com.finalProject.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(description = "This is IPTreatmentPackages Entity ,To perform various operations on IPTreatmentPackages")
public class IPTreatmentPackages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IpTreatmentPackagesId;
	private String AilmentCategory;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pDetail_FK")
	private PackageDetail packageDetail;

	public IPTreatmentPackages() {
	}

	public int getIpTreatmentPackagesId() {
		return IpTreatmentPackagesId;
	}

	public void setIpTreatmentPackagesId(int ipTreatmentPackagesId) {
		IpTreatmentPackagesId = ipTreatmentPackagesId;
	}

	public String getAilmentCategory() {
		return AilmentCategory;
	}

	public void setAilmentCategory(String ailmentCategory) {
		AilmentCategory = ailmentCategory;
	}

	public PackageDetail getPackageDetail() {
		return packageDetail;
	}

	public void setPackageDetail(PackageDetail packageDetail) {
		this.packageDetail = packageDetail;
	}

	public IPTreatmentPackages(int ipTreatmentPackagesId, String ailmentCategory, PackageDetail packageDetail) {
		super();
		IpTreatmentPackagesId = ipTreatmentPackagesId;
		AilmentCategory = ailmentCategory;
		this.packageDetail = packageDetail;
	}

}
