package br.edu.movile.queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import br.edu.movile.queue.QueueInteger;

public class QueueIntegerTest 
{
	private QueueInteger queueInteger = new QueueInteger();

	@Before
	public void initQueue() 
	{
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());

		int listSize = random.nextInt(100);
		for (int i = 0; i < listSize; i++) 
		{
			Integer randomValue = random.nextInt(256);
			queueInteger.pushIntoTheStack(randomValue);
		}
	}

	@Test
	public void executePopTest() 
	{
		List<Integer> minimumList = queueInteger.getMinimumList();
		List<Integer> queueList = queueInteger.getQueueList();
		
		int queueListSize = queueList.size();
		
		for (int i = 0; i < queueListSize; i++)
		{
			System.out.println("---- QueueList ----");
			printList(queueList);
			
			System.out.println("---- MinimumList ----");
			printList(minimumList);
			
			System.out.println("-- Executing Pop --");
			queueInteger.popFromTheStack();
		}		
		
		assertEquals(0, queueList.size());		
	}

	@Test
	public void getMinimumValueWithOnotation1() 
	{	
		System.out.println("---- QueueList ----");
		printList(queueInteger.getQueueList());
		
		System.out.println("---- MinimumList ----");
		printList(queueInteger.getMinimumList());
		
		Integer minimumValue = queueInteger.getMinimumValue();
		
		System.out.println("Minimum Value: " + minimumValue);
		
		assertNotNull(minimumValue);		
	}
	
	public void printList(List<Integer> listToPrintElements) 
	{
		listToPrintElements.stream().forEach(System.out::println);
	}

}
