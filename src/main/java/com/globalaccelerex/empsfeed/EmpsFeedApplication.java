package com.globalaccelerex.empsfeed;


import com.globalaccelerex.empsfeed.entity.Transaction;
import com.globalaccelerex.empsfeed.jms.producer.JmsProducer;
import com.globalaccelerex.empsfeed.model.Email;
import com.globalaccelerex.empsfeed.service.TransactionService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpsFeedApplication implements CommandLineRunner {


	@Autowired
	JmsProducer producer;

	@Autowired
	TransactionService transactionService;

	final Logger LOG = LoggerFactory.getLogger(EmpsFeedApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EmpsFeedApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		System.out.println("Transaction List"+transactionService.getAllTransaction());
		System.out.println("Transaction List"+transactionService.getTransactionByTID("2070AL30"));

	}
}
