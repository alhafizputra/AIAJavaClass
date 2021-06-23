package com.aia.java.day5;

public class StringBufferExample {
	public static void main(String[] args) {
		//append()
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");
		System.out.println(sb);
		
		//insert()
		StringBuffer sb2 = new StringBuffer("Hello ");
		sb2.insert(1, "Java");
		System.out.println(sb2);
		
		//replace
		StringBuffer sb3 = new StringBuffer("Hello");
		sb3.replace(1, 3, "Java");
		System.out.println(sb3);
		
		//delete
		StringBuffer sb4=new StringBuffer("Hello");  
		sb4.delete(1,3);  
		System.out.println(sb4);//prints Hlo
		
		//reverse
		StringBuffer sb5=new StringBuffer("Hello");  
		sb5.reverse();
		System.out.println(sb5);//prints olleH
		
		//capacity
		StringBuffer sb6=new StringBuffer();  
		System.out.println(sb6.capacity());//default 16  
		sb6.append("java is my favourite language");  
		System.out.println(sb6.capacity());//now 16  
		sb6.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
		
		//ensureCapacity
		StringBuffer sb7=new StringBuffer();  
		System.out.println(sb7.capacity());//default 16  
		sb7.append("Hello");  
		System.out.println(sb7.capacity());//now 16  
		sb7.append("java is my favourite language");  
		System.out.println(sb7.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb7.ensureCapacity(10);//now no change  
		System.out.println(sb7.capacity());//now 34  
		sb7.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb7.capacity());//now 70  
	}
}
