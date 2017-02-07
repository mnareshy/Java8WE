package com.java8.fp.we;


// to be corrected
import com.java8.fp.we.FunctionalInterfaceTest.Alert;
import com.java8.fp.we.FunctionalInterfaceTest.Banking;

public class FunctionalInterfaceTest {
	public static void main(String[] args) {
		FunctionalInterfaceTest fiTest = new FunctionalInterfaceTest();
		Banking deposit = (balance, optMoney) -> {
			return (long) (balance + optMoney);
		};
		Banking withdraw = (balance, optMoney) -> {
			return (long) (balance - optMoney);
		};
		System.out.println(fiTest.bankOps(10000, 2000, deposit));
		System.out.println(fiTest.bankOps(10000, 2000, withdraw));
		Alert alert = (message) -> {
			System.out.println(message);
		};
		fiTest.alertMsg("hey youare done with banking", alert);
		alert.alertMessage("hey youare done with banking");
	}

	public long bankOps(int balance, int optMoney, Banking operation) {
		return operation.perform(balance, optMoney);
	}

	public void alertMsg(String message, Alert alert) {
		alert.alertMessage(message);
	}
}