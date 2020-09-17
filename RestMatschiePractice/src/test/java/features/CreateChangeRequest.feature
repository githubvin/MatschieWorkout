Feature: Create New Change Request

Scenario: Create a new change request with short description

Given user is authenticated
And short description is added with Added from Cucumber for change
When new change is created
Then the status code is 201
And response includes the following
	|result.sys_created_by|admin|
	|result.sys_class_name|change_request|
	