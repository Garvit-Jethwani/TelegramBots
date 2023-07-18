// Test generated by RoostGPT for test telegramBot using AI Type Open AI and AI Model gpt-4

package org.telegram.abilitybots.api.bot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.abilitybots.api.objects.Reply;
import org.telegram.abilitybots.api.util.AbilityExtension;
import org.telegram.abilitybots.api.toggle.AbilityToggle;
import org.telegram.abilitybots.api.util.DefaultAbilities;

import java.util.Collections;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class BaseAbilityBot_registerAbilities_0efd22f40b_Test {

    @Mock
    private AbilityExtension extension;
    
    @Mock
    private AbilityToggle toggle;
    
    @Mock
    private DefaultAbilities defaultAbs;

    private BaseAbilityBot bot;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        bot = new BaseAbilityBot("token", "botName");
        bot.setToggle(toggle);
        bot.setExtensions(Collections.singletonList(extension));
        bot.setDefaultAbilities(defaultAbs);
    }

    @Test
    public void testRegisterAbilitiesSuccess() {
        when(extension.getClass().getMethods()).thenReturn(new Method[0]);
        when(toggle.isOff(any())).thenReturn(false);

        bot.registerAbilities();

        verify(extension, times(2)).getClass().getMethods();
        verify(toggle, atLeastOnce()).isOff(any());
    }

    @Test
    public void testRegisterAbilitiesFailure() {
        when(extension.getClass().getMethods()).thenThrow(IllegalStateException.class);

        assertThrows(RuntimeException.class, () -> bot.registerAbilities());

        verify(extension, times(1)).getClass().getMethods();
    }
}
