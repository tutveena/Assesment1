Feature: SalesForce Report functionality

Background:
Given Launch the application
And Enter username as 'makaia@testleaf.com'
And Enter password as 'Bootcamp@123'
When Click login button


Scenario: TC002_User is able to download lead report image
Given User is in Home Page and clicks on applaauncher
When click on ViewAll
And Click on Services
And Click on Reports
And Click on  New ReportSalesForce Classic
And Click on Leads
Then download the Lead Report Image on the Right side and click on Create



