package com.mediasol.loadtransactions.config;

public final class AccountStatus {
	
	private static final AccountStatus INSTANCE = new AccountStatus();
	public boolean firstAccount = true;

    private AccountStatus() {}

    public static AccountStatus getInstance() {
        return INSTANCE;
    }

}