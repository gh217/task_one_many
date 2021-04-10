package task_s_1;

import java.util.Vector;

public interface productInter {
    
    public product addProduct( int id , float quantity);
    
    
     /// to check if thtis item found before or not
    public int found(int id , Vector<product> take);
}
