package main.repository;

import main.config.*;
import main.model.*;

import java.sql.*;
import java.util.*;

public class BankAccountRepository {

	public void addBankAccount(BankAccount bankAccount) {
		String sql = "insert into bankaccounts values (null, ?, ?, ?, ?) ";
		try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
			statement.setString(1, bankAccount.getAccountNumber());
			statement.setDouble(2, bankAccount.getBalance());
			statement.setString(3, bankAccount.getType().toString());
			statement.setString(4, bankAccount.getCardNumber());
			statement.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public List<BankAccount> getAllBankAccounts() {
		List<BankAccount> bankAccounts = new ArrayList<>();
		String sql = "select * from bankaccounts ba";
		try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				long bankAccountId = result.getLong(1);
				String accountNumber = result.getString("accountNumber");
				double balance = result.getDouble("balance");
				BankAccountType type = BankAccountType.valueOf(result.getString("type"));
				String cardNumber = result.getString("cardNumber");
				bankAccounts.add(new BankAccount(bankAccountId, accountNumber, balance, type, cardNumber));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return bankAccounts;
	}
}
