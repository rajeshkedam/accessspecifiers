package package1;

public class proaccessspecifiers {
	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

//create another package
package package2;

import pack1.*;

public class accessSpecifiers3 extends proaccessspecifiers {

	public static void main(String[] args) {
		accessSpecifiers3 obj = new accessSpecifiers3 ();   
	       obj.display();  
	}

}
