package com.immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutableTest {
	
	public static void main(String[] args) {
		Address address = new Address(1, "Bay");
		Address address1 = new Address(2, "Bay");
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address);
		addresses.add(address1);
		
		ImmutableExample immutableExample = new ImmutableExample(1, addresses);
		
		System.out.println("Before : " + immutableExample.getAddresses());
		addresses.add(new Address(3, "San Fransico"));
		
		System.out.println("After : " + immutableExample.getAddresses());
		System.out.println("Direct address : " + addresses);
		
		List<Address> newAddresses = immutableExample.getAddresses();
		newAddresses.add(new Address(4, "San Fransico"));
		
		System.out.println("After newAddresses : " + immutableExample.getAddresses());
		System.out.println("newAddresses : " + newAddresses);
		
	}

}
