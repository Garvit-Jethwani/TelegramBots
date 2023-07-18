// Test generated by RoostGPT for test telegramBot using AI Type Open AI and AI Model gpt-4

package org.telegram.abilitybots.api.bot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.telegram.abilitybots.api.objects.MessageContext;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.User;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DefaultAbilities_send_470d80d12c_Test {

    @Mock
    private Bot bot;

    @Mock
    private MessageContext ctx;

    @Mock
    private User user;

    private DefaultAbilities defaultAbilities;

    @Before
    public void setUp() {
        defaultAbilities = new DefaultAbilities(bot);
        when(ctx.user()).thenReturn(user);
    }

    @Test
    public void testSend_success() {
        String message = "Hello";
        String languageCode = "en";
        String[] args = new String[]{"arg1", "arg2"};
        long chatId = 12345L;
        Message expectedMessage = new Message();

        when(user.getLanguageCode()).thenReturn(languageCode);
        when(ctx.chatId()).thenReturn(chatId);
        when(bot.silent.send(anyString(), eq(chatId))).thenReturn(Optional.of(expectedMessage));

        Optional<Message> actualMessage = defaultAbilities.send(message, ctx, args);

        verify(bot.silent).send(anyString(), eq(chatId));
        assertEquals(Optional.of(expectedMessage), actualMessage);
    }

    @Test
    public void testSend_failure() {
        String message = "Hello";
        String languageCode = "en";
        String[] args = new String[]{"arg1", "arg2"};
        long chatId = 12345L;

        when(user.getLanguageCode()).thenReturn(languageCode);
        when(ctx.chatId()).thenReturn(chatId);
        when(bot.silent.send(anyString(), eq(chatId))).thenReturn(Optional.empty());

        Optional<Message> actualMessage = defaultAbilities.send(message, ctx, args);

        verify(bot.silent).send(anyString(), eq(chatId));
        assertEquals(Optional.empty(), actualMessage);
    }
}
