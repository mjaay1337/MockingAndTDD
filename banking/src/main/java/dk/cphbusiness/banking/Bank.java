package dk.cphbusiness.banking;

import java.util.List;

public interface Bank {
  Account getAccount(String number);
  void registerAccount(Account account);
  Customer getCustomer(String number);
  void registerCustomer(Customer customer);
  String getName();
  }
