package com.dxc.services;

import java.util.List;

import com.dxc.dao.CustomerDao;
import com.dxc.poojos.Cart;
import com.dxc.poojos.Customer;
import com.dxc.poojos.Product;

public class CustomerService {
	CustomerDao dao=new CustomerDao();
	
	public boolean passwordChange( int cid,String pass) {
        return dao.passwordChange(cid,pass);
    }
	public boolean customerlogin(Customer cs) {
		return dao.customerlogin(cs);
	}
	 public List<Product> availableProducts()
	   {
	      return dao.availableProducts();
	   }
	   
	   public boolean addproducttocart(int id,Cart c,int cid,Product p) 
	   {
		   return dao.addproducttocart(id,c, cid, p);
	   }
	   
	   public List<Cart> showCartProducts(int cid)
	   {
		   return dao.showCartProducts(cid);
	   }
	   public Product getProduct(int id)
	   {
		   return dao.getProduct( id);
	   }
	public boolean pay(int cid, int id, double payableAmmount) {
		return dao.pay(cid,id,payableAmmount);
	}
	public boolean walletBalance(Customer c, double balance, int cid) {
        return dao.walletBalance(c, balance, cid);
    }
	  public List<Customer> showWallet(int cid)
      {
          return dao.showWallet(cid);
      }



}