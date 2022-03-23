package main;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import db.Database;
import db.Chores;

@ExtendWith(MockitoExtension.class)                         
class DatabaseTest {

    @Mock
    Database databaseMock;
    
    @Test
    public void testChores()  {
        assertNotNull(databaseMock);
        when(databaseMock.getAllChores()).thenReturn(MockData.mockChoreList);
        when(databaseMock.getChoresForUser("test")).thenReturn(MockData.mockChoreListSmall);
        
        Chores choreService = new Chores(databaseMock);
        List<Chore> allChores = choreService.getAllChores();
        assertEquals(2, allChores.size());
        assertEquals("Wash Dishes", allChores.get(0).getChoreName());
        assertEquals("Buy Beer", allChores.get(1).getChoreName());
        
        List<Chore> choresForUser = choreService.getChoresForUser("test");
        assertEquals(1, choresForUser.size());
        assertEquals("Wash Dishes", allChores.get(0).getChoreName());
    }
}