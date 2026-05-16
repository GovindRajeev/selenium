# Abhibus Automation Testing Framework

Automation testing framework for the Abhibus web application using Selenium WebDriver, Java, TestNG, and Maven.

## Overview

This project automates core bus booking workflows of the Abhibus web application using Selenium with Java. The framework is designed using the Page Object Model (POM) approach to improve code reusability, maintainability, and scalability.

The project focuses on automating user interactions such as homepage navigation, bus selection, and passenger information validation.

---

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)

---

## Features

✔ Automated Bus Booking Workflow Testing  
✔ Page Object Model Framework  
✔ UI & Functional Testing  
✔ TestNG Execution & Reporting  
✔ Reusable Page Classes  
✔ Maven Dependency Management  

---

## Project Structure

```bash
abhibus_pageobject/
│
├── src
│   ├── com
│       ├── pageobject
│       │   ├── Homepage.java
│       │   ├── BusSelection.java
│       │   ├── IxigoHomePage.java
│       │   ├── PassengerInfopage.java
│       │
│       ├── test
│           ├── Tc_01_BookBusServices.java
│
├── test-output
├── pom.xml
├── testng.xml
