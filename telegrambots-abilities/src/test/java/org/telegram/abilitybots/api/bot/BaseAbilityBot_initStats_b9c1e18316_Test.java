// Test generated by RoostGPT for test telegramBot using AI Type Open AI and AI Model gpt-4

package org.telegram.abilitybots.api.bot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.abilitybots.api.objects.Reply;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class BaseAbilityBot_initStats_b9c1e18316_Test {

    private BaseAbilityBot baseAbilityBot;

    @Mock
    private DBContext db;
    @Mock
    private Map<String, Ability> abilities;
    @Mock
    private Set<Reply> replies;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        baseAbilityBot = spy(new BaseAbilityBot("token", "botName") {
            @Override
            public int creatorId() {
                return 0;
            }
        });
        baseAbilityBot.db = db;
        baseAbilityBot.abilities = abilities;
        baseAbilityBot.replies = replies;
    }

    @Test
    public void testInitStatsWithEmptyData() {
        Map<String, Integer> stats = new HashMap<>();

        when(db.getMap(anyString())).thenReturn(stats);
        when(abilities.entrySet()).thenReturn(new HashSet<>());
        when(replies.stream()).thenReturn(new HashSet<Reply>().stream());

        baseAbilityBot.initStats();

        verify(db, times(1)).getMap(anyString());
        verify(stats, never()).remove(anyString());
        verify(stats, never()).computeIfAbsent(anyString(), any());
    }

    @Test
    public void testInitStatsWithData() {
        Map<String, Integer> stats = new HashMap<>();
        stats.put("test", 1);

        Ability ability = mock(Ability.class);
        when(ability.statsEnabled()).thenReturn(true);

        Map.Entry<String, Ability> entry = new HashMap.SimpleEntry<>("test", ability);

        Set<Map.Entry<String, Ability>> entries = new HashSet<>();
        entries.add(entry);

        when(db.getMap(anyString())).thenReturn(stats);
        when(abilities.entrySet()).thenReturn(entries);
        when(replies.stream()).thenReturn(new HashSet<Reply>().stream());

        baseAbilityBot.initStats();

        verify(db, times(1)).getMap(anyString());
        verify(stats, never()).remove(anyString());
        verify(stats, times(1)).computeIfAbsent(anyString(), any());
    }
}
