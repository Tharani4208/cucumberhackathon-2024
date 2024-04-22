Feature: Fetch & display the first five Doctors
  details
  
	@sanity @regression
  Scenario: Search Doctors for any city and apply filters
    Given user enters city as "<city>" and user enters speciality as "<speciality>"
    When user applies the filter
    Then the user should able to get the doctors list
    Examples: 
         | city       | speciality |
         | Bangalore	| Dentist 	 |