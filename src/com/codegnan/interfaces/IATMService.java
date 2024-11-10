package com.codegnan.interfaces;

import com.codegnan.customExceptions.InvalidAmountException;
import com.codegnan.customExceptions.InsufficientBalanceException;
import com.codegnan.customExceptions.InsufficientMachineBalanceException;
import com.codegnan.customExceptions.NotAOperatorException;

public interface IATMService {
	//to get the user type.whether the user is operator or normal user.
	public abstract String getUserType() throws NotAOperatorException;
	//to withdrawAmount
	//1. will throw InvalidAmountException if the Amount is not a valid denomination.
	//2. will throw InsufficientBalanceException if the customer has insufficient amount in her/her account.
	//3. will throw Insufficient MachineBalance Exception if the machine has Insufficient cash.
	
	public abstract double withdrawAmount(double withAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException;
	//to deposit amount
	public abstract void depositAmount(double deptAmount) throws InvalidAmountException;
	//to check balance
	
	public abstract double checkAccountBalance();
	//to change PIN number
		public abstract void changePinNumber(int pinNumber);
		
		//get PIN number
		public abstract int getPinNumber();
		
		//to get the userName
		public abstract String getUserName();
		
		//to decrease the number of chances while enter the wrong pin number.
		public abstract void decreaseChances();
		
		// to get the chances of pin number.
		public abstract int getChances();
		
		//to reset the pin number chances by bank operator.
		public abstract void resetPinChances();
			
			//to generate MINI Statement.
			public abstract void generateMiniStatement();

	}
