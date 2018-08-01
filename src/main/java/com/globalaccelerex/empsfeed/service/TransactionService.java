package com.globalaccelerex.empsfeed.service;

import com.globalaccelerex.empsfeed.entity.Transaction;

import java.util.List;

public interface TransactionService {

    List<Transaction> getAllTransaction();

    Transaction getTransactionByTID(String de41);

}
