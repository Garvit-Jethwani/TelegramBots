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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Ability_action_b0d8609058_Test {

    private AbilityBuilder abilityBuilder;
    private Consumer<MessageContext> consumer;

    @BeforeEach
    public void setUp() {
        abilityBuilder = new AbilityBuilder();
        consumer = mock(Consumer.class);
    }

    @Test
    public void testActionSuccess() {
        abilityBuilder.action(consumer);
        MessageContext messageContext = mock(MessageContext.class);
        consumer.accept(messageContext);
        verify(consumer).accept(messageContext);
    }

    @Test
    public void testActionFailure() {
        assertThrows(NullPointerException.class, () -> {
            abilityBuilder.action(null);
        });
    }
}
