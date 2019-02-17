package microservice.book.socialmultiplication.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public final class MultiplicationResultAttempt {
	
	private final User user;
	private final Multiplication multiplication;
	private final int resultAttempt;
	
	
	 MultiplicationResultAttempt() {
		 user = null;
		 multiplication = null;
		 resultAttempt = -1;
		 }

}
