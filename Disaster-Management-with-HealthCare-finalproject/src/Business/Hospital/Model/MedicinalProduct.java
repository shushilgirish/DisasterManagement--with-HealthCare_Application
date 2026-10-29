/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital.Model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author shush
 */
public class MedicinalProduct  {
     private int productid;
    private String productName;
    private double price;
    private String medicine_type;
    private Date expiry_date;
   int supplier_id;

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MedicinalProduct(int productid, String productName, double price, String medicine_type, Date expiry_date, int supplier_id) {
        this.productid = productid;
        this.productName = productName;
        this.price = price;
        this.medicine_type = medicine_type;
        this.expiry_date = expiry_date;
        this.supplier_id = supplier_id;
    }

   

    public String getMedicine_type() {
        return medicine_type;
    }

    public void setMedicine_type(String medicine_type) {
        this.medicine_type = medicine_type;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

   

    
}

