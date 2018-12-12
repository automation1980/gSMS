package com.Relationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectType extends Base
	{
		String creator_name;
		int attribute_list;
		
		Scanner scan = new Scanner(System.in);
		public static int objecttypesize;
		List<ObjectType> objecttypelist= null;
		
		public ObjectType(	String name,
							int creation_date,
							int updated_date,
							String active,
							String creator_name,
							int attribute_list,	
							List<ObjectType> objectList)
			{
				super(	name, 
						creation_date, 
						updated_date, 
						active	);
				
				this.creator_name = creator_name;
				this.attribute_list = attribute_list;
				this.objecttypelist = objectList;
				
			}
		
		public void print()
		{
			
			System.out.println("NAME" + "\t\t" + "CREATION DATE" + "\t\t" + "UPDATED DATE" + "\t\t" + "ACTIVE" + "\t\t" + "CREATOR NAME" + "\t\t" + "ATTRIBUTE LIST");
			
			System.out.println( this.name + "\t\t" + this.creation_date + "\t\t\t" +  this.updated_date + "\t\t" + this.active + "\t\t\t" + this.creator_name + "\t\t\t" +  this.attribute_list);
								
		}
		
		public ObjectType  addObjectTypeAttributes() throws InterruptedException
		{
			
			ObjectType objecttypeobject1 = new ObjectType("ricky", 2010, 2011, "yes", "singh", 30,objecttypelist);
			ObjectType objecttypeobject2= new ObjectType("kulveer", 2010, 2011, "yes", "singh", 50,objecttypelist);
			ObjectType objecttypeobject3= new ObjectType("sharma", 2010, 2011, "yes", "verma", 60);
			ObjectType objecttypeobject4= new ObjectType("singh", 2010, 2011, "yes", "saini", 20);
			
			objecttypelist.add(objecttypeobject1);
			objecttypelist.add(objecttypeobject2);
			objecttypelist.add(objecttypeobject3);
			objecttypelist.add(objecttypeobject4);
			
			
			System.out.println("Please enter the number of objects you want to create in Objecttype class  :- ");
			int objectCount = scan.nextInt();
	
			for(int i=0;i<objectCount;i++)
				{
	
					System.out.println("Please enter the string name :- ");
					String name = scan.next();
	
					System.out.println("Please enter the Creation date :- ");
					int creation_date = scan.nextInt();
	
					System.out.println("Please enter the updated date :- ");
					int updated_date = scan.nextInt();
					
					System.out.println("Is the status Active :- ");
					String active = scan.next();
	
					System.out.println("Please enter the Creator name :- ");
					String creator_name = scan.next();
		 
					System.out.println("Please enter the Attribute list :- ");
					int attribute_list = scan.nextInt();
	
					ObjectType tempObject = new ObjectType(name,creation_date,updated_date,active,creator_name,attribute_list);
	
					objecttypelist.add(tempObject);
				}
		 
			objecttypesize = objecttypelist.size();
					System.out.println("The Length of the list is = " + objecttypesize);
					Thread.sleep(4000);
					System.out.println();
		 
					System.out.println("THE LIST YOU HAVE ENTERED BELOW");
					System.out.println();
		 
					System.out.println("name" + "\t\t" + "creation_date" + "\t\t" + "updated_date" + "\t\t" + "active" + "\t\t" + "creator_name" + "\t" + "attribute_list");
		 
			for(ObjectType a : objecttypelist)
				{
					System.out.println(a.name + "\t\t" + a.creation_date + "\t\t\t" + a.updated_date + "\t\t\t" + a.active + "\t\t" + a.creator_name + "\t\t" + a.attribute_list);
				}
			return objecttypeobject4;
			
											
	 	}
	
			 	
	}

