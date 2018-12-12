package com.Relationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Attribute extends Base
	{
	
		String creation_name;
		int validation_list;
		
		Scanner scan = new Scanner(System.in);
		List<Attribute> attributelist= new ArrayList<Attribute>();
		public static int attributesize;
		
		public Attribute(String name, int creation_date, int updated_date, String active,String creation_name,int validation_list )
			{
				super(name, creation_date, updated_date, active);
				this.creation_name = creation_name;
				this.validation_list = validation_list;
				
			}
		
		public void print()
		{
			
			System.out.println("NAME" + "\t\t" + "CREATION DATE" + "\t\t" + "UPDATED DATE" + "\t\t" + "CREATION NAME" + "\t\t" + "VALIDATION LIST");
			
			System.out.println( this.name + "\t\t" + this.creation_date + "\t\t\t" +  this.updated_date  + "\t\t\t" + this.creation_name + "\t\t\t" +  this.validation_list);
								
		}
		
		
		public void addObjectOfAttributes() throws InterruptedException
		{
			Attribute attributeobject = new Attribute("saurav", 2010, 2011, "yes", "verma", 10);
			Attribute attributeobject1 = new Attribute("saurav", 2010, 2011, "yes", "verma", 10);
			Attribute attributeobject2 = new Attribute("saurav", 2010, 2011, "yes", "verma", 10);
			Attribute attributeobject3 = new Attribute("saurav", 2010, 2011, "yes", "verma", 10);
			Attribute attributeobject4 = new Attribute("saurav", 2010, 2011, "yes", "verma", 10);
			
			attributelist.add(attributeobject1);
			attributelist.add(attributeobject2);
			attributelist.add(attributeobject3);
			attributelist.add(attributeobject4);
			
			System.out.println("Please enter the number of objects you want to create in Objecttype class  :- ");
			int objectCount = scan.nextInt();
	
			for(int i=0;i<objectCount;i++)
				{
	
					System.out.println("Please enter the String name :- ");
					String name = scan.next();
	
					System.out.println("Please enter the Creation date :- ");
					int creation_date = scan.nextInt();
	
					System.out.println("Please enter the Updated date :- ");
					int updated_date = scan.nextInt();
					
					System.out.println("Is the status Active :- ");
					String active = scan.next();
	
					System.out.println("Please enter the Creation name :- ");
					String creation_name = scan.next();
		 
					System.out.println("Please enter the Validation list :- ");
					int validation_list = scan.nextInt();
					
					Attribute attributeTempObject = new Attribute(name,creation_date,updated_date,active,creation_name, validation_list);
					
					attributelist.add(attributeTempObject);
		
				}
			
			attributesize = attributelist.size();
			System.out.println("The Length of the list is = " + attributesize);
			Thread.sleep(4000);
			System.out.println();
 
			System.out.println("THE LIST YOU HAVE ENTERED BELOW");
			System.out.println();
 
			System.out.println("name" + "\t\t" + "creation_date" + "\t\t" + "updated_date" + "\t\t" + "Active" + "\t\t" + "creation_name" + "\t" + "validation_list");
 
			for(Attribute a : attributelist)
				{
					System.out.println(a.name + "\t\t" + a.creation_date + "\t\t\t" + a.updated_date + "\t\t" + "Active" + "\t\t"  + a.creation_name + "\t\t" + a.validation_list);
				}
			
			
			}
	}
