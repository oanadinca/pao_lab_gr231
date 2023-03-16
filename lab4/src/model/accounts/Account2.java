package model.accounts;

import java.util.Comparator;

public class Account2 implements Comparator<Account2> {
	int balance;

	public void setBalance(int value) {
		this.balance = value;
	}

	@Override
	public int compare(Account2 o1, Account2 o2) {
		return (o1.balance > o2.balance ? 1 : -1);
	}
}
