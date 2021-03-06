package com.cts.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cardetails")
public class CarDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;
	private Long userId;
    private Long seaterType;
    private String carNumber;
    private Long yearOfPurchase;
    private Long distanceTravelled;
    private Long amount;
    private String carType;
    private String brand;
	public Long getCarId() {
		return carId;
	}
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getSeaterType() {
		return seaterType;
	}
	public void setSeaterType(Long seaterType) {
		this.seaterType = seaterType;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public Long getYearOfPurchase() {
		return yearOfPurchase;
	}
	public void setYearOfPurchase(Long yearOfPurchase) {
		this.yearOfPurchase = yearOfPurchase;
	}
	public Long getDistanceTravelled() {
		return distanceTravelled;
	}
	public void setDistanceTravelled(Long distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "CarDetails [carId=" + carId + ", userId=" + userId + ", seaterType=" + seaterType + ", carNumber="
				+ carNumber + ", yearOfPurchase=" + yearOfPurchase + ", distanceTravelled=" + distanceTravelled
				+ ", amount=" + amount + ", carType=" + carType + ", brand=" + brand + "]";
	}
	public CarDetails(Long carId, Long userId, Long seaterType, String carNumber, Long yearOfPurchase,
			Long distanceTravelled, Long amount, String carType, String brand) {
		super();
		this.carId = carId;
		this.userId = userId;
		this.seaterType = seaterType;
		this.carNumber = carNumber;
		this.yearOfPurchase = yearOfPurchase;
		this.distanceTravelled = distanceTravelled;
		this.amount = amount;
		this.carType = carType;
		this.brand = brand;
	}
	public CarDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}