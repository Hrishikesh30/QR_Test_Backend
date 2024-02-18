package com.barcode.scannerutil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barcode.scannerutil.Entity.Scan;

public interface ScanRepository extends JpaRepository<Scan, Long> {
}
