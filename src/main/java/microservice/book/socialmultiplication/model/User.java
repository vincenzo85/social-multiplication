package microservice.book.socialmultiplication.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@Setter

public final class User {

	private final String alias;
	
	protected User() {
		
		 alias = null;
	}
	
}
