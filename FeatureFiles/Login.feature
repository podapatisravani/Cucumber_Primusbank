Feature: PrimusBank
@scenariowithoutDatatable
Scenario: verify Login 
When I open PrimusBank URL on chrome
And I enter username and password
When click Login button
Then I should see admin text in url
When click on branches and click on new branch
And fill fields in new branch page
When click on submit

@scenariowithoutDatatable1
Scenario: Update branch
When i open PrimusBank URL on chrome
And i enter username and password
When click on Login button
Then I should see admin text in URL
When click on brances and click on edit button
And Update branch name and Adress1
And click on update and logout

@scenariowithoutDatatable2
Scenario: Delete Branch
When I open PrimusBank Url on chrome
And I enter Username and password
When Click on Login button
Then I should see admin text in Url
When click on branches and click on delete button
And confirm alert and confirm popup
And logout and close brower