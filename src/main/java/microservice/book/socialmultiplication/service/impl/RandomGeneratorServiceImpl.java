package microservice.book.socialmultiplication.service.impl;

import java.util.Random;

import org.springframework.stereotype.Service;

import microservice.book.socialmultiplication.service.RandomGeneratorService;
@Service
public class RandomGeneratorServiceImpl implements RandomGeneratorService {
	final static int MINIMUM_FACTOR = 11;
	 final static int MAXIMUM_FACTOR = 99;
	@Override
	public int generateRandomFactor() {
		
		return new Random().nextInt((MAXIMUM_FACTOR - MINIMUM_FACTOR) + 1) + MINIMUM_FACTOR;

//		 return 0;
		
	}

}
