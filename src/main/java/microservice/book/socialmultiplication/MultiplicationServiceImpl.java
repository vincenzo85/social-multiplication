package microservice.book.socialmultiplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationServiceImpl implements MultiplicationSerivce{

	private RandomGeneratorService rndserv;
	
	@Autowired
	public MultiplicationServiceImpl(RandomGeneratorService rnService) {
		this.rndserv = rnService;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public Multiplication createRandomMultiplication() {
		
		
		
		int factorA = rndserv.
				generateRandomFactor();
				
		int factorB = rndserv.
				generateRandomFactor();
		
		return new Multiplication(factorA, factorB);
		
	}

}
