package com;

public interface IAccount {
	boolean validatePassword(String sr);
	boolean changePassword(String oldPassword, String newPassword);
	String getAccountId();
	AccountStatus getAccountStatus();
}
