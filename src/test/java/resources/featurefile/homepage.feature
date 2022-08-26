Feature:User Checking Functionality
  @smoke
  Scenario:User should sign-up page successfully
    Given I am on the sign-up Homepage
    When I complete personal details and click next
    And I complete address details and click next
    And I complete details on account section and click on create account
    Then I should see "Account Created" and "Please select your Welcome Bonus"



