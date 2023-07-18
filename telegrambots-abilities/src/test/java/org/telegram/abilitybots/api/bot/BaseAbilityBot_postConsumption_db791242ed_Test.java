// Test generated by RoostGPT for test telegramBot using AI Type Open AI and AI Model gpt-4

package org.telegram.abilitybots.api.bot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.abilitybots.api.objects.MessageContext;
import org.telegram.abilitybots.api.util.Pair;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.*;

public class BaseAbilityBot_postConsumption_db791242ed_Test {
    @Mock
    private Pair<MessageContext, Ability> pair;
    @Mock
    private Ability ability;
    @Mock
    private Consumer<MessageContext> consumer;
    @Mock
    private MessageContext messageContext;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testPostConsumption_withPostAction() {
        when(pair.b()).thenReturn(ability);
        when(ability.postAction()).thenReturn(consumer);

        assertDoesNotThrow(() -> postConsumption(pair));
        verify(consumer).accept(any(MessageContext.class));
    }

    @Test
    public void testPostConsumption_withoutPostAction() {
        when(pair.b()).thenReturn(ability);
        when(ability.postAction()).thenReturn(null);

        assertDoesNotThrow(() -> postConsumption(pair));
        verify(consumer, never()).accept(any(MessageContext.class));
    }

    private void postConsumption(Pair<MessageContext, Ability> pair) {
        java.util.Optional.ofNullable(pair.b().postAction())
                .ifPresent(consumer -> consumer.accept(pair.a()));
    }
}
