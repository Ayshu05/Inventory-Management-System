# Inventory-Management-System
The Inventory Management System refers to the system and processes to manage the stock of organization with the involvement of Technology system. This system can be used to store the details of the inventory, stock maintenance, update the inventory based on the salesdetails, generate sales and inventory report over a period of time.

Inventory Management System is important to ensure quality control in businesses that handle transactions resolving around consumer goods. Without proper inventory control, a large retail store may runout of stock on an important item. Thus, it allows organizations to store, manage and track their goods and services and also analyze the past transactions and deals. It also enables them to manage the records of customers and their orders for future references and further details.

Features:

a. User Roles: The system will have two main user roles: admin and staff. The admin will have full access to all features and functionalities, while the staff will have limited access based on their assigned permissions like stock management and billing.

b. Inventory Management: The system will allow users to manage inventory, including adding new products, updating product information (e.g., name, description, price), and deleting products.

c. Stock Tracking: The system will track the quantity of each product in stock.

d. Purchase Management: Users will be able to create purchase orders for restocking inventory. The system will record and track purchase details such as supplier information & order date.

e. Billing and Invoicing: The system will generate invoices for customer purchases and track billing information. It will calculate the total amount due, apply discounts if applicable.

This project was developed by B Ayshwarya, C B Ananya and Harini Mohan
**
Setting up the environment and adding libraries**
Download Netbeans IDE (We have used Netbeans IDE 8.2) Download Oracle 11g and setup sqlplus. Set userid and password.

Execute the commands in the "CreateTables.txt" file in sqlplus Command Line Client one-by-one for creating the necessary tables for the application.

Extract the Project Folder from the zip file in this repository.

Open the project folder using the IDE. On the left, below a line of icons, you will see- Projects, Services, Files. Click on Services. Under Services, right-click on Drivers and add the "ojdbc8.jar" file which you can find in the "JAR FILES" folder of this repository. Now, under "Drivers" you will see "Oracle Thin". Select "Oracle Thin". In the window that opens, replace the userid and password with your localhosts's userid and password and click on "Finish"

This should connect your application to the database.

Under the Projects section in the left side, click on Libraries and add all the jar folders which are available in the "JAR FILES" folder of this repository.

To run the application:
Under the Projects section, in the project folder, navigate to "Source Packages"->"MainFiles".

Run the file named "Homes.java"

You are now good to go!

For a complete application walkthrough and other implementation details, please check out the Project Report and the Program Walkthrough documents!

f. User Authentication and Security: The system will require users to authenticate themselves before accessing the application.

g.Generate bill: The invoice that has been generated for the particular order can be generated as a hard copy by connecting to system printer and also can be obtained as a pdf.

