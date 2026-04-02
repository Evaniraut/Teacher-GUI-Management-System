# Teacher Management GUI System

## Project Overview
This project is a Java-based Desktop Application developed as part of the **CS4001NI Programming** module. It provides a Graphical User Interface (GUI) to manage academic staff records, specifically handling `Lecturer` and `Tutor` data within an integrated system.

The application allows for adding staff members, managing salary appraisals for tutors, and handling assignment grading for lecturers, all while maintaining data integrity through Object-Oriented Programming (OOP) principles.

## Student Information
* **Name:** Evani Raut
* **London Met ID:** 23047473
* **College ID:** NP01NT4A230151
* **Group:** N6

## Features
* **Staff Registry:** Add and store Lecturer and Tutor details in a centralized `ArrayList`.
* **Lecturer Management:** * Grade assignments based on specific department and years of experience criteria.
* **Tutor Management:**
    * Set and update salaries with automated appraisal calculations based on performance indices (5%, 10%, or 20% increases).
    * Remove non-certified tutors from the system.
* **Interactive GUI:** A multi-panel interface built with Java Swing, featuring custom layouts and input validation.

## Technical Specifications
* **Language:** Java
* **Framework:** Java Swing (GUI)
* **Concepts Used:** Inheritance, Encapsulation, Polymorphism, and ArrayList Collections.
* **Tools:** * **BlueJ:** Primary IDE for development.
    * **Draw.io:** Used for designing the Class Diagram.
    * **MS Word:** Used for technical documentation.

## Project Structure
* `Teacher.java`: The parent class containing common attributes like ID, Name, and Working Hours.
* `Lecturer.java`: Subclass extending Teacher with grading functionalities.
* `Tutor.java`: Subclass extending Teacher with salary appraisal and removal logic.
* `TeacherGUI.java`: The main class that handles the frame, panels, and event handling.

## How to Run
1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/YOUR_USERNAME/Teacher-GUI-Management-System.git](https://github.com/YOUR_USERNAME/Teacher-GUI-Management-System.git)
    ```
2.  **Open in BlueJ:**
    * Launch BlueJ.
    * Select `Project` -> `Open Project` and navigate to the cloned folder.
3.  **Compile & Execute:**
    * Right-click the `TeacherGUI` class.
    * Select `void main(String[] args)` to launch the application.

## License
This project was created for academic purposes as part of a degree program at London Metropolitan University.
