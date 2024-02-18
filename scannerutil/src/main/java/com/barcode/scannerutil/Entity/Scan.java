package com.barcode.scannerutil.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Scan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String barcodeResult;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBarcodeResult() {
		return barcodeResult;
	}

	public void setBarcodeResult(String barcodeResult) {
		this.barcodeResult = barcodeResult;
	}

    // Getters and setters
}
