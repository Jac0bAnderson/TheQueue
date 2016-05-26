package queue.controller;

import java.util.LinkedList;
import java.util.Queue;

import queue.model.Customer;

public class Controller 
{
private Queue<Customer> line;

	public void start()
	{
		theLine();
	}
	public void theLine()
	{
		line = new LinkedList<Customer>();
		line.add(new Customer(true, "Joe", 12.22));
		line.add(new Customer(false, "JoJo McFlyCoolMan", 3.60));
		line.add(new Customer(false, "cool man clyde", 52802.61));
		
	}
}
