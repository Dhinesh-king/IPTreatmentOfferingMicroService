//package com.finalProject.Controller;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.finalProject.Entity.SpecialistDetail;
//import com.finalProject.Repository.IPTreatmentPackagesRepository;
//import com.finalProject.Repository.SpecialistDetailRepository;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class IpTPacControllerTest {
//
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@MockBean
//	private SpecialistDetailRepository specialistDetailRepo;
//	
//	@MockBean
//	private IPTreatmentPackagesRepository treatmentPackageRepo;
//
//	@Test
//	public void testgetInpatientServicePackages() throws Exception {
//		mockMvc.perform(get("/offerings/IPTreatmentPackages")).andExpect(status().isOk());
//
//	}
//
//	@Test
//	public void testgetInpatientServicePackagesByPackageName() throws Exception {
//		mockMvc.perform(get("/offerings/IPTreatmentPackageByName/Package1")).andExpect(status().isOk());
//
//	}
//
//	@Test
//	public void testgetSpecialists() throws Exception {
//		List<SpecialistDetail> allSpecialistDetail = Arrays.asList(
//				new SpecialistDetail(1, "foo", "Orthopaedics", 8, "1234567890"),
//				new SpecialistDetail(2, "huff", "Urology", 4, "9876543210"));
//		when(specialistDetailRepo.findAll()).thenReturn(allSpecialistDetail);
//		mockMvc.perform(get("/offerings/Specialists")).andExpect(status().isOk()).andExpect(jsonPath("$", hasSize(2)))
//				.andExpect(jsonPath("$[0].specialistDetailId", is(1))).andExpect(jsonPath("$[0].name", is("foo")))
//				.andExpect(jsonPath("$[0].areaOfExpertise", is("Orthopaedics")))
//				.andExpect(jsonPath("$[0].experienceInYears", is(8)))
//				.andExpect(jsonPath("$[0].contactNumber", is("1234567890")))
//				.andExpect(jsonPath("$[1].specialistDetailId", is(2))).andExpect(jsonPath("$[1].name", is("huff")))
//				.andExpect(jsonPath("$[1].areaOfExpertise", is("Urology")))
//				.andExpect(jsonPath("$[1].experienceInYears", is(4)))
//				.andExpect(jsonPath("$[1].contactNumber", is("9876543210")));
//
//		verify(specialistDetailRepo, times(1)).findAll();
//
//	}
//}