package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;

import java.util.List;
import java.util.Optional;

import java.util.Set;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

		long partCounter = partRepository.count();
		long outsourcedPartCounter = outsourcedPartRepository.count();
        long productCounter = productRepository.count();
		
		InhousePart up_seat = new InhousePart();
        up_seat.setName("Upholstered Seat");
		up_seat.setId(10);
        up_seat.setPrice(19.99);
        up_seat.setInv(10);
		up_seat.setFloorInventory(1);
        up_seat.setCielingInventory(100);
        InhousePart wooden_legs = new InhousePart();
        wooden_legs.setName("Wooden Legs");
		wooden_legs.setId(11);
        wooden_legs.setPrice(25.99);
        wooden_legs.setInv(10);
		up_seat.setFloorInventory(1);
        up_seat.setCielingInventory(100);
        InhousePart cushions_plush = new InhousePart();
        cushions_plush.setName("Plush Cushions");
		cushions_plush.setId(12);
        cushions_plush.setPrice(29.99);
        cushions_plush.setInv(10);
		up_seat.setFloorInventory(1);
        up_seat.setCielingInventory(100);
        InhousePart metal_fast = new InhousePart();
        metal_fast.setName("Metal Fasteners");
		metal_fast.setId(13);
        metal_fast.setPrice(39.99);
        metal_fast.setInv(10);
		up_seat.setFloorInventory(1);
        up_seat.setCielingInventory(100);
        InhousePart embroid_accents = new InhousePart();
        embroid_accents.setName("Embroidered Accents");
		embroid_accents.setId(14);
        embroid_accents.setPrice(45.99);
        embroid_accents.setInv(10);
		up_seat.setFloorInventory(1);
        up_seat.setCielingInventory(100);
		
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
		up_seat.setFloorInventory(1);
        up_seat.setCielingInventory(100);
        dec_rests.setCompanyName("GlobalCraft Components");
        OutsourcedPart fab_mat = new OutsourcedPart();
        fab_mat.setName("High-Quality Fabric Materials");
		fab_mat.setId(16);
        fab_mat.setPrice(19.99);
        fab_mat.setInv(10);
		up_seat.setFloorInventory(1);
        up_seat.setCielingInventory(100);
        fab_mat.setCompanyName("GlobalCraft Components");
        OutsourcedPart stitch_pat = new OutsourcedPart();
        stitch_pat.setName("Stitching Patterns");
		stitch_pat.setId(17);
        stitch_pat.setPrice(21.99);
        stitch_pat.setInv(10);
		up_seat.setFloorInventory(1);
        up_seat.setCielingInventory(100);
        stitch_pat.setCompanyName("GlobalCraft Components");
        OutsourcedPart tassel_trim = new OutsourcedPart();
        tassel_trim.setName("Tassel Trim");
		tassel_trim.setId(18);
        tassel_trim.setPrice(23.99);
        tassel_trim.setInv(10);
		up_seat.setFloorInventory(1);
        up_seat.setCielingInventory(100);
        tassel_trim.setCompanyName("GlobalCraft Components");
        OutsourcedPart zip_clos = new OutsourcedPart();
        zip_clos.setName("Zipper Closures");
		zip_clos.setId(19);
        zip_clos.setPrice(30.99);
        zip_clos.setInv(10);
		up_seat.setFloorInventory(1);
        up_seat.setCielingInventory(100);
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
		
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
