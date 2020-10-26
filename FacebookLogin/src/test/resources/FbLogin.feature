@Logintest
Feature: Validate login function in Facebook Login

Scenario: Users able to login with valid credential

Given user open web browser and navigate to Facebook login screen 
	Then users Navigate to Page and verify the Page Title is "Facebook" 
	And users enter a valid username and password 
	And users click the Sign in button 
