package microservice.book.socialmultiplication;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Before;
import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class RandomGeneratorServiceTest {

	private RandomGeneratorService rndService;
	
	@Before
	 public void setUp() {
		rndService = new RandoGeneratorServiceImpl();
		
	
	 }
	
	@Test
	public void generateRandomFactorIsBeetweenExpetcetedLimitis() {
		List<Integer> randomFactors = IntStream.range(0, 1000)
				 .map(i -> this.rndService.
				generateRandomFactor())
				 .boxed().collect(Collectors.toList());
		
		
		assertThat(randomFactors).containsOnlyElementsOf
		(IntStream.range(11, 100)
		 .boxed().collect(Collectors.toList()));
	}
	
	
}
