package model.accounts;

public class Account implements Comparable<Account> {
	int balance;

	@Override
	public int compareTo(Account account2) {
		return (this.balance > account2.balance ? 1 : 0);
	}
}
