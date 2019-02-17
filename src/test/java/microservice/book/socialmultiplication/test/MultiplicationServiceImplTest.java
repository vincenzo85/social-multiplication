package microservice.book.socialmultiplication.test;

import microservice.book.socialmultiplication.RandomGeneratorService;
import microservice.book.socialmultiplication.model.Multiplication;
import microservice.book.socialmultiplication.model.MultiplicationResultAttempt;
import microservice.book.socialmultiplication.model.User;
import microservice.book.socialmultiplication.service.impl.MultiplicationServiceImpl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
public class MultiplicationServiceImplTest {
	
	private MultiplicationServiceImpl msi;
	@Mock
    private RandomGeneratorService randomGeneratorService;
	
    @Before
    public void setUp() {

        // With this call to initMocks we tell Mockito to process the annotations
        MockitoAnnotations.initMocks(this);
        msi = new MultiplicationServiceImpl(randomGeneratorService);

    }
    
    @Test
    public void createRandomMultiplicationTest() {
        // given (our mocked Random Generator service will return first 50, then 30)
        given(randomGeneratorService.generateRandomFactor()).willReturn(50, 30);
        // when
        Multiplication multiplication = msi.createRandomMultiplication();
        // then
        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
    }
	
	@Test
	public void checkCorrectAttemptTest() {
		
		 // given
		 Multiplication multiplication = new Multiplication(50, 60);
		 User user = new User("john_doe");
		 MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3000);
		 // when
		 boolean attemptResult = msi.checkAttempt(attempt);
		 // assert
		 assertThat(attemptResult).isTrue();
	}
	@Test
	public void checkWrongAttemptTest() {
	 // given
	 Multiplication multiplication = new Multiplication(50, 60);
	 User user = new User("john_doe");
	 MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3010);
	 // when
	 boolean attemptResult = msi.checkAttempt(attempt);
	 // assert
	 assertThat(attemptResult).isFalse();
	}
	
	
}
