package com.dxc.Controllers;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dxc.poojos.Admin;
import com.dxc.poojos.Customer;
import com.dxc.poojos.Product;
import com.dxc.services.AdminService;
   @Controller
   @RequestMapping("/views")
   public class AdminController
   {
       Admin a=new Admin();
       AdminService service=new AdminService();
       @RequestMapping("/insert")
       public String add(@ModelAttribute Admin a,HttpSession session)
       {
           System.out.println("lllllll");



           service.addAdmin(a);
            String message="added";
            session.setAttribute("message", message);
            return"message";
       }
   
   @RequestMapping("/login")
public String login(@ModelAttribute Admin a,HttpSession session)
{
   
   boolean b=service.login(a);
   System.out.println(b);



   if(b==true) 
   {
    return"op";
       }
   else 
   {
       String message="login unsucessful";
    session.setAttribute("message", message);
    return"message";
   }
}    
@RequestMapping("/addproduct")
   public String addproduct(@ModelAttribute Product p,HttpSession session )
   {
   System.out.println("going to add");
   service.addproduct(p);
    String message="products added";
   session.setAttribute("message", message);
   return "message";
       
   }
@RequestMapping("/remove")
public String remove(@RequestParam int cid,HttpSession session)
{
   service.remove(cid);
    String message="removed";
    session.setAttribute("message", message);
    return"message";



}
@RequestMapping("/addcustomer")
public String addproduct(@ModelAttribute Customer c,HttpSession session )
{
System.out.println("going to add");
service.addcustomer(c);
String message="customer added";
session.setAttribute("message", message);
return "message";
   
}
@RequestMapping("/prod")
public String display(Model m) {
    List<Product> list=service.display();
    m.addAttribute("list", list);
   return "showproducts";
   
}
@RequestMapping("/removeproduct")
public String removeproduct(@RequestParam int id,HttpSession session)
{
   service.removeproduct(id);
    String message="product is removed";
    session.setAttribute("message", message);
    return"message";

}
   
   
   
}


