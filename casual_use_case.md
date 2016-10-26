## Casual Description ##

This document is the description of the casual use case for Log in use case and search product use case.

### Casual Use Case ###


**1. Use case number 1 : Log in (admin, customer)**


User must have an account in the system before starting this use case.


The administrator or the customer must enter his login and his password and confirm. 
The system check if the login and password already exists. 
If they exists, the user is connected into the application and he arrives in application’s home.
If login and password doesn’t exists, the system will display an appropriate error message and the user can try again to log in with good login and password.


The system searchs to find if there is a good login and password, it must not exceed 10 seconds, beyond this time, an appropriate error message will display to warn the user.



**2. Use case number 4 : Search product (admin, customer)**


User must have an account in the system before starting this use case.


The user logs onto the system and may search products they want. The user searches by name, price, category, origin. The system will search a correspondence with the criteria previously entered.
If the system finds at least one correspondence, the system will display the products found.
If no elements fit the search, the system displays an appropriate message to warn the user. If the user entered bad characters in the search bar, an appropriate error message will be displayed. 


The search must not exceed 10 seconds, beyond this time, an appropriate error message will be displayed to warn the user.