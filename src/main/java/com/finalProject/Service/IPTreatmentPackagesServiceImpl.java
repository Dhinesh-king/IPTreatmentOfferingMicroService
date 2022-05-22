package com.finalProject.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.Entity.IPTreatmentPackages;
import com.finalProject.Entity.InpatientServicePackages;
import com.finalProject.Repository.IPTreatmentPackagesRepository;

@Service
public class IPTreatmentPackagesServiceImpl implements IPTreatmentPackagesService
{
	@Autowired
	private IPTreatmentPackagesRepository iptpr;

	@Override
	public List<InpatientServicePackages> getInpatientServicePackages() {
		List<IPTreatmentPackages> l= iptpr.findAll();
		List<InpatientServicePackages> rl = new ArrayList<InpatientServicePackages>();
		InpatientServicePackages ISP = null;
		for(IPTreatmentPackages ip:l)
		{
			ISP=new InpatientServicePackages();
			ISP.setAilmentCategory(ip.getAilmentCategory());
			ISP.setCost(ip.getPackageDetail().getCost());
			ISP.setTestdeatils(ip.getPackageDetail().getTestDetails());
			ISP.setTreatmentduration(ip.getPackageDetail().getTreatmentDuration());
			ISP.setTreatmentPackageName(ip.getPackageDetail().getTreatmentPackageName());
			rl.add(ISP);
		}
		return rl;
	}

	@Override
	public List<InpatientServicePackages> getInpatientServicePackagesByPackageName(String packageName) {
		List<IPTreatmentPackages> l= iptpr.findAll();
		List<InpatientServicePackages> rl = new ArrayList<InpatientServicePackages>();
		InpatientServicePackages ISP = null;
		for(IPTreatmentPackages ip:l)
		{
			
			if(ip.getPackageDetail().getTreatmentPackageName().equals(packageName))
			{
			ISP=new InpatientServicePackages();
			ISP.setAilmentCategory(ip.getAilmentCategory());
			ISP.setCost(ip.getPackageDetail().getCost());
			ISP.setTestdeatils(ip.getPackageDetail().getTestDetails());
			ISP.setTreatmentduration(ip.getPackageDetail().getTreatmentDuration());
			ISP.setTreatmentPackageName(ip.getPackageDetail().getTreatmentPackageName());
			rl.add(ISP);
			}
		}
		return rl;
	}
	
	
}
