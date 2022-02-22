package pack1;

 class proaccessspecifiers {
	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

//create another package
  package pack2;

import pack1.*;

class accessSpecifiers3 extends proaccessspecifiers {

	public static void main(String[] args) {
		accessSpecifiers3 obj = new accessSpecifiers3 ();   
	       obj.display();  
	}


}
