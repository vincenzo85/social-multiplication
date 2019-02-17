package microservice.book.socialmultiplication;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest

public class MultiplicationServiceTest {
	

	@MockBean
	 private RandomGeneratorService randomGeneratorService;
	
	@Autowired
	 private MultiplicationService multiplicationService;
	 @Test
	 public void createRandomMultiplicationTest() {
	 /* given (our mocked Random Generator service wil
	return first 50, then 30)*/
		 
		 given(randomGeneratorService.generateRandomFactor()).willReturn(50,30);
		 
	Multiplication mu =	 multiplicationService.createRandomMultiplication();
	 // when
	  // then
	
	assertThat(mu.getFactorA()).isEqualTo(50);
	assertThat(mu.getFactorB()).isEqualTo(30);
	assertThat(mu.getResult()).isEqualTo(1500);
	
	
	
	
	
	 }
}
