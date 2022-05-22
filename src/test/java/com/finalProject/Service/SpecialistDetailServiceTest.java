//package com.finalProject.Service;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.finalProject.Entity.SpecialistDetail;
//
//@SpringBootTest
//public class SpecialistDetailServiceTest 
//{
//	@Autowired
//	private SpecialistDetailService sds;
//	
//	@Test
//    public void testgetSpecialists()
//    {
//    	List<SpecialistDetail> allSpecialistDetail=Arrays.asList(new SpecialistDetail(1,"foo","Orthopaedics",8,"1234567890"),new SpecialistDetail(2,"huff","Orthopaedics",4,"0987654321"),new SpecialistDetail(3,"abc","Urology",10,"8762684158"),new SpecialistDetail(4,"def","Urology",5,"7621146542"));
//    	List<SpecialistDetail> savedSpecialistDetail=sds.getSpecialists();
//    	System.out.println(allSpecialistDetail.size());
//    	System.out.println(savedSpecialistDetail.size());
//    	Assertions.assertEquals(4,savedSpecialistDetail.size());
//    }
