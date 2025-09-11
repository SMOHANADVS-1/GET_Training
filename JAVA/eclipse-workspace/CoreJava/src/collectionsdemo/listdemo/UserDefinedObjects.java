package collectionsdemo.listdemo;

import java.util.ArrayList;
import java.util.List;

//Program to store user defined Objects in collections

public class UserDefinedObjects {

	public static void main(String[] args) {
		//Creating Books  object & initialized using Book Constructor
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

		//create a List of Books
		List<Book> bList = new ArrayList<>();
		
		//add books to list
		bList.add(b1);
		bList.add(b2);
		bList.add(b3);
		
		//Traverse a List
		System.out.println("************ Book List *****************");
		for (Book i : bList) {
			System.out.println(i.getId()+" "+i.getName()+" "+i.getAuthor()+" "+i.getPublisher()+" "+i.getQuantity());
		}
		System.out.println("Total No.Of Books : "+bList.size());
	}

}
