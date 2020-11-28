package com.progrank.security.repo;


import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ReceiptManager {

	private Set<String> receiptNoList;

	public ReceiptManager() {
		receiptNoList = new HashSet<>();
	}
	
	public void add(String receipt) {
		receiptNoList.add(receipt);
	}

	public boolean contains(String receipt) {
		return receiptNoList.contains(receipt);
	}

}
