Feature: Getting a data from database

Scenario: Get some Data

Given Get the connection and get the data "select * from products;" , "productCode" , "S10_4698" ,  "productName"


Scenario Outline:
Given Get the connection and get the data "<myQuery>" , "<ColumnName>" , "<myExpectedID>" ,  "<ExpectedColumnName>"


	Examples: 
	      
	      |myQuery|ColumnName|myExpectedID|ExpectedColumnName|
	      |select * from employees;|employeeNumber|1621|LastName|
	      |select * from offices;|officeCode|4|city|
	
	



 