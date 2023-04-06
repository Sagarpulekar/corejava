package com.queuedemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		{
			// Creating empty priority queue
			PriorityQueue<Integer> p = new PriorityQueue<Integer>();

			// Adding items to the pQueue using add()
			p.offer(10);
			p.offer(20);
			p.offer(15);
			System.out.println(p);

		}

	}
}
