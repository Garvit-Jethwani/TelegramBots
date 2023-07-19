package org.telegram.abilitybots.api.bot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.toggle.AbilityToggle;
import org.telegram.abilitybots.api.toggle.DefaultToggle;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import org.telegram.telegrambots.util.WebhookUtils;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

public class AbilityBot_onUpdateReceived_fb2cc743d7_Test {

    class TestAbilityBot extends AbilityBot {
        public TestAbilityBot() {
            super("", "");
        }

        @Override
        public String getBotUsername() {
            return null;
        }

        @Override
        public String getBotToken() {
            return null;
        }
    }

    @InjectMocks
    private TestAbilityBot abilityBot;

    @Mock
    private Update update;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testOnUpdateReceived_success() {
        abilityBot.onUpdateReceived(update);
        verify(abilityBot, times(1)).onUpdateReceived(update);
    }

    @Test
    public void testOnUpdateReceived_failure() {
        abilityBot.onUpdateReceived(null);
        verify(abilityBot, times(1)).onUpdateReceived(null);
    }
}
