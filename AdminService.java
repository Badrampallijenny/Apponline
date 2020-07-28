package com.dxc.services;

 

import java.util.List;

 

import com.dxc.dao.AdminDao;
import com.dxc.poojos.Admin;
import com.dxc.poojos.Customer;
import com.dxc.poojos.Product;

 

public class AdminService {

 

    AdminDao dao=new AdminDao();

 

    public void addAdmin(Admin a)
    {
        dao.addAdmin(a);
    }
    public boolean login(Admin a) {
    return dao.login(a);
    }
    public void addproduct(Product p) {
        dao.addproduct(p);
    }
    public void remove(int cid)
    {
        dao.remove(cid);
    }
    public void addcustomer(Customer c) {
        dao.addcustomer(c);
    }
    public List<Product> display(){
return dao.display();
    
    }
    public void removeproduct(int id)
    {
        dao.removeproduct(id);
    }
    
}