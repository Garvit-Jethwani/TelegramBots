package org.telegram.abilitybots.api.bot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class AbilityBot_AbilityBot_b4c17095d6_Test {

    private AbilityBot abilityBot;

    @BeforeEach
    public void setup() {
        abilityBot = Mockito.mock(AbilityBot.class);
    }

    @Test
    public void testAbilityBot_ValidBotTokenAndUsername() {
        when(abilityBot.getBotToken()).thenReturn("validToken");
        when(abilityBot.getBotUsername()).thenReturn("validUsername");

        assertEquals("validToken", abilityBot.getBotToken());
        assertEquals("validUsername", abilityBot.getBotUsername());
    }

    @Test
    public void testAbilityBot_NullBotToken() {
        when(abilityBot.getBotToken()).thenReturn(null);
        when(abilityBot.getBotUsername()).thenReturn("validUsername");

        assertThrows(NullPointerException.class, () -> {
            abilityBot.getBotToken();
        });
    }

    @Test
    public void testAbilityBot_NullBotUsername() {
        when(abilityBot.getBotToken()).thenReturn("validToken");
        when(abilityBot.getBotUsername()).thenReturn(null);

        assertThrows(NullPointerException.class, () -> {
            abilityBot.getBotUsername();
        });
    }
}
