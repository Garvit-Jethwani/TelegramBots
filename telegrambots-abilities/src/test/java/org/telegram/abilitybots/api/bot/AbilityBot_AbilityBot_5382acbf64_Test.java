package org.telegram.abilitybots.api.bot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.telegram.abilitybots.api.toggle.DefaultToggle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AbilityBot_AbilityBot_5382acbf64_Test {

    @Mock
    private DefaultToggle toggle;

    private ConcreteAbilityBot abilityBot;

    @BeforeEach
    public void setup() {
        when(toggle.isEnabled()).thenReturn(true);
    }

    @Test
    public void testAbilityBot_Success() {
        abilityBot = new ConcreteAbilityBot("botToken", "botUsername", toggle);
        assertEquals("botToken", abilityBot.getBotToken());
        assertEquals("botUsername", abilityBot.getBotUsername());
    }

    @Test
    public void testAbilityBot_Failure() {
        when(toggle.isEnabled()).thenReturn(false);
        assertThrows(IllegalArgumentException.class, () -> new ConcreteAbilityBot("botToken", "botUsername", toggle));
    }
}
