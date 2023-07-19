// Test generated by RoostGPT for test telegramBot using AI Type Open AI and AI Model gpt-4

package org.telegram.abilitybots.api.db;

import com.google.common.base.MoreObjects;
import org.mapdb.Atomic;
import java.util.Objects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapDBVar_set_817c1e5ff6_Test {

    @Mock
    private Atomic.Var<Object> mockVar;

    private MapDBVar<Object> mapDBVar;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mapDBVar = new MapDBVar<>(mockVar);
    }

    @Test
    public void testSet_newValue() {
        Object newValue = new Object();
        mapDBVar.set(newValue);

        verify(mockVar).set(newValue);
    }

    @Test
    public void testSet_nullValue() {
        mapDBVar.set(null);

        verify(mockVar).set(null);
    }
}
