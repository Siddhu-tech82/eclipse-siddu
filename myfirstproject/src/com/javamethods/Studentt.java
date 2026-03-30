package com.javamethods;

public class Studentt {
	
	String name ;
	int englishmarks;
	int socailmarks;
	int sciencemarks;
	
	String branch;
	int total;
	int avg;
	
	Studentt(String name, int marks1, int marks2, int marks3,String branch){
		this.name=name;
		this.englishmarks=marks1;
		this.socailmarks=marks2;
		this.sciencemarks=marks3;
		this.branch=branch;
		
		
		
	}
	 void display() {
		
		 System.out.println("student name :" +name);
	      System.out.println("english marks : "+ englishmarks);
	      System.out.println("social marks : "+socailmarks);
	      System.out.println("science marks :"+sciencemarks);
	      System.out.println("branch : " + branch);
	     total=englishmarks+socailmarks+sciencemarks;
	     System.out.println("total marks : " + total);
	     System.out.println(total/3);
	      
	}
	

	public static void main(String[] args) {
		
   System.out.println("main method started");
   
   
      Studentt st = new Studentt("siddhu",48,56,78,"mpcs");
      st.display();
      
            
      
      
      
      
		
	}

}
