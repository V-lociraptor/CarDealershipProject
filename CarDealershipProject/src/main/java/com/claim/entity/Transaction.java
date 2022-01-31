package com.claim.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="dealership_transaction")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "transaction_number")
public class Transaction {
	
	@Id
	@Column(name="transaction_number")
	private Integer transactionNumber;
	
	@Column(name="sale_date")
	private LocalDate saleDate;
	
	@Column(name="sale_price")
	private double salePrice;
	
	@Column(name="sale_type")
	private String saleType;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_email")
	private User user;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="stock_sold")
	private Vehicle vehicle;
	
	public Transaction() {
		
	}
	
	public Transaction(int transactionNumber, LocalDate saleDate, double salePrice, String saleType, User user, Vehicle vehicle) {
		this.transactionNumber = transactionNumber;
		this.saleDate = saleDate;
		this.user = user;
		this.vehicle = vehicle;
		this.salePrice = salePrice;
		this.saleType = saleType;
	}

	public Integer getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(Integer transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public LocalDate getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public String getSaleType() {
		return saleType;
	}

	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}	

}
