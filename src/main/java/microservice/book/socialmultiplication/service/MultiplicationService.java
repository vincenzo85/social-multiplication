package microservice.book.socialmultiplication.service;

import microservice.book.socialmultiplication.model.Multiplication;
import microservice.book.socialmultiplication.model.MultiplicationResultAttempt;

public interface MultiplicationService {
	
	Multiplication createRandomMultiplication();
	boolean checkAttempt(final MultiplicationResultAttempt
			resultAttempt);
}
