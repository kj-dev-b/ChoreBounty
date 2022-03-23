import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ChoreTest {

    @Test
    void choreIsCreatedWithVariables() {
        Chore testChore = new Chore();
        testChore.setChoreName("test chore");
        testChore.setABounty(0.0);
        testChore.setTimeWindow("2022-03-22", "2022-03-30");
        assertEquals(testChore.getChoreName(), "test chore");
        assertEquals(testChore.getABounty(), 0.0);
        assertEquals(testChore.getTimeWindow(), "Tue Mar 22 00:00:00 PDT 2022 - Wed Mar 30 00:00:00 PDT 2022");
    }
    @Test 
    void testChoredDescriptionAndResource() {
    	Chore testChore1 = new Chore();
    	testChore1.setBountyResource("beers");
    	testChore1.setChoreDescription("Wash the goddam dishes");
    	assertEquals(testChore1.getBountyResource(), "beers");
    	assertEquals(testChore1.getChoreDescription(), "Wash the goddam dishes");
    }
    @Test
    void testUserName() {
    	User testUser = new User();
    	testUser.setUserName("Nathan");
    	assertEquals("Nathan", testUser.getUserName());
    }
}