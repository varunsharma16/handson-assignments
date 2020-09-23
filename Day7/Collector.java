package org.hsbc.item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Collector 
{




		public static void main(String[] args) {
			
			List<Item> list= new ArrayList<Item>();
			list.add(new Item(1,"aman",50,7));
			list.add(new Item(1,"aman",100,8));
			list.add(new Item(3,"vinay",150,8));
			list.add(new Item(4,"sagar",200,9));
			list.add(new Item(5,"varun",250,10));
			//display(list);
			System.out.println("-------- Before Sorting--------------------");
			Iterator<Item> iterator=list.iterator();
			for(Item item:list) {
				System.out.println(item);
			}
			Outer outer=new Outer();
			Collections.sort(list,outer.new Inner1());
			System.out.println("-------Ascending Order  sorting By Item Id--------------------");
			for(Item item:list) {
				System.out.println(item);
			}
			Collections.sort(list,outer.new Inner2());
			System.out.println("-------- Descending  Order sorting  By Item Id--------------------");
			for(Item item:list) {
				System.out.println(item);
			}
			Collections.sort(list,outer.new Inner3());
			System.out.println("-------- Ascending  Order sorting  By Name--------------------");
			for(Item item:list) {
				System.out.println(item);
			}
			Collections.sort(list,outer.new Inner4());
			System.out.println("-------- Descending Order sorting  By Name--------------------");
			for(Item item:list) {
				System.out.println(item);
			}
			Collections.sort(list,outer.new Inner5());
			System.out.println("-------- Ascending Order sorting  By Price--------------------");
			for(Item item:list) {
				System.out.println(item);
			}
			Collections.sort(list,outer.new Inner6());
			System.out.println("-------- Descending Order sorting  By Price--------------------");
			for(Item item:list) {
				System.out.println(item);
			}
			Collections.sort(list,outer.new Inner7());
			System.out.println("-------- Ascending Order sorting  By Rating--------------------");
			for(Item item:list) {
				System.out.println(item);
			}
			Collections.sort(list,outer.new Inner8());
			System.out.println("-------- Descending Order sorting  By Rating--------------------");
			for(Item item:list) {
				System.out.println(item);
			}

}
		
		

	/*	public static void display(List<Item> list)
		{

	        Iterator<Item> it=list.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		}*/
}
