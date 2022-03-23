import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Chore;
import main.User;

class ChoreTest {

    @Test
    void choreIsCreatedWithVariables() {
        Chore testChore = new Chore();
        testChore.setChoreName("test chore");
        testChore.setABounty(0.0);
        testChore.setTimeWindow("2022-03-22", "2022-03-30");
        assertEquals("test chore", testChore.getChoreName());
        assertEquals(0.0, testChore.getABounty());
        assertEquals("Tue Mar 22 00:00:00 PDT 2022 - Wed Mar 30 00:00:00 PDT 2022", testChore.getTimeWindow());
    }

    @Test 
    void testChoredDescriptionAndResource() {
    	Chore testChore1 = new Chore();
    	testChore1.setBountyResource("beers");
    	testChore1.setChoreDescription("Wash the goddam dishes");
    	assertEquals("beers", testChore1.getBountyResource());
    	assertEquals("Wash the goddam dishes", testChore1.getChoreDescription());
    }

    @Test
    void testUserName() {
    	User testUser = new User();
    	testUser.setUserName("Nathan");
    	assertEquals("Nathan", testUser.getUserName());
    }

}