package main.service;

import main.model.*;
import main.repository.*;

import java.util.*;

public class BankAccountService {
	private BankAccountRepository bankAccountRepository;

	public BankAccountService() {
		this.bankAccountRepository = new BankAccountRepository();
	}

	public void addBankAccount(BankAccount bankAccount) {
		bankAccountRepository.addBankAccount(bankAccount);
	}

	public List<BankAccount> getAllBankAccounts() {
		return bankAccountRepository.getAllBankAccounts();
	}
}
