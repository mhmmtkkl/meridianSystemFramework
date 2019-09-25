@SmokeTest2
Feature: Creating the new Exam

Scenario: Create New exam and verify in the exam page

  Given Nagigate to Meridian Website
  And Fill the username and password input after this  click on the sign in button
  And Click on exam dropdown
  And Click on setup 
  And Click on Entrance Exams
  And Click on plus icon 
  Then New Exam Page Should be displayed
  And Type the exam name reg. start reg.end  choose the document type 
  And Click on save 
  Then Exam should be displayed in the Entrance Examinations page
  
   
   
    
    