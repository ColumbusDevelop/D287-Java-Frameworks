
# WESTERN GOVERNOR UNIVERSITY

## D287 – JAVA FRAMEWORKS

Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
	Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.

    MODIFIED - mainscreen.html
	
        LINE #14:
		FROM
		<title>My Bicycle Shop<title>
        TO
        <title>DécorCraft Studio</title>
        
		LINE #21:
        FROM
		<h2>Parts</h2>
        TO
        <h2>Crafting Options</h2>
		
		LINE #53:
		FROM
		<h2>Products</h2>
        TO
        <h2>Signature Pieces</h2>

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

    ADDED - about.html

        <!DOCTYPE html>  
        <html lang="en">  
        <head>  
            <!--<meta charset="UTF-8">-->  
            <title>About Us</title>  
        </head>  
        <body>  
            <p>
            DécorCraft Studio: Crafting timeless elegance for your home, where every piece is a canvas for your unique style. Explore our curated collection and design a space that feels uniquely yours – because your home deserves nothing less than the extraordinary.
            </p>
            <div style="text-align: center;"> <a href="http://localhost:8080/">Go to Main Screen</a> </div> 
        </body>  
        </html>
		
	MODIFIED - mainscreen.html
    
        Line #20: <div style="text-align: left;"> <a th:href="@{about}">About us</a> </div>
		
	MODIFIED - MainScreenControllerr.java
	
		Line: #13: import org.springframework.web.bind.annotation.RequestMapping;
		Lines: #45 to #48:
		
		@GetMapping("/about")
		public String about() {
			return "about"
		}
		
E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
	Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

	MODIFIED - BootStrapData.JAVA
	
		Line #3: import com.example.demo.domain.InhousePart;
		
		Lines #71 to #161:
	
		long partCounter = partRepository.count();
		long outsourcedPartCounter = outsourcedPartRepository.count();
        long productCounter = productRepository.count();
		
		InhousePart up_seat = new InhousePart();
        up_seat.setName("Upholstered Seat");
		up_seat.setId(10);
        up_seat.setPrice(19.99);
        up_seat.setInv(10);
        InhousePart wooden_legs = new InhousePart();
        wooden_legs.setName("Wooden Legs");
		wooden_legs.setId(11);
        wooden_legs.setPrice(25.99);
        wooden_legs.setInv(10);
        InhousePart cushions_plush = new InhousePart();
        cushions_plush.setName("Plush Cushions");
		cushions_plush.setId(12);
        cushions_plush.setPrice(29.99);
        cushions_plush.setInv(10);
        InhousePart metal_fast = new InhousePart();
        metal_fast.setName("Metal Fasteners");
		metal_fast.setId(13);
        metal_fast.setPrice(39.99);
        metal_fast.setInv(10);
        InhousePart embroid_accents = new InhousePart();
        embroid_accents.setName("Embroidered Accents");
		embroid_accents.setId(14);
        embroid_accents.setPrice(45.99);
        embroid_accents.setInv(10);
		
        if (partCounter == 0) {
            partRepository.save(up_seat);
            partRepository.save(wooden_legs);
            partRepository.save(cushions_plush);
            partRepository.save(metal_fast);
            partRepository.save(embroid_accents);
        }
		
		OutsourcedPart dec_rests = new OutsourcedPart();
        dec_rests.setName("Decorative Armrests");
		dec_rests.setId(15);
        dec_rests.setPrice(15.99);
        dec_rests.setInv(10);
        dec_rests.setCompanyName("GlobalCraft Components");
        OutsourcedPart fab_mat = new OutsourcedPart();
        fab_mat.setName("High-Quality Fabric Materials");
		fab_mat.setId(16);
        fab_mat.setPrice(19.99);
        fab_mat.setInv(10);
        fab_mat.setCompanyName("GlobalCraft Components");
        OutsourcedPart stitch_pat = new OutsourcedPart();
        stitch_pat.setName("Stitching Patterns");
		stitch_pat.setId(17);
        stitch_pat.setPrice(21.99);
        stitch_pat.setInv(10);
        stitch_pat.setCompanyName("GlobalCraft Components");
        OutsourcedPart tassel_trim = new OutsourcedPart();
        tassel_trim.setName("Tassel Trim");
		tassel_trim.setId(18);
        tassel_trim.setPrice(23.99);
        tassel_trim.setInv(10);
        tassel_trim.setCompanyName("GlobalCraft Components");
        OutsourcedPart zip_clos = new OutsourcedPart();
        zip_clos.setName("Zipper Closures");
		zip_clos.setId(19);
        zip_clos.setPrice(30.99);
        zip_clos.setInv(10);
		zip_clos.setCompanyName("GlobalCraft Components");
		
        if (outsourcedPartCounter == 0) {
            outsourcedPartRepository.save(dec_rests);
            outsourcedPartRepository.save(fab_mat);
            outsourcedPartRepository.save(stitch_pat);
            outsourcedPartRepository.save(tassel_trim);
            outsourcedPartRepository.save(zip_clos);
        }

        Product classic_chair = new Product(100, "Classic Lounge Chair", 99.99, 15);
        Product contemp_armchair = new Product(101, "Contemporary Armchair", 125.99, 15);
        Product modern_sofa = new Product(102, "Modern Sofa", 150.99, 15);
        Product boho_bench = new Product(103, "Boho-Chic Cushioned Bench", 175.99, 15);
        Product elegant_seat = new Product(104, "Elegant Loveseat", 200.99, 15);


        if (productCounter == 0 ) {		
		    productRepository.save(classic_chair);
            productRepository.save(contemp_armchair);
            productRepository.save(modern_sofa);
            productRepository.save(boho_bench);
            productRepository.save(elegant_seat);
        }

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

	a

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
	a)  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
	b)  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
	c)  Display error messages when adding and updating parts if the inventory is greater than the maximum.

	a

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

	a

J.  Remove the class files for any unused validators in order to clean your code.

	a
