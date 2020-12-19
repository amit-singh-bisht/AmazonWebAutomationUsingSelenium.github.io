# seleniumWebdriver

Create a framework for Selenium UI Automation which should contain the below things:
- Page Object Model (POM)
- Generating reports using reporting tool (Allure/Extent)	
	[Note: I have used Extent to generate my report]
- Reading and writing from/to excel file
- Generating execution logs
- Taking screenshots
- TestNG

You can take Amazon shopping site to create test scripts (don't use any login, you can skip the login while writing script)

Test Cases:
- add any electronic product to cart which is available in stock
- write script to add filter for mobile phones, filter options to add
[device: android, cost: lower than 10k]

What extra is done apart from above mentioned framework and test cases

Framework:
- Maven
- Jenkin (with options given to user to choose the required browser from chrome, firefox and explorer)
- Cucumber

Test Cases:
- "mobile" is given as input from the excel
- first three products that comes up during the search are added to cart 
- purposely failed the login test case as it was not mandatory

Database:
- integrated java with MySQL
