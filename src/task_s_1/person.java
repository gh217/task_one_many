package task_s_1;

public class person extends idName {
    
    private String address="null";
    private order ord = new order();
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    /// if i neeed it
    public order getOrd(){
        return this.ord;
    }
    
    public void print(){
        System.out.println("name : " + getName());
        System.out.println("id : " + getId());
    }
    
}
