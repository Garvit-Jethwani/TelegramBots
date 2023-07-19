package org.telegram.abilitybots.api.bot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.toggle.AbilityToggle;
import org.telegram.abilitybots.api.toggle.DefaultToggle;
import org.telegram.telegrambots.bots.DefaultBotOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AbilityBot_AbilityBot_f0c42cd9e3_Test {

    private String botToken;
    private String botUsername;
    private DBContext db;
    private AbilityToggle toggle;
    private DefaultBotOptions botOptions;
    private TestAbilityBot abilityBot;

    @BeforeEach
    public void setup() {
        botToken = "testBotToken";
        botUsername = "testBotUsername";
        db = Mockito.mock(DBContext.class);
        toggle = new DefaultToggle();
        botOptions = new DefaultBotOptions();
        abilityBot = new TestAbilityBot(botToken, botUsername, db, toggle, botOptions);
    }

    @Test
    public void testAbilityBotConstructor_success() {
        assertEquals(botToken, abilityBot.getBotToken());
        assertEquals(botUsername, abilityBot.getBotUsername());
        assertEquals(db, abilityBot.getDBContext());
        assertEquals(toggle, abilityBot.getToggle());
        assertEquals(botOptions, abilityBot.getBotOptions());
    }

    @Test
    public void testAbilityBotConstructor_failure() {
        String wrongBotToken = "wrongBotToken";
        String wrongBotUsername = "wrongBotUsername";
        DBContext wrongDb = Mockito.mock(DBContext.class);
        AbilityToggle wrongToggle = new DefaultToggle();
        DefaultBotOptions wrongBotOptions = new DefaultBotOptions();

        assertThrows(IllegalArgumentException.class, () -> new TestAbilityBot(wrongBotToken, wrongBotUsername, wrongDb, wrongToggle, wrongBotOptions));
    }

    class TestAbilityBot extends AbilityBot {
        TestAbilityBot(String botToken, String botUsername, DBContext db, AbilityToggle toggle, DefaultBotOptions botOptions) {
            super(botToken, botUsername);
        }
        
        DBContext getDBContext() {
            return db;
        }

        AbilityToggle getToggle() {
            return toggle;
        }

        DefaultBotOptions getBotOptions() {
            return botOptions;
        }
    }
}
