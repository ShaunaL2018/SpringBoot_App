import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SingletonPlayTest {

	@Test
	void test() {
		
		SingletonPlay instance = SingletonPlay.getInstance();
		String nickName = instance.nickName;
		assertEquals("Shaun",nickName);
	}
	
	@Test
	void test2() {
		
		SingletonPlay instance = SingletonPlay.getInstance();
		assertNotNull(instance);
	}
	
	@Test
	void test3() {
		
		SingletonPlay instance = SingletonPlay.getInstance();
		SingletonPlay instance2 = SingletonPlay.getInstance();

		assertSame(instance, instance2);
	}
	
	@Test
	void test4() {
		
		SingletonPlay instance = SingletonPlay.getInstance();
		SingletonPlay instance2 = SingletonPlay.getInstance();

		assertEquals(instance.hashCode(), instance2.hashCode());
	}
	
	
	

}
