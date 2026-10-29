/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model.Supplier;

import Business.Hospital.Model.FoodProductDirectory;
import Business.Hospital.Model.FoodProducts;
import Business.Hospital.Model.MedicalDevices;
import Business.Hospital.Model.MedicalDevicesDirectory;
import Business.Hospital.Model.MedicinalProduct;
import Business.Hospital.Model.MedicinalProductDirectory;
import java.util.ArrayList;

/**
 *
 * @author shush
 */
public class Supplier {
    private int Supplier_id;
    private int age;
    private String phonenumber;
    private String Supplier_Name;
    private double ratings;
    
    private MedicinalProductDirectory pharmaceutical_products;
    private MedicalDevicesDirectory medical_devices;
    private FoodProductDirectory Food_products;

    public int getSupplier_id() {
        return Supplier_id;
    }

    public void setSupplier_id(int Supplier_id) {
        this.Supplier_id = Supplier_id;
    }

    public String getSupplier_Name() {
        return Supplier_Name;
    }

    public void setSupplier_Name(String Supplier_Name) {
        this.Supplier_Name = Supplier_Name;
    }

    public FoodProductDirectory getFood_products() {
        return Food_products;
    }

    public void setFood_products(FoodProductDirectory Food_products) {
        this.Food_products = Food_products;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public MedicinalProductDirectory getPharmaceutical_products() {
        return pharmaceutical_products;
    }

    public void setPharmaceutical_products(MedicinalProductDirectory pharmaceutical_products) {
        this.pharmaceutical_products = pharmaceutical_products;
    }

    public MedicalDevicesDirectory getMedical_devices() {
        return medical_devices;
    }

    public void setMedical_devices(MedicalDevicesDirectory medical_devices) {
        this.medical_devices = medical_devices;
    }

    public Supplier(int Supplier_id, int age, String phonenumber, String Supplier_Name, double ratings) {
        this.Food_products = new FoodProductDirectory();
        this.medical_devices = new MedicalDevicesDirectory();
        this.pharmaceutical_products = new MedicinalProductDirectory();
        this.Supplier_id = Supplier_id;
        this.age = age;
        this.phonenumber = phonenumber;
        this.Supplier_Name = Supplier_Name;
        this.ratings = ratings;
       
        
    }
    public ArrayList<FoodProducts> GetFoodProductsbyid(int id){
        ArrayList<FoodProducts> f= new ArrayList<>();
        for(FoodProducts fd: Food_products.getFoodproducts()){
            if(fd.getSupplier_id()==id){
               f.add(fd);
            }
        }
        return f;
    }
    public ArrayList<MedicalDevices> GetDevicesbyid(int id){
        ArrayList<MedicalDevices> f= new ArrayList<>();
        for(MedicalDevices fd: medical_devices.getMedicalDevices()){
            if(fd.getSupplier_id()==id){
               f.add(fd);
            }
        }
        return f;
    }
     public ArrayList<MedicinalProduct> GetMedicinesbyid(int id){
        ArrayList<MedicinalProduct> f= new ArrayList<>();
        for(MedicinalProduct fd: pharmaceutical_products.getMedicinalProducts()){
            if(fd.getSupplier_id()==id){
               f.add(fd);
            }
        }
        return f;
    }
    

 }
