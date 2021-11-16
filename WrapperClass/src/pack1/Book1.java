package pack1;

import java.util.Scanner;

public class Book1 {
	 String title;
	 Integer bid;
	 Integer pageNo;
	 Book1(){}
	 Book1(Object title,Object bid) {
		 this.title=(String)title;
		 this.bid=(Integer)bid;		    
	 }
		   public void setPageNo(int pageNo){
		   	this.pageNo=pageNo;
		   }
		   public String getPageNo(){
		   	return "you left at pageNo "+this.pageNo;
		   }
		   public static void main(String[] args) {
		   	Book b=new Book("Death Note",101);
		   	Scanner s=new Scanner(System.in);
		   	System.out.println("type page no. to mark ");
		   	b.setPageNo(s.nextInt());
		   	System.out.println(b.getPageNo());
//		   	int i=10;
//		   	Integer j=10;
//		   	System.out.println(i+j);
	}	  
}
