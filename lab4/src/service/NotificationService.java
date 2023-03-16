package service;
import java.util.ArrayList;
import java.util.List;

import model.*;
import model.accounts.Account;
import model.accounts.Account2;

public class NotificationService {

	List<Account> accountList = new ArrayList<>();
	List<Account2> accountList2 = new ArrayList<>();

	public void sendNotification(Notification notification) {
		System.out.println("Notification <" + notification.getMessage() + "> successfully sent to " +
				notification.getOfficeManager().getEmail());
	}

	public void compareToFindSameAccountList() { // the list should be already populated here
		for (int i = 0; i < accountList.size() - 1; i++) {
			for (int j = i + 1; j < accountList.size(); j++) {
				//TODO aux modify position -- for sorting
				if (accountList.get(i).compareTo(accountList.get(j)) == 0) {
					System.out.println("same value");
				}
			}
		}
	}

	public void sortAccountList2() { //the list should be already populated here
		Account2 account2 = new Account2();
		account2.setBalance(10);
		for (Account2 account: accountList2) {
			int result = account2.compare(account, account2);
			System.out.println("The result is " + result);
		}
	}
}
