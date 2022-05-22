package com.finalProject.Service;

import java.util.List;

import com.finalProject.Entity.InpatientServicePackages;

public interface IPTreatmentPackagesService 
{
	public List<InpatientServicePackages> getInpatientServicePackages();
	public List<InpatientServicePackages> getInpatientServicePackagesByPackageName(String packageName);
}
