# MySQL Schema Design

## Table: patient
- id INT PRIMARY KEY AUTO_INCREMENT
- name VARCHAR(100)
- email VARCHAR(100)
- phone VARCHAR(20)

## Table: doctor
- id INT PRIMARY KEY AUTO_INCREMENT
- name VARCHAR(100)
- specialty VARCHAR(100)

## Table: appointment
- id INT PRIMARY KEY AUTO_INCREMENT
- doctor_id INT, FOREIGN KEY REFERENCES doctor(id)
- patient_id INT, FOREIGN KEY REFERENCES patient(id)
- appointment_time DATETIME

## Table: prescription
- id INT PRIMARY KEY AUTO_INCREMENT
- appointment_id INT, FOREIGN KEY REFERENCES appointment(id)
- content TEXT
