package task_s_1;

import java.util.Vector;

public class order extends idName implements orderInter{
    
    private double price=0;
    private Vector<product> pro_o = new Vector();
    public static int count;
    
    /*
    // to make order
    @Override
    public void createOrder(product pr , order r){
        r.pro_o=pr.getList();
        r.setId(++c);
    }

    
    // to print aorder
    public void printOrder(order r){
        System.out.println( "order number : "+r.getId());
        for (product pr : r.pro_o) {
            System.out.println(pr.getName() +" " + pr.getQuantity() + " " + pr.getPrice());
            price+=pr.getQuantity()*pr.getPrice();
        }
        System.out.println("total " + price);
    }

    public Vector<product> getPro_o() {
        return pro_o;
    }
    */
    
    ///////***************
    /// to add product in order
    public void addToOrder(int id , float quantity){
        product p = new product();
        
        p=p.addProduct(id, quantity);
        if(p==null) return;
        
        //p.setQuantity(quantity);
        int x=p.found(p.getId(), pro_o);
        
        if(x>-1){
            pro_o.elementAt(x).setQuantity( pro_o.elementAt(x).getQuantity() +quantity);
        }else{
            p.setQuantity(quantity);
            pro_o.add(p);
        }      
        //System.out.println(p.getQuantity());
    }
    
    /// to print prder
    public void printOrder(){
        System.out.println(count);
        
        double price=0;
        for (product object : this.pro_o) {
            System.out.println(object.getName() + " quantity : " + object.getQuantity()+" price : " + object.getPrice());
            price+=object.getQuantity()*object.getPrice();
        }
        System.out.println("total : " + price );
    }
    
    /// to ++ id
    public void doneOrder(){
        setId(++count);
    }

   
}
