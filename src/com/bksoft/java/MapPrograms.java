package com.bksoft.java;

import java.util.HashMap;
import java.util.Map;

public class MapPrograms {

	public static void main(String[] args) {
		Map<Integer, String> orders = new HashMap<Integer, String>();

		orders.put(34, "orange");
		orders.put(566, "apple");

		System.out.print(orders);

		Map<Integer, String> ordersWithCap = new HashMap<Integer, String>(20);

		ordersWithCap.put(55, "S mobile");

		HashMap<Integer, String> newOrders = new HashMap<Integer, String>(orders);

		System.out.println();
		System.out.println(newOrders);

		for (Map.Entry<Integer, String> e : orders.entrySet()) {
			System.out.println(e);
		}

	}

}
