/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author shreyamalapaka
 */
public class DeliveryPackage {
    int packageId;
    double packageWeight;
    ArrayList<Product> productList;

    Customer customer;

    
    public DeliveryPackage() {
        this.productList = new ArrayList<Product>();
       
        this.customer =  new Customer();
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
    
    public Product createProd(int prodId, String prodName, double prodPrice){
        
        Product product = new Product();
        product.setProdId(prodId);
        product.setProdName(prodName);
        product.setProdPrice(prodPrice);
        
        this.productList.add(product);
        
        return product;
              
    }
    
    public Product findProd(int productid){
        
        for (Product p : this.productList){
            if(p.getProdId() == productid){
                return p;
            }
        }
        return null;
    }
  
}
