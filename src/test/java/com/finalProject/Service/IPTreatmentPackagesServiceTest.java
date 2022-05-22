//package com.finalProject.Service;
//
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.finalProject.Entity.InpatientServicePackages;
//
//@SpringBootTest
//public class IPTreatmentPackagesServiceTest 
//{
//
//	@Autowired
//	private IPTreatmentPackagesService iptps;
//	
//	 	@Test
//	    public void testgetInpatientServicePackages()
//	    {
//	    	List<InpatientServicePackages> allInPatientServicePackages=Arrays.asList(new InpatientServicePackages("Orthopaedics","Package1","OPT1,OPT2",2500,4),new InpatientServicePackages("Orthopaedics","Package2","OPT3,OPT4",3000,6),new InpatientServicePackages("Urology","Package1","UPT1,UPT2",4000,4),new InpatientServicePackages("Urology","Package2","UPT3,UPT4",5000,6));
//	    	List<InpatientServicePackages> savedInPatientServicePackages=iptps.getInpatientServicePackages();
//	    	System.out.println(allInPatientServicePackages.size());
//	    	System.out.println(savedInPatientServicePackages.size());
//	    	Assertions.assertEquals(4,savedInPatientServicePackages.size());
//	    }
//	
//	 	
//	 	@Test
//	    public void testgetInpatientServicePackagesByPackageName()
//	    {
//	    	List<InpatientServicePackages> allInPatientServicePackages=Arrays.asList(new InpatientServicePackages("Orthopaedics","Package1","OPT1,OPT2",2500,4),new InpatientServicePackages("Urology","Package1","UPT1,UPT2",4000,4));
//	    	 List<InpatientServicePackages> Lipsp=iptps.getInpatientServicePackagesByPackageName("Package1");
//	    	 System.out.println(allInPatientServicePackages.size());
//	    	 System.out.println(Lipsp.size());
//	    	 Assertions.assertEquals(2,Lipsp.size());
//	    }
//}