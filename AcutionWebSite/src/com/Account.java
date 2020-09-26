package com;

public class Account implements IAccount{
	String accountId;
	String accountPassword;
	AccountStatus accountStatus;
	@Override
	public boolean validatePassword(String sr) {
		return accountId.equals(sr);
	}

	@Override
	public boolean changePassword(String oldPassword, String newPassword) {
		if(oldPassword.equals(accountPassword)) {
			accountPassword = newPassword;
			return true;
		}
		return false;
	}

	@Override
	public String getAccountId() {
		return accountId;
	}

	@Override
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

}
