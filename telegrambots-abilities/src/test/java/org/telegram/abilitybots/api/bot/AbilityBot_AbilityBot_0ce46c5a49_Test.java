package org.telegram.abilitybots.api.bot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.telegrambots.bots.DefaultBotOptions;

public class AbilityBot_AbilityBot_0ce46c5a49_Test {

    private String botToken;
    private String botUsername;
    private DBContext db;
    private DefaultBotOptions options;

    // Subclass of AbilityBot
    private class TestAbilityBot extends AbilityBot {
        public TestAbilityBot(String botToken, String botUsername, DBContext db, DefaultBotOptions options) {
            super(botToken, botUsername, db, options);
        }

        @Override
        public int creatorId() {
            return 0;
        }
    }

    @BeforeEach
    public void setup() {
        botToken = "testBotToken";
        botUsername = "testBotUsername";
        db = Mockito.mock(DBContext.class);
        options = new DefaultBotOptions();
    }

    @Test
    public void testAbilityBotConstructorSuccess() {
        TestAbilityBot bot = new TestAbilityBot(botToken, botUsername, db, options);
        Assertions.assertNotNull(bot);
    }

    @Test
    public void testAbilityBotConstructorFailure() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new TestAbilityBot(null, botUsername, db, options);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new TestAbilityBot(botToken, null, db, options);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new TestAbilityBot(botToken, botUsername, null, options);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new TestAbilityBot(botToken, botUsername, db, null);
        });
    }
}
