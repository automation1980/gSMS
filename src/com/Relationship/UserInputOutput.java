package com.Relationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputOutput 
	{
	public static int size ;
		
		public void mainHeader() throws InterruptedException
		{
			//Reference 
			List<ObjectType> objectList = new ArrayList<ObjectType>();
			
			ObjectType objecttypemainobject = new ObjectType(null, 0, 0, null, null, 0,objectList);
			
			
			Attribute attributemainobject = new Attribute(null, 0, 0, null, null, 0);
			
				
			System.out.println("WELCOME TO THE OBJECT RELATIONSHIP MODEL------->>>>>>> ");
			Thread.sleep(4000);
			System.out.println();
					
			System.out.println("WHICH PAGE WOULD YOULIKE TO OPEN-------->>>>>>>> ");
			System.out.println();
			Thread.sleep(4000);
			
			System.out.println("Press 1 for ObjectType Class");
			System.out.println("Press 2 for Attribute Class");
					
			Scanner scan = new Scanner(System.in);
			int classchoice = scan.nextInt();
			
			switch (classchoice = 1)
				{
					case 1:
							System.out.println("PLEASE ENTER THE OPERATION YOU WISH :-");
							System.out.println();


							System.out.println("Press 1 ADD ");
							System.out.println("Press 2 UPDATE ");
							System.out.println("Press 3 REMOVE ");
							System.out.println("Press 4 READ ");
							int operationInput = scan.nextInt();
			
					switch (operationInput)
						{
							case 1:
		        	
								System.out.println("WOULD YOU LIKE TO ADD THE OBJECTS IN THE OBJECTTYPELIST :-");
								String addInput = scan.next();   	
								objecttypemainobject.addObjectTypeAttributes();
				        	
							break;
							
														
							case 2:
								
								System.out.println("WOULD YOU LIKE TO UPDATE THE OBJECTS IN THE LIST :-");
					        	String updateInput = scan.next();
					        	
					        	
					        	System.out.println("The size of the list is :- " + objecttypemainobject.objecttypelist.size());
					        	
					        	System.out.println("WHICH OBJECT YOU WISH TO UPDATE :- ");
					        	int updateInput1 = scan.nextInt();
					        	
					        	switch(updateInput1)
								{
									case 0:
										
										objecttypemainobject.objecttypelist.set(0, new ObjectType( "shanky", 2020, 2011, "no", "sumit", 10,this.));
										objecttypemainobject.objecttypelist.get(0).print();
									
									break;
									
								}
					        	
					        break;
					        	
							case 3:
								
								System.out.println("WOULD YOU LIKE TO REMOVE THE OBJECTS IN THE LIST :-");
					        	
								String removeInput = scan.next();
								System.out.println("The size of the list is :- " + objecttypemainobject.objecttypelist.size());
								
								System.out.println("WHICH OBJECT YOU WISH TO REMOVE :- ");
								int removeInput1 = scan.nextInt();
								
								
								switch(removeInput1)
								{
									case 0:
										
										objecttypemainobject.objecttypelist.remove(0);
										
										for(ObjectType a : objecttypemainobject.objecttypelist  ) 
										{
											a.print();
										}
										
									break;
									
								}
								
							break;
							
							case 4:
								
								System.out.println("WOULD YOU LIKE TO READ THE OBJECTS IN THE LIST :-");
					        	
								String readInput = scan.next();
								
								System.out.println("The size of the list is :- " + objecttypemainobject.objecttypelist.size());
					        	
					        	System.out.println("WHICH OBJECT YOU WISH TO READ :- ");
					        	int readInput1 = scan.nextInt();
					        	
					        	switch(readInput1)
								{
									case 0:
									
										objecttypemainobject.objecttypelist.get(0).print();
										
									break;
									
								}
										
								
							
							
										
										
								
										
										
										
								
								
		        	 
						}
					
							
				}
		
		
		}
	
	}	
		
	/*
	 * case 2:
							System.out.println("PLEASE ENTER THE OPERATION YOU WISH :-");
							System.out.println();


							System.out.println("Press 1 ADD ");
							System.out.println("Press 2 UPDATE ");
							System.out.println("Press 3 REMOVE ");
							System.out.println("Press 4 READ ");
						
							int operationInput2 = scan.nextInt();
							switch (operationInput2)
							{
								case 1:
			        	
									System.out.println("WOULD YOU LIKE TO ADD THE OBJECTS IN THE ATTRIBUTELIST :-");
									String addInput1 = scan.next();
									attributemainobject.addObjectOfAttributes();
								
								break;
			        	 
							}
	 * 
	 * 
	 * 
	 * 
	 * 
	 */	
	