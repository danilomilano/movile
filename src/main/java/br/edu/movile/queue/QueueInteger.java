package br.edu.movile.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QueueInteger 
{
	private List<Integer> queueList = new LinkedList<Integer>();
	
	private List<Integer> minimumList = new ArrayList<Integer>();
	
	public void pushIntoTheStack(Integer valueToBeInserted) 
	{
		queueList.add(valueToBeInserted);
		
		if (minimumList.isEmpty())
		{
			minimumList.add(valueToBeInserted);
		}
		else if (valueToBeInserted < minimumList.get(0))
		{
			minimumList.add(0, valueToBeInserted); 
		}
	}
	
	public void popFromTheStack() 
	{
		Integer valueToBeRemoved = queueList.get(queueList.size()-1);
		queueList.remove(queueList.size()-1);
	
		if (minimumList.get(0).equals(valueToBeRemoved))
		{
			minimumList.remove(0);
		}
	}

	public List<Integer> getQueueList() {
		return queueList;
	}

	public List<Integer> getMinimumList() {
		return minimumList;
	}
	
	public Integer getMinimumValue() {
		return minimumList.get(0);
	}
}
