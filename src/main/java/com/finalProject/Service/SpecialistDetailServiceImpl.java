package com.finalProject.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.Entity.IPTreatmentPackages;
import com.finalProject.Entity.PackageDetail;
import com.finalProject.Entity.SpecialistDetail;
import com.finalProject.Repository.IPTreatmentPackagesRepository;
import com.finalProject.Repository.PackageDetailRepo;
import com.finalProject.Repository.SpecialistDetailRepository;

@Service
public class SpecialistDetailServiceImpl implements SpecialistDetailService
{
	@Autowired
	private SpecialistDetailRepository sdr;
	
	@Autowired
	private IPTreatmentPackagesRepository iptpr;
	
	@Autowired
	private PackageDetailRepo pdr;
	@Override
	public List<SpecialistDetail> getSpecialists() {
		return sdr.findAll();
	}
	
	public void saveData() {
		SpecialistDetail specialist1=new SpecialistDetail(1,"Steve Rogers", "Orthopaedics", 8, "900000000");
		SpecialistDetail specialist2=new SpecialistDetail(2,"Tony Parker", "Orthopaedics", 4, "800000000");
		SpecialistDetail specialist3=new SpecialistDetail(3,"Natasha Williams", "Orthopaedics", 10, "700000000");
		SpecialistDetail specialist4=new SpecialistDetail(4,"Peter Stark", "Orthopaedics", 5, "600000000");
		sdr.save(specialist1);
		sdr.save(specialist2);
		sdr.save(specialist3);
		sdr.save(specialist4);
		
		PackageDetail packageDetail1=new PackageDetail(1, "Pacakage1","OPT1,OPT2", 2500, 4);
		PackageDetail packageDetail2=new PackageDetail(2, "Pacakage2","OPT3,OPT4", 3000, 6);
		PackageDetail packageDetail3=new PackageDetail(3, "Pacakage1","UPT1,UPT2", 4000, 4);
		PackageDetail packageDetail4=new PackageDetail(4, "Pacakage2","UPT3,UPT4", 5000, 6);
		List<PackageDetail> list= new ArrayList<>();
		list.add(packageDetail1);
		list.add(packageDetail2);
		list.add(packageDetail3);
		list.add(packageDetail4);
		
		pdr.saveAll(list);
		
		IPTreatmentPackages ipPackage1=new IPTreatmentPackages(1,"Orthopaedics",packageDetail1);
		IPTreatmentPackages ipPackage2=new IPTreatmentPackages(1,"Orthopaedics",packageDetail2);
		IPTreatmentPackages ipPackage3=new IPTreatmentPackages(1,"Urology",packageDetail3);
		IPTreatmentPackages ipPackage4=new IPTreatmentPackages(1,"Urology",packageDetail4);
		iptpr.save(ipPackage1);
		iptpr.save(ipPackage2);
		iptpr.save(ipPackage3);
		iptpr.save(ipPackage4);
  }
	
	
}

