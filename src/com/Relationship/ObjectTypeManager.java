package com.Relationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectTypeManager
	{
		public static int size = 0;
		
		public static String firstname;
		public static int creation_date;
		public static int updated_date;
		public static String creator_name; 
		public static int attribute_list;
		
		public static void main(String [] args) throws InterruptedException
			{
			
			
			ObjectType ot = new ObjectType("gaurav", 2010, 2011, "sharma", 10);
			ObjectType ot1 = new ObjectType("saurav", 2011, 2012, "verma", 20);
			ObjectType ot2 = new ObjectType("kaurav", 2012, 2013, "kumar", 30);
			
			List<ObjectType> objecttypelist= new ArrayList<ObjectType>();
			
			objecttypelist.add(ot);
			objecttypelist.add(ot1);
			objecttypelist.add(ot2);
			
			
			
					
			System.out.println("WELCOME TO THE OBJECT RELATIONSHIP MODEL------->>>>>>> ");
			Thread.sleep(4000);
			System.out.println();
			System.out.println("PLEASE ENTER THE OPERATION YOU WISH :-");
			System.out.println();

			System.out.println("Press 1 READ ");
			System.out.println("Press 2 UPDATE ");
			System.out.println("Press 3 REMOVE ");
			System.out.println("Press 4 ADD ");
			
			
			
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			 switch (choose)
			 {
		        case 1:
		        	System.out.println("WOULD YOU LIKE TO READ THE OBJECTS IN THE LIST :-");
		        	
					String choose1 = scan.next();
				
					size = objecttypelist.size();
					
					System.out.println("THE SIZE OF THE LIST IS :- " + size);
					
					System.out.println("WHICH OBJECT YOU WISH TO READ :- ");
					
					
					int choose2 = scan.nextInt();
					
					switch(choose2)
						{
							case 0:
									objecttypelist.get(0).print();
							break;
												
		        			case 1:
		        					objecttypelist.get(1).print();
		        			break;
		        			
		        			case 2:
		        					objecttypelist.get(2).print();
		        			break;
						}
					break;
					
		        case 2:
		        	
		        	System.out.println("WOULD YOU LIKE TO UPDATE THE OBJECTS IN THE LIST :-");
		        	
					String choose3 = scan.next();
		        	
							size = objecttypelist.size();
							System.out.println("THE SIZE OF THE LIST IS :- " + size);
							
							System.out.println("WHICH OBJECT YOU WISH TO UPDATE :- ");
							
							
							int choose4 = scan.nextInt();
							
							switch(choose4)
							{
								case 0:
										objecttypelist.set(0, new ObjectType( "ricky", 2010, 2011, "sharma", 10));
										objecttypelist.get(0).print();
								break;
								
								case 1:
										objecttypelist.set(1, new ObjectType( "micky", 2010, 2011, "sharma", 10));
										objecttypelist.get(1).print();
								break;
								
								case 2:
										objecttypelist.set(2, new ObjectType( "chicky", 2010, 2011, "sharma", 10));
										objecttypelist.get(2).print();
								break;
							}
							
		        case 3:
		        	
		        	System.out.println("WOULD YOU LIKE TO REMOVE THE OBJECTS IN THE LIST :-");
		        	
					String choose5 = scan.next();
					
					size = objecttypelist.size();
					System.out.println("THE SIZE OF THE LIST IS :- " + size);
		        	
					System.out.println("WHICH OBJECT YOU WISH TO REMOVE :- ");
					
					
					int choose6 = scan.nextInt();
					
					switch(choose6)
					{
						case 0:
								objecttypelist.remove(0);
								for(ObjectType a : objecttypelist ) 
								{
									a.print();
								}
								
						break;
						
						case 1:
								objecttypelist.remove(1);
								
						break;
						
						case 2:
								objecttypelist.remove(2);
								
						break;
					}
					
		        case 4:
		        			        	
		        	System.out.println("WOULD YOU LIKE TO ADD THE OBJECTS IN THE LIST :-");
		        	
					String choose7 = scan.next();
					
					System.out.println("Please enter the number of Student Object you want to create :- ");
					int objectCount = scan.nextInt();
					
					
					
					 for(int i=0;i<objectCount;i++)
		        	 	{
					
						 System.out.println("Please enter the string name :- ");
						 String name = scan.next();
					
						 System.out.println("Please enter the Creation date :- ");
						 int creation_date = scan.nextInt();
					
						 System.out.println("Please enter the updated date :- ");
						 int updated_date = scan.nextInt();
					
						 System.out.println("Please enter the Creator name :- ");
						 String creator_name = scan.next();
						 
						 System.out.println("Please enter the Attribute list :- ");
						 int attribute_list = scan.nextInt();
					
						 ObjectType tempObject = new ObjectType(name,creation_date,updated_date,creator_name,attribute_list);
					
						 objecttypelist.add(tempObject);
															
		        	 	}
					 	
					 break;
					
			 }
			 
			 scan.close();
			 
		}
		
	}
					
		        	
		        	
			
		
				
			

		
		