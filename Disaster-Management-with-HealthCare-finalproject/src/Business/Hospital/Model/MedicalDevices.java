/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital.Model;

/**
 *
 * @author shush
 */
public class MedicalDevices {
      private int productid;
    private String productName;
    private double price;
   private String deviceType;
   int supplier_id;

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

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public MedicalDevices(int productid, String productName, double price, String deviceType, int supplier_id) {
        this.productid = productid;
        this.productName = productName;
        this.price = price;
        this.deviceType = deviceType;
        this.supplier_id = supplier_id;
    }

   

   
    public String getDeviceType() {
        return deviceType;
    }

    
}
