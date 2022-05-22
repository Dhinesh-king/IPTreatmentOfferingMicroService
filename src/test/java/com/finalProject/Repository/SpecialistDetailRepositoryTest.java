//package com.finalProject.Repository;
//
//import java.util.List;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import com.finalProject.Entity.SpecialistDetail;
//
//
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace=Replace.NONE)
//@TestMethodOrder(OrderAnnotation.class)
//public class SpecialistDetailRepositoryTest 
//{
//		@Autowired
//		private SpecialistDetailRepository sdr;
//		
//		@Test
//		@Order(2)
//		public void testGetAllSpecialistDetail()
//		{
//	       List<SpecialistDetail> allSpecialistDetail=sdr.findAll(); 
//		   Assertions.assertEquals(4,allSpecialistDetail.size());
//		}
//}