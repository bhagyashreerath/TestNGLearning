# TestNGLearning

Simple TestNG + Selenium learning project (Java, Maven) containing basic page objects, actions and a sample test.

## Overview
This repository demonstrates a small test automation structure using:
- Java
- Maven
- TestNG
- Selenium WebDriver (page objects + actions)

## Prerequisites
- JDK 8+ installed
- Maven installed

## Build and run tests
From the project root run:

mvn test

(Adjust browser drivers or WebDriver setup as needed in src/main/java/org/learning/managers/WebDriverManager.java)

## Project structure
- src/main/java: page objects, actions and manager classes
- src/test/java: TestNG tests

## TODO
- [ ] Add CI workflow (GitHub Actions) to run tests on push
- [ ] Implement parallel test execution
- [ ] Add explicit logging and reporting (Allure / ExtentReports)
- [ ] Implement data-driven tests (CSV/Excel/JSON)
- [ ] Parameterize browsers and environments
- [ ] Add more test coverage and negative test cases
- [x] Create a git repo and push the code



---
Generated on: 2025-10-19

