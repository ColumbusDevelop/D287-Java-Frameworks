<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>


# WESTERN GOVERNOR UNIVERSITY

## D287 – JAVA FRAMEWORKS

Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.

    MODIFIED - mainscreen.html
	
        Line 14: <title> My Bicycle Shop <title>
        TO
        Line 14: <title> DécorCraft Studio </title>
        
        Line 19: <h1> Shop </h1>
        TO
        Line 19: <h1> Signature Pieces  </h1>
		
		Line 53: <h1> Parts </h1>
        TO
        Line 53: <h2> Crafting Options </h2>

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

a)  The “Buy Now” button must be next to the buttons that update and delete products.
b)  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
c)  Display a message that indicates the success or failure of a purchase.

G.  Modify the parts to track maximum and minimum inventory by doing the following:

a)  Add additional fields to the part entity for maximum and minimum inventory.
b)  Modify the sample inventory to include the maximum and minimum fields.
c)  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
d)  Rename the file the persistent storage is saved to.
e)  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:

a)  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
b)  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
c)  Display error messages when adding and updating parts if the inventory is greater than the maximum.

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

J.  Remove the class files for any unused validators in order to clean your code.
