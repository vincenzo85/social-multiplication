package microservice.book.socialmultiplication.service.impl;



import org.springframework.beans.factory.annotation.Autowired;

import microservice.book.socialmultiplication.model.Multiplication;
import microservice.book.socialmultiplication.model.MultiplicationResultAttempt;
import microservice.book.socialmultiplication.service.MultiplicationService;
import microservice.book.socialmultiplication.service.RandomGeneratorService;

public class MultiplicationServiceImpl implements MultiplicationService {

//	public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
//		// TODO Auto-generated constructor stub
//	}

	private RandomGeneratorService rndserv;
	
	@Autowired
	public MultiplicationServiceImpl(RandomGeneratorService rnService) {
		this.rndserv = rnService;
	}
//	@Override
//	public Multiplication createRandomMultiplication() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Override
	public Multiplication createRandomMultiplication() {
		
		
		
		int factorA = rndserv.
				generateRandomFactor();
				
		int factorB = rndserv.
				generateRandomFactor();
		
		return new Multiplication(factorA, factorB);
		
	}

//	@Override
//	public boolean checkAttempt(MultiplicationResultAttempt resultAttempt) {
//		// TODO Auto-generated method stub
//		return false;
//	}
	
	@Override
	public boolean checkAttempt(final MultiplicationResultAttempt resultAttempt) {
	 return resultAttempt.getResultAttempt() ==  resultAttempt.getMultiplication().getFactorA() * resultAttempt.getMultiplication().getFactorB();
	}
	

	
}
