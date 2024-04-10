# ClearHealth System README

## Team Members

- Rajlaxmi Bahirat
- Benjamin Cohen
- Kado Kishimoto
- Carolina Milan Martinez
- Noam Yakar


## Overview
This document outlines the core classes and functionalities of the ClearHealth application, designed to facilitate patient intake, CT scan processing, and patient result viewing.

## System Components

### User Classes
- **User**
  - Base class for system users with common attributes like username and password.
- **Doctor**
  - Inherits from User; manages patient lists and oversees medical data.
- **Nurse**
  - Inherits from User; responsible for patient care and administrative tasks.
- **Patient**
  - Inherits from User; engages with the system to view personal health data.

### Information and Interaction Classes
- **DoctorInfo**
  - Handles detailed doctor profiles, including specialties.
- **PatientInfo**
  - Manages patient personal information and health records.
- **ChatRoom**
  - Facilitates communication between patients and healthcare professionals.

### System Functionality Classes
- **NotificationSystem**
  - Manages and sends notifications to system users.
- **AppointmentSystem**
  - Handles patient appointments, scheduling, and rescheduling.

## Application Flow

1. **User Login**
   - All user types log in to the system using their unique credentials.

2. **User-Specific Views**
   - Upon successful login, users are directed to their respective interfaces.

3. **Patient Intake and CT Scan Views**
   - Separate views for patient intake forms and CT scan technician interfaces are provided.

4. **Patient View**
   - Patients can view their personal health data and CT scan results.

5. **Data Management**
   - Data is securely handled, saved, and retrieved using the system's classes and methods.

## Running the Application
To launch the application, execute the `main` method in `homeworkOne`. This initializes the user interface and allows navigation between the various functional stages of the system.

### Notable Methods
- `showPatientIntakeStage()`: Displays the patient intake form.
- `savePatientInfo(...)`: Saves patient information entered during intake.
- `showCTScanTechView()`: Opens the CT scan technician's interface for data entry.
- `saveCTScanData(...)`: Saves the CT scan results.
- `showPatientView()`: Provides patients access to their health data and results.

<img width="721" alt="Screenshot 2024-04-10 at 11 34 16" src="https://github.com/NoamYakar23/cse360Phase3/assets/75957506/1e50707f-6dfc-4483-89b3-daff2539ba91">


