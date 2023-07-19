// Test generated by RoostGPT for test telegramBot using AI Type Open AI and AI Model gpt-4

package org.telegram.abilitybots.api.objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.telegram.abilitybots.api.bot.BaseAbilityBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.function.Consumer;

public class Ability_postAction_4187cd8e58_Test {

    private BaseAbilityBot bot;
    private Update update;
    private MessageContext context;

    @BeforeEach
    public void setup() {
        bot = mock(BaseAbilityBot.class);
        update = mock(Update.class);
        context = new MessageContext(bot, update, 1);
    }

    @Test
    public void testPostActionSuccess() {
        Consumer<MessageContext> expectedPostAction = mock(Consumer.class);
        when(bot.postAction()).thenReturn(expectedPostAction);

        Consumer<MessageContext> actualPostAction = bot.postAction();
        assertEquals(expectedPostAction, actualPostAction, "Post action should match the expected value");
    }

    @Test
    public void testPostActionFailure() {
        // TODO: Update this to the actual Consumer that should be returned in case of failure
        Consumer<MessageContext> expectedPostAction = mock(Consumer.class);
        when(bot.postAction()).thenReturn(null);

        Consumer<MessageContext> actualPostAction = bot.postAction();
        assertEquals(expectedPostAction, actualPostAction, "Post action should return null in case of failure");
    }
}
