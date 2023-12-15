package com.example.demo.domain;
import com.example.demo.validators.ValidDeletePart;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 *
 *
 *
 *
 */
@Entity
@ValidDeletePart
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="part_type",discriminatorType = DiscriminatorType.INTEGER)
@Table(name="Parts")
public abstract class Part implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;	
    @Column String name;
	@Column
    @Min(value = 0, message = "Price value must be positive")
    double price;
	@Column
    @Min(value = 0, message = "Inventory value must be positive")
    int inv;
	// Added check for exceeding inventory minimum and maximum
    // test
    // test
	@Min(value = 1, message = "Inventory minimum exceeded")
    @Column
    static Integer floorInventory = 1;
    @Max(value = 50, message = "Iventory maximum exceeded")
    @Column
    static Integer cielingInventory = 100;
    @ManyToMany
    @JoinTable(name="product_part", joinColumns = @JoinColumn(name="part_id"),
            inverseJoinColumns=@JoinColumn(name="product_id"))
    Set<Product> products= new HashSet<>();
    public Part() {
    }
    public Part(String name, double price, int inv) {
        this.name = name;
        this.price = price;
        this.inv = inv;
    }
	// Added function so floorInventory and cielingInventory can be passed as parameters
    // test
    // test
    public Part(long id, String name, double price, int inv, int floorInventory, int cielingInventory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.floorInventory = floorInventory;
        this.cielingInventory = cielingInventory;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getInv() {
        return inv;
    }
    public void setInv(int inv) {
        this.inv = inv;
    }
	public void setFloorInventory(Integer inv) { this.floorInventory = inv; }
    public Integer getFloorInventory() { return floorInventory; }
    public void setCielingInventory(Integer maxInventory) {
        this.cielingInventory = maxInventory;
    }
    public Integer getCielingInventory() {
        return cielingInventory;
    }
    public Set<Product> getProducts() {
        return products;
    }
    public void setProducts(Set<Product> products) {
        this.products = products;
    }
	// Checks if inventory is within valid bounds
    // test
    // test
	public static boolean inventoryIsValid(int inv) {
        if(inv >= floorInventory && inv <= cielingInventory) {
            return true;
        }
        else { return false; }
    }
	// Checking field choices to see if floorInventory and cielingInventory are valid
    // test
    // test
	public static boolean atLowBounds(int inv) {
        if(inv <= (floorInventory - 1)){
            return false;
        }
        else { return true; }
    }
    public static boolean atUpBounds(int inv) {
        if (inv > cielingInventory) {
            return false;
        }
        else { return true; }
    }
    public String toString(){
        return this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Part part = (Part) o;

        return id == part.id;
    }
    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
