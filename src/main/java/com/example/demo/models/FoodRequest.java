package com.example.demo.models;

import java.io.Serializable;

import com.opencsv.bean.CsvBindByName;


public class FoodRequest implements Serializable {
	
	
		private static final long serialVersionUID = 1L;
		
		private String locationid;
		private String Applicant;
		private String Facility;
		private String cnn;
		private String LocationDescription;
		private String Address;
		private String blocklot;
		private String block;
		private String lot;
		private String permit;
		private String Status;
		private String FoodItems;
		private String X;
		private String Y;
		private String Latitude;
		private String Longitude;
		private String Schedule;
		private String dayshours;
		private String NOISent;
		private String Approved;
		private String Received;
		private String PriorPermit;
		private String Expiration;
		private String Location;
		@CsvBindByName(column = "Fire Prevention Districts")
		private String Fire_Prevention_Districts;
		@CsvBindByName(column = "Police Districts")
		private String Police_Districts;
		@CsvBindByName(column = "Supervisor Districts")
		private String Supervisor_Districts;
		@CsvBindByName(column = "Zip Codes")
		private String Zip_Codes;
		@CsvBindByName(column = "Neighborhoods (old)")
		private String Neighborhoods;
		
		
		public String getLocationid() {
			return locationid;
		}
		public void setLocationid(String locationid) {
			this.locationid = locationid;
		}
		public String getApplicant() {
			return Applicant;
		}
		public void setApplicant(String applicant) {
			Applicant = applicant;
		}
		
		public String getFacility() {
			return Facility;
		}
		public void setFacility(String facility) {
			Facility = facility;
		}
		public String getCnn() {
			return cnn;
		}
		public void setCnn(String cnn) {
			this.cnn = cnn;
		}
		public String getLocationDescription() {
			return LocationDescription;
		}
		public void setLocationDescription(String locationDescription) {
			LocationDescription = locationDescription;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getBlocklot() {
			return blocklot;
		}
		public void setBlocklot(String blocklot) {
			this.blocklot = blocklot;
		}
		public String getBlock() {
			return block;
		}
		public void setBlock(String block) {
			this.block = block;
		}
		public String getLot() {
			return lot;
		}
		public void setLot(String lot) {
			this.lot = lot;
		}
		public String getPermit() {
			return permit;
		}
		public void setPermit(String permit) {
			this.permit = permit;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		public String getFoodItems() {
			return FoodItems;
		}
		public void setFoodItems(String foodItems) {
			FoodItems = foodItems;
		}
		public String getX() {
			return X;
		}
		public void setX(String x) {
			X = x;
		}
		public String getY() {
			return Y;
		}
		public void setY(String y) {
			Y = y;
		}
		public String getLatitude() {
			return Latitude;
		}
		public void setLatitude(String latitude) {
			Latitude = latitude;
		}
		public String getLongitude() {
			return Longitude;
		}
		public void setLongitude(String longitude) {
			Longitude = longitude;
		}
		public String getSchedule() {
			return Schedule;
		}
		public void setSchedule(String schedule) {
			Schedule = schedule;
		}
		public String getDayshours() {
			return dayshours;
		}
		public void setDayshours(String dayshours) {
			this.dayshours = dayshours;
		}
		public String getNOISent() {
			return NOISent;
		}
		public void setNOISent(String nOISent) {
			NOISent = nOISent;
		}
		public String getApproved() {
			return Approved;
		}
		public void setApproved(String approved) {
			Approved = approved;
		}
		public String getReceived() {
			return Received;
		}
		public void setReceived(String received) {
			Received = received;
		}
		public String getPriorPermit() {
			return PriorPermit;
		}
		public void setPriorPermit(String priorPermit) {
			PriorPermit = priorPermit;
		}
	
		public String getLocation() {
			return Location;
		}
		public void setLocation(String location) {
			Location = location;
		}
		public String getFire_Prevention_Districts() {
			return Fire_Prevention_Districts;
		}
		public void setFire_Prevention_Districts(String fire_Prevention_Districts) {
			Fire_Prevention_Districts = fire_Prevention_Districts;
		}
		public String getPolice_Districts() {
			return Police_Districts;
		}
		public void setPolice_Districts(String police_Districts) {
			Police_Districts = police_Districts;
		}
		public String getSupervisor_Districts() {
			return Supervisor_Districts;
		}
		public void setSupervisor_Districts(String supervisor_Districts) {
			Supervisor_Districts = supervisor_Districts;
		}
		public String getZip_Codes() {
			return Zip_Codes;
		}
		public void setZip_Codes(String zip_Codes) {
			Zip_Codes = zip_Codes;
		}
		public String getNeighborhoods() {
			return Neighborhoods;
		}
		public void setNeighborhoods(String neighborhoods) {
			Neighborhoods = neighborhoods;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public String getExpiration() {
			return Expiration;
		}
		public void setExpiration(String expiration) {
			Expiration = expiration;
		}
		@Override
		public String toString() {
			return "FoodRequest [locationid=" + locationid + ", Applicant=" + Applicant + ", Facility="
					+ Facility + ", cnn=" + cnn + ", LocationDescription=" + LocationDescription + ", Address="
					+ Address + ", blocklot=" + blocklot + ", block=" + block + ", lot=" + lot + ", permit=" + permit
					+ ", Status=" + Status + ", FoodItems=" + FoodItems + ", X=" + X + ", Y=" + Y + ", Latitude="
					+ Latitude + ", Longitude=" + Longitude + ", Schedule=" + Schedule + ", dayshours=" + dayshours
					+ ", NOISent=" + NOISent + ", Approved=" + Approved + ", Received=" + Received + ", PriorPermit="
					+ PriorPermit + ", Expiration=" + Expiration + ", Location=" + Location
					+ ", Fire_Prevention_Districts=" + Fire_Prevention_Districts + ", Police_Districts="
					+ Police_Districts + ", Supervisor_Districts=" + Supervisor_Districts + ", Zip_Codes=" + Zip_Codes
					+ ", Neighborhoods=" + Neighborhoods + "]";
		}		
}
