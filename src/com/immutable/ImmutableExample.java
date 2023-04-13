package com.immutable;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableExample {
	
	private final int id;
	private final List<Address> addresses;
	
	public ImmutableExample(int id, List<Address> addresses) {
		//super();
		this.id = id;
		this.addresses = new ArrayList<Address>(addresses);
	}
	
	public int getId() {
		return id;
	}
	public List<Address> getAddresses() {
		return new ArrayList<Address>(addresses);
	}
	
	
	
	

}
