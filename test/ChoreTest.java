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

}