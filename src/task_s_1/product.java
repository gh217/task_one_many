package task_s_1;

import java.util.Vector;

public class product extends idName {
    
    private float quantityDb;
    private float quantity;
    private double price;
    
    /// in data base 
    private static Vector<product> pro = new Vector();
    
    public product() {};

    // to add data
    public product(int id , String name , int quantityDb,  double price) {
        this.setId(id);
        this.setName(name);
        this.quantityDb = quantityDb;
        this.price = price;
    }

    
    public float getQuantityDb() {
        return quantityDb;
    }

    public void setQuantityDb(float quantityDb) {
        this.quantityDb = quantityDb;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    //product in data;
    public static void dB(){
        product.pro.add(new product(1,"Apple" , 100 , 10));
        product.pro.add(new product(2,"Banana" , 100 , 5));
        product.pro.add(new product(3,"milk" , 50 , 15));
        product.pro.add(new product(4,"juice" , 70 , 7));
    }
    
    /*
    ///*** print all data
   
    private  Vector<product> take = new Vector<>();
    
    // what i buy
    public void print(){
        for (product p : pro) {
            System.out.println(p.getId() + " " + p.getName()+ " " + p.getQuantityDb()+" " + p.getPrice() );
        }
    }
    
    ///////////////////////////////////////////////###############################################################
   
    @Override
    public void takeProduct( int id , float quantity ){
        
        for( int i=0 ; i<pro.size() ; i++ ){
            if( id == pro.elementAt(i).getId()){
                if( quantity <= pro.elementAt(i).getQuantityDb()){
                    pro.elementAt(i).setQuantityDb(pro.elementAt(i).getQuantityDb()-quantity);
                    //pro.elementAt(i).quantity=quantity;
                    // to check found or not
                    int x=found(pro.elementAt(i).getId());
                    if(x>-1){
                        take.elementAt(x).quantity+=quantity;
                    }else{
                        pro.elementAt(i).quantity=quantity;
                        take.add(pro.elementAt(i));
                    }
                }else{
                    System.out.println("this quantity not available " + pro.elementAt(i).getName()+ "  available "+
                        pro.elementAt(i).quantityDb);
                }
                break;
            }
        }
    }
    
    // if item have this product or not
    private int found(int id ){
        
        for( int i=0 ; i<take.size() ; i++)
            if( take.elementAt(i).getId()==id)
                return i;
        return -1;
    }
    
    // to return the item i buy
    public Vector<product> getList(){
        //System.out.println(take.elementAt(0).price);
        return this.take;
    }

    */
    ////*/************
    public product addProduct( int id , float quantity){
        
        for( int i=0 ; i<pro.size() ; i++ ){
            if( id == pro.elementAt(i).getId()){
                if( quantity <= pro.elementAt(i).getQuantityDb()){
                    pro.elementAt(i).setQuantityDb(pro.elementAt(i).getQuantityDb()-quantity);
                    return pro.elementAt(i);
                }else{
                    System.out.println("this quantity not available " + pro.elementAt(i).getName()+ "  available "+
                        pro.elementAt(i).quantityDb);
                    return null;
                }
            }
        }  
        return null;
    }
    
    /// to check if thtis item found before or not
    public int found(int id , Vector<product> take){
        
        for( int i=0 ; i<take.size() ; i++)
            if( take.elementAt(i).getId()==id)
                return i;
        return -1;
    }
    
    /// print * element
    public static void print(){
        for (product p : pro) {
            System.out.println(p.getId() + " " + p.getName()+ " " + p.getQuantityDb()+" " + p.getPrice() );
        }
    }
}
