package com.finalProject.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalProject.Entity.InpatientServicePackages;
import com.finalProject.Entity.SpecialistDetail;
import com.finalProject.Service.IPTreatmentPackagesService;
import com.finalProject.Service.SpecialistDetailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/offerings")
@Api(value = "IpTPacController Controller",description = "REST API's Related To InPatientServicePackages and SpecialistDetail Entities")
public class IpTPacController 
{
	@Autowired
	private IPTreatmentPackagesService iptps;
	
	@Autowired
	private SpecialistDetailService sds;
	
	private static boolean isSaved=false;
	public IpTPacController() {
		
	}
	
	
	Logger logger= LoggerFactory.getLogger(IpTPacController.class);
	
	@GetMapping("/IPTreatmentPackages")
	@ApiOperation(value = "this endpoint is used for getting all international patient service packages")
	public ResponseEntity<List<InpatientServicePackages>> getInpatientServicePackages()
	{
		if(isSaved) {
			sds.saveData();
			this.isSaved=false;
		}
		logger.trace("International pateient packages are showing");
		System.out.println(iptps.getInpatientServicePackages());
		return new ResponseEntity<List<InpatientServicePackages>>(iptps.getInpatientServicePackages(),HttpStatus.OK);
	}
	
	@GetMapping("/IPTreatmentPackageByName/{packageName}")
	@ApiOperation(value = "this endpoint is used for getting all international patient service packages by package name")
	public ResponseEntity<List<InpatientServicePackages>> getInpatientServicePackagesByPackageName(@PathVariable String packageName)
	{
		if(isSaved) {
			sds.saveData();
			this.isSaved=false;
		}
		logger.trace("International pateient packages are showing basedon package name");
		return new ResponseEntity<List<InpatientServicePackages>>(iptps.getInpatientServicePackagesByPackageName(packageName),HttpStatus.OK);
	}
	@GetMapping("/Specialists")
	@ApiOperation(value = "this endpoint is used for getting all the specialists details")
	public ResponseEntity<List<SpecialistDetail>> getSpecialists()
	{
		if(isSaved) {
			sds.saveData();
			this.isSaved=false;
		}
		logger.trace("list of specialists are showing");
		System.out.println(sds.getSpecialists());
		return new ResponseEntity<List<SpecialistDetail>>(sds.getSpecialists(),HttpStatus.OK);
	}
}
