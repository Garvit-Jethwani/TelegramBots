// Test generated by RoostGPT for test telegramBot using AI Type Open AI and AI Model gpt-4

package org.telegram.abilitybots.api.bot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.telegrambots.meta.api.objects.User;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class BaseAbilityBot_users_c7655dc0f4_Test {

    @Mock
    private DBContext db;

    private BaseAbilityBot baseAbilityBot;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        baseAbilityBot = new BaseAbilityBot("botToken", "botUsername") {
            @Override
            public int creatorId() {
                return 0;
            }
        };
        baseAbilityBot.db = db;
    }

    @Test
    public void testUsers() {
        Map<Long, User> expectedUsers = new HashMap<>();
        User user1 = new User();
        user1.setId(1);
        expectedUsers.put(1L, user1);

        User user2 = new User();
        user2.setId(2);
        expectedUsers.put(2L, user2);

        when(db.getMap(BaseAbilityBot.USERS)).thenReturn(expectedUsers);

        Map<Long, User> actualUsers = baseAbilityBot.users();

        assertEquals(expectedUsers, actualUsers);
    }

    @Test
    public void testUsers_empty() {
        Map<Long, User> expectedUsers = new HashMap<>();
        when(db.getMap(BaseAbilityBot.USERS)).thenReturn(expectedUsers);

        Map<Long, User> actualUsers = baseAbilityBot.users();

        assertEquals(expectedUsers, actualUsers);
    }
}
