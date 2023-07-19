// Test generated by RoostGPT for test telegramBot using AI Type Open AI and AI Model gpt-4

package org.telegram.abilitybots.api.objects;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.abilitybots.api.bot.BaseAbilityBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Ability_reply_13dff51255_Test {

    @Mock
    private AbilityBuilder abilityBuilder;

    @Mock
    private BaseAbilityBot baseAbilityBot;

    @Mock
    private Update update;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testReplySuccess() {
        BiConsumer<BaseAbilityBot, Update> action = (bot, update) -> bot.silent().send("Test message", update.getMessage().getChatId());
        Predicate<Update> condition = update -> update.hasMessage() && update.getMessage().hasText();

        when(abilityBuilder.reply(action, condition)).thenReturn(abilityBuilder);

        AbilityBuilder result = abilityBuilder.reply(action, condition);

        assertEquals(abilityBuilder, result);
    }

    @Test
    public void testReplyFailure() {
        BiConsumer<BaseAbilityBot, Update> action = (bot, update) -> bot.silent().send("Test message", update.getMessage().getChatId());
        Predicate<Update> condition = update -> update.hasMessage() && update.getMessage().hasText();

        when(abilityBuilder.reply(action, condition)).thenReturn(null);

        AbilityBuilder result = abilityBuilder.reply(action, condition);

        assertEquals(null, result);
    }
}
