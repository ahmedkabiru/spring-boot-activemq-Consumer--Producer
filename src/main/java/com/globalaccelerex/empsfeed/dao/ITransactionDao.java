package com.globalaccelerex.empsfeed.dao;

import com.globalaccelerex.empsfeed.entity.Transaction;

import java.util.List;

public interface ITransactionDao {

    List<Transaction> getAllTransaction();

    Transaction getTransactionById(int id);

    // find  transaction by terminal id and trans_id
    Transaction getTransactionByTID(String de41 );

    // count transaction  by terminal id and transaction id
    Boolean countTransaction(String de41 , String trans_id);

    void addTransaction(Transaction transaction);

    void updateTransaction(Transaction transaction);

}
