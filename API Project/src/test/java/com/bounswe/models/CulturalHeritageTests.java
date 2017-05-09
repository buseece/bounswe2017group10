import com.bounswe.models.Greeting;
import com.bounswe.models.User;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CulturalHeritageTests{
	

  @Test
  public void getId_whenInvokedByInstanceCreation_thenGetID() {

    // Given
    long nIteration = 1;
    long nMaxNumberOfIteration = 100;
    User user1 = new User("name","surname");
    try
    {
      //Then
      while(nIteration < nMaxNumberOfIteration){
          CulturalHeritage nCulturalHeritage = new CulturalHeritage(user1,"title", "description", "continent", "city");
          assertThat(nCulturalHeritage.getId()).isEqualTo(nIteration);
          nIteration++;
      }
    }
    catch(Exception e)
    {
      assertTrue("Exception caught",false);
    }
  }
  
  public void setId_whenInvokedByInstanceCreation_thenSetID(long id) {
	// Given
	    long nIteration = 1;
	    long nMaxNumberOfIteration = 100;
	    User user1 = new User("name","surname");
	    try
	    {
	      //Then
	      while(nIteration < nMaxNumberOfIteration){
	          CulturalHeritage nCulturalHeritage = new CulturalHeritage(user1,"title", "description", "continent", "city");
	          nCulturalHeritage.setId(id);
	          long nCulturalHeritageID = nCulturalHeritage.getId();
	          assertThat(nCulturalHeritageID).isEqualTo(id);
	          nIteration++;
	      }
	    }
	    catch(Exception e)
	    {
	      assertTrue("Exception caught",false);
	    }
	  }

  
  
  public void getOwner_whenInvokedByInstanceCreation_thenGetOwner() {
        // Given
        User user1 = new User("name","surname");
        try
        {
        	  CulturalHeritage nCulturalHeritage = new CulturalHeritage(user1,"title", "description", "continent", "city");
            assertThat(nCulturalHeritage.getOwner()).isEqualTo(user1);
    
        }
        catch(Exception e)
        {
          assertTrue("Exception caught",false);
        }
  }
  
  public void setOwner_whenInvokedByInstanceCreation_thenSetOwner() {
	  // Given
      User user1 = new User("name","surname");
      User user2 = new User("name1","surname1");
      
      try
      {
      	  CulturalHeritage nCulturalHeritage = new CulturalHeritage(user1,"title", "description", "continent", "city");
      	  nCulturalHeritage.setId(user2);
          assertThat(nCulturalHeritage.getOwner()).isEqualTo(user2);
  
      }
      catch(Exception e)
      {
        assertTrue("Exception caught",false);
      }
	  
}
  public void getTitle_whenInvokedByInstanceCreation_thenGetTitle() {
      // Given
      User user1 = new User("name","surname");
      try
      {
        
      	  CulturalHeritage nCulturalHeritage = new CulturalHeritage(user1,"title", "description", "continent", "city");
          assertThat(nCulturalHeritage.getTitle()).isEqualTo("title");
     
      }
      catch(Exception e)
      {
        assertTrue("Exception caught",false);
      }
}
  public void setTitle_whenInvokedByInstanceCreation_thenSetTitle() {
      // Given
      User user1 = new User("name","surname");
      try
      {
        
      	  CulturalHeritage nCulturalHeritage = new CulturalHeritage(user1,"title", "description", "continent", "city");
      	nCulturalHeritage.setTitle("title2");
          assertThat(nCulturalHeritage.getTitle()).isEqualTo("title2");
     
      }
      catch(Exception e)
      {
        assertTrue("Exception caught",false);
      }
}
  public void getDescription_whenInvokedByInstanceCreation_thenGetDescription() {
      // Given
      User user1 = new User("name","surname");
      try
      {
    
      	  CulturalHeritage nCulturalHeritage = new CulturalHeritage(user1,"title", "description", "continent", "city");
          assertThat(nCulturalHeritage.getDescription()).isEqualTo("description");
        }
      catch(Exception e)
      {
        assertTrue("Exception caught",false);
      }
}
  public void setDescription_whenInvokedByInstanceCreation_thenSetDescription() {
      // Given
      User user1 = new User("name","surname");
      try
      {
    
      	  CulturalHeritage nCulturalHeritage = new CulturalHeritage(user1,"title", "description", "continent", "city");
      	  nCulturalHeritage.setDescription("description2");
          assertThat(nCulturalHeritage.getDescription()).isEqualTo("description2");
        }
      catch(Exception e)
      {
        assertTrue("Exception caught",false);
      }
}
  public void getContinent_whenInvokedByInstanceCreation_thenGetContinent() {
      // Given
      User user1 = new User("name","surname");
      try
      {
        
      	  CulturalHeritage nCulturalHeritage = new CulturalHeritage(user1,"title", "description", "continent", "city");
          assertThat(nCulturalHeritage.getContinent()).isEqualTo("continent");
      }
      catch(Exception e)
      {
        assertTrue("Exception caught",false);
      }
}
  public void setContinent_whenInvokedByInstanceCreation_thenSetContinent() {
	  // Given
      User user1 = new User("name","surname");
      try
      {
        
      	  CulturalHeritage nCulturalHeritage = new CulturalHeritage(user1,"title", "description", "continent", "city");
      	nCulturalHeritage.setContinent("continent2");
          assertThat(nCulturalHeritage.getContinent()).isEqualTo("continent2");
      }
      catch(Exception e)
      {
        assertTrue("Exception caught",false);
      }
}
  public void getCity_whenInvokedByInstanceCreation_thenGetCity() {
      // Given
      User user1 = new User("name","surname");
      try
      {
        
      	  CulturalHeritage nCulturalHeritage = new CulturalHeritage(user1,"title", "description", "continent", "city");
          assertThat(nCulturalHeritage.getCity()).isEqualTo("city");

      }
      catch(Exception e)
      {
        assertTrue("Exception caught",false);
      }
}
  public void setCity_whenInvokedByInstanceCreation_thenSetCity() {
      // Given
	  User user1 = new User("name","surname");
      try
      {
        
      	  CulturalHeritage nCulturalHeritage = new CulturalHeritage(user1,"title", "description", "continent", "city");
      	nCulturalHeritage.setCity("city2");
          assertThat(nCulturalHeritage.getCity()).isEqualTo("city2");

      }
      catch(Exception e)
      {
        assertTrue("Exception caught",false);
      }
  }
}
 

