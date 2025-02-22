import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class DatabaseConnection {
    boolean connected;

    public void connect() {
        connected = true;
    }

    public void disconnect() {
        connected = false;
    }
}

public class DatabaseConnectionTest {
    DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    @Test
    void testConnection() {
        assertTrue(db.connected);
    }

    @Test
    void testDisconnection() {
        db.disconnect();
        assertFalse(db.connected);
    }
}
