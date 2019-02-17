package microservice.book.socialmultiplication;

import java.util.Random;

import org.springframework.stereotype.Service;
@Service
public class RandoGeneratorServiceImpl implements RandomGeneratorService {
	final static int MINIMUM_FACTOR = 11;
	 final static int MAXIMUM_FACTOR = 99;
	@Override
	public int generateRandomFactor() {
		
		return new Random().nextInt((MAXIMUM_FACTOR - MINIMUM_FACTOR) + 1) + MINIMUM_FACTOR;
		
		
		
		
		
		
	}

}
