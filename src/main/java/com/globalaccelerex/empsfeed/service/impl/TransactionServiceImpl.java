package com.globalaccelerex.empsfeed.service.impl;

import com.globalaccelerex.empsfeed.dao.TransactionDao;
import com.globalaccelerex.empsfeed.entity.Transaction;
import com.globalaccelerex.empsfeed.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionDao transactionDao;

    @Override
    public List<Transaction> getAllTransaction() {
        return transactionDao.getAllTransaction();
    }

    @Override
    public Transaction getTransactionByTID(String de41) {
        return transactionDao.getTransactionByTID(de41);
    }

    @Override
    public Boolean checkIfTransactionExist(String de41, String trans_id) {
        return transactionDao.checkIfTransactionExist(de41,trans_id);
    }
}
