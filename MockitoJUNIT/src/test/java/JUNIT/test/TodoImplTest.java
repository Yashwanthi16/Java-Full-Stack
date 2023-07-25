package JUNIT.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.*;
import org.junit.Test;


public class TodoImplTest {
	 
	@Test
	public void testMethod() {
		
		TodoService tds = mock(TodoService.class);
		
		List<String> todos = Arrays.asList("Capgemini SpringBoot","Amazon SpringBoot","yashwanthi");
		List<String> filteredTodos = Arrays.asList("Capgemini SpringBoot","Amazon SpringBoot");
		
		when(tds.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl tdbi = new TodoBusinessImpl(tds);
				
		assertEquals(filteredTodos,tdbi.retrieveTodosRelatedToSpring("Dummy"));
				
		}

}
