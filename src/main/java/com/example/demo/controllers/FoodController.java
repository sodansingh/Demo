package com.example.demo.controllers;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.models.FoodModel;
import com.example.demo.models.FoodRequest;
import com.example.demo.models.MultipartToFile;
import com.example.demo.repositories.FoodRepo;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;


@RestController
@RequestMapping("/api/v1")
public class FoodController {
	
	@Autowired
	private FoodRepo foodRepository;
	
	
	@PostMapping("/csv/import")
	public Map<String, Integer> CsvDataImport(
			@RequestPart(value = "file") MultipartFile file) throws Exception {

	
		Map<String, Integer> hitCounts = new HashMap<>();

		// Map to fetch excel data
		List<FoodRequest> csvData = new ArrayList<>();
	//	csvData.stream().filter(predicate)
		// fetching excel data from function
		csvData = readDataFromCsvFile(MultipartToFile.convertMultiPartToFile(file));
		if (!csvData.isEmpty() && csvData.size()>1) {
			for (FoodRequest foodRequest : csvData) {
				FoodModel foodModel = new FoodModel();
				foodModel.setApplicant(foodRequest.getApplicant());
				
				foodModel.setCnn(Integer.parseInt(foodRequest.getCnn()));
				foodModel.setAddress(foodRequest.getAddress());
				foodModel.setApproved(foodRequest.getApproved());
				foodModel.setBlock(Integer.parseInt(foodRequest.getBlock()));
				foodModel.setBlocklot(Integer.parseInt(foodRequest.getBlocklot()));
				foodModel.setDayshours(foodRequest.getDayshours());
				foodModel.setExpiration(foodRequest.getExpiration());
				foodModel.setFacility(foodRequest.getFacility());
				foodModel.setFire_Prevention_Districts(foodRequest.getFire_Prevention_Districts());
				foodModel.setFoodItems(foodRequest.getFoodItems());
				foodModel.setLatitude(Double.parseDouble(foodRequest.getLatitude()));
				foodModel.setLocation(foodRequest.getLocation());
				foodModel.setLongitude(Double.parseDouble(foodRequest.getLongitude()));
				foodModel.setLot(Integer.parseInt(foodRequest.getLot()));
				foodModel.setLocationDescription(foodRequest.getLocationDescription());
				foodModel.setLocationid(Integer.parseInt(foodRequest.getLocationid()));
				foodModel.setNeighborhoods(foodRequest.getNeighborhoods());
				foodModel.setNOISent(foodRequest.getNOISent());
				foodModel.setPermit(foodRequest.getPermit());
				foodModel.setPolice_Districts(foodRequest.getPolice_Districts());
				foodModel.setPriorPermit(foodRequest.getPriorPermit());
				foodModel.setReceived(foodRequest.getReceived());
				foodModel.setSchedule(foodRequest.getSchedule());
				foodModel.setStatus(foodRequest.getStatus());
				foodModel.setSupervisor_Districts(foodModel.getSupervisor_Districts());
				foodModel.setX(foodModel.getX());
				foodModel.setY(foodModel.getY());
				foodModel.setZip_Codes(foodModel.getZip_Codes());
				foodRepository.save(foodModel);
				
				
			}
		
				
		
		return null;
	}
		return hitCounts;}


List<FoodRequest> readDataFromCsvFile(File csvFile) throws Exception {
	
	ColumnPositionMappingStrategy strat = new ColumnPositionMappingStrategy();
	strat.setType(FoodRequest.class);
	String[] columns = new String[] { "locationid", "Applicant", "FacilityType", "cnn", " LocationDescription","Address", "blocklot", "block",
			"lot", "permit", "Status", "Fooditems", "X", "Y", "Latitude", "Longitude",
			"Schedule", "dayshours", "NOISent", "Approved", "Received", "PriorPermit",
			"ExpirationDate", "Location", "Fire_Prevention_Districts", "Police_Districts", "Supervisor_Districts", "Zip_Codes",
			"Neighborhoods" }; // the fields to bind do in your JavaBean
	strat.setColumnMapping(columns);
	
	CsvToBean csv = new CsvToBean();
	// String csvFilename = excelFile;
	CSVReader csvReader = new CSVReader(new FileReader(csvFile));
	List<FoodRequest> list = csv.parse(strat, csvReader);
	System.out.println("list======="+list);
	list.remove(0);
	return list;
	
}

}