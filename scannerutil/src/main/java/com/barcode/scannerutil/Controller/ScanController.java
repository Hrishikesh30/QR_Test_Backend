package com.barcode.scannerutil.Controller;

import com.barcode.scannerutil.Entity.Scan;
import com.barcode.scannerutil.repository.ScanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScanController {

    @Autowired
    private ScanRepository scanRepository;

    @PostMapping("/scans")
    public ResponseEntity<?> addScanResult(@RequestBody Scan scan) {
        // Save the scan object to the repository or perform any other necessary actions
        scanRepository.save(scan);
        return ResponseEntity.ok("Scan result saved successfully");
    }
}
