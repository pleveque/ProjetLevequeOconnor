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



**2. Use case number 3 : Search product (admin, customer)**


User must have an account in the system before starting this use case.


The user logs onto the system and may search products they want. The user searches by name, price, category, origin. The system will search a correspondence with the criteria previously entered.
If the system finds at least one correspondence, the system will display the products found.
If no elements fit the search, the system displays an appropriate message to warn the user. If the user entered bad characters in the search bar, an appropriate error message will be displayed.


The search must not exceed 10 seconds, beyond this time, an appropriate error message will be displayed to warn the user.

 **3.Use case number 9: Remove Product(Admin)**


Allows a user to remove a stock item from the system without giving a reason for it. With the correct details entered the stock level of the current product can be altered the remove the product from stock. This is essential as it would not be feasible to remove all products through the ‘Waste Product’ or ‘Check Out’ function.


The user will log onto the system and enter the details of the product they wish to alter. The detail required will be the UPC(Universal Packing Code). The system will then search the database for the specified UPC and return any details that are necessary. It will return all details of the stock item so a user will know all the relevant information before making any alteration to the file.
The user will then have the opportunity to make alterations the the stock level. If no product is found an appropriate error message will be displayed to say that the UPC has not been found.


The search must not exceed 10 seconds, beyond this time, an appropriate error message will be displayed to warn the user.


 **4.Use case number 10: Waste Product(Admin)**
 
 
User must be an administrator of the system before they can perform this function.


The user will log onto the system and enter the UPC of the product they wish to waste. If the entered UPC exists its details will be shown to the user. The user will then have to choose what type of waste they will to record this product under. Is it a New Date Expired Waste, Quality Waste, or a Return To Manufacturer waste. These are the only 3 options that the user has and if they wish to waste a product they will have to choose one. 
If the user does choose to waste a product they will have to choose the quantity that they wish to waste. This quantity can be more than the stock level of the product as it is possible for a stock level to be a negative number.  


The search must not exceed 10 seconds, beyond this time, an appropriate error message will be displayed to warn the user. The amount entered for the wasting of a product must be an positive integer value. Anything else will cause an error message to be shown on screen.
