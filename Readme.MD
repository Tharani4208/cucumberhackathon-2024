Name - Tharani Venkatesh
Employee ID - 2318295
Role - GenC Intern
Cohort Code - CSDQEA24QE001

Finding Hospitals
*******************
Problem Statement : Finding Hospitals
***************************************
Get the doctor details 1. Search Doctors (any one speciality like Dentist, Cardiologist, etc) for any City (like Chennai, Bangalore, Pune, etc). Apply filters for Patient Stories, Experience, Fees, Availability and any one Sorting; Fetch & display the first 5 Doctor details 2. Go to "Surgeries". Extract & store all the surgeries in a List & display them in console output. 3. Under "For Corporate -> Health and Wellness Plan", fill the form with invalid email id & valid details for other fields, validate if "Taking a demo" button is disabled. Print the observation in console output. Then provide email in valid format & click the button and validate "Thank You" message is displayed (Suggested Site:practo.com however you are free to choose any other legitimate site)

Detailed Description: Hackathon Ideas
***********************************
1. Search Doctors (any one speciality like Dentist, Cardiologist, etc) for any City (like Chennai, Bangalore, Pune, etc). Apply filters for Patient Stories, Experience, Fees, Availability and any one Sorting; Fetch & display the first 5 Doctor details
2. Go to "Surgeries". Extract & store all the surgeries in a List & display them in console output.
3. Under "For Corporate -> Health and Wellness Plan", fill the form with invalid email id & valid details for other fields, validate if "Taking a demo" button is disabled. Print the observation in console output. Then provide email in valid format & click the button and validate "Thank You" message is displayed

Key Automation Scope
********************
Handling alert, different browser windows, search option
Navigating back to home page
Extract multiple options items & store in collections
Filling form (in different objects in web page)
Capture warning message

***Test Scenarios and Test Cases For the above Requirement are***
---
Fetch & display the first five Doctors details
Scenario: Search Doctors for any city and apply filters
1. Given user enters city as "<city>" and user enters speciality as "<speciality>"
2. When user applies the filter
3. Then the user should able to get the doctors list
---
Extracting & storing all the surgeries in a List
Scenario: Clicking on surgery in the home page and storing the surgeries in a list
1. Given user clicks the surgery in the home page
---
Under For Corporate user will fill the form using invalid number
Scenario: Inspecting the health and wellness form under for corporate section with invalid details
1. Given user clicks on the for corporate in the home page for invalid number
2. When user clicks the health and corporate plans with invalid number
3. And user fills the form with invalid number
4. But the button is disabled when invalid number is given
----
Under For Corporate user will fill the form using invalid email
Scenario: Inspecting the health and wellness form under for corporate section with invalid email
1. Given user clicks on the for corporate in the home page for invalid email
2. When user clicks the health and corporate plans with invalid email
3. And user fills the form with invalid email
4. But the button is disabled
----
Under For Corporate user will fill the form
Scenario: Inspecting the health and wellness form under for corporate section
1. Given user clicks on the for corporate in the home page
2. When user clicks the health and corporate plans
3. And user fills the form
4. And user clicks on schedule a demo button
5. Then the user validates whether the ThankYou message is displayed or not
----

Utility Classes
***************
1. ExcelUtility.java    - For writing data to Excel sheet

Technologies Used
*****************
1. Java Programming Language
2. Selenium Automation Tool
3. Cucumber Framework
4. Apache Log4j
5. Apache POI
6. AventStack
7. JUnit
