
package Chapter5;

//class members ada 2 iaitu (1) property (2) method
public class Person {
    public String name;
    int age;
    String gender;
    // Tajuk Encapsulation - x boleh direct akses data berkenaan
    private String statusKahwin;
    // Public
    public String getStatusKahwin(String jenisOrang){
        if (jenisOrang.equals("kanak2") ){
            return "Muda lagi!";
        } else 
            if (jenisOrang.equals("tansri")) {
               return "Janda";
        } else
               return "Bujang";
    }
                //return this.statusKahwin;
    
    
    void walk(){
        
    }
    
    void talk(){
        
    }
    void sing(){
        
    }
}
