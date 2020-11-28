
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class identity {
    
    static ArrayList<identity> ident = new ArrayList<identity>();
	  
    public void AddItemToList(identity id){    
        ident.add(id);
    }
    
    private String nama1;
    private String nama2;
    private String username;
    private String email;
    
   
    //membuat setter
    
    public void setN1(String N1) {
        this.nama1 = N1;
    }

    public void setN2(String N2) {
        this.nama2 = N2;
    }
    
    public void setUN(String UN) {
        this.username = UN;   
    }

    public void setEm(String Em) {
        this.email = Em;
    }
    

    //membuat getter
    public String getUN() {
        return username;
    }

    public String getN1() {
        return nama1;
    }

    public String getN2() {
        return nama2;
    }

    public String getEm() {
        return email;
    }

}
