package com.smartclinic.controller;

import com.smartclinic.entity.Prescription;
import com.smartclinic.repository.PrescriptionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {
    private final PrescriptionRepository prescriptionRepository;

    public PrescriptionController(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    @PostMapping
    public ResponseEntity<Prescription> savePrescription(@RequestBody Prescription prescription) {
        return ResponseEntity.ok(prescriptionRepository.save(prescription));
    }
}
