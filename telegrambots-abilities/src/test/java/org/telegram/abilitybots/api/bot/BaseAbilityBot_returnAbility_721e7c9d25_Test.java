// Test generated by RoostGPT for test telegramBot using AI Type Open AI and AI Model gpt-4

package org.telegram.abilitybots.api.bot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.telegram.abilitybots.api.objects.Ability;

public class BaseAbilityBot_returnAbility_721e7c9d25_Test {
    private Object testObject;
    private Method testMethod;
    private Ability testAbility;

    @BeforeEach
    public void setUp() throws NoSuchMethodException {
        testObject = new Object();
        testMethod = testObject.getClass().getMethod("toString");
        testAbility = mock(Ability.class);
    }

    @Test
    public void testReturnAbility_Success() throws Exception {
        when(testMethod.invoke(testObject)).thenReturn(testAbility);

        Function<? super Method, Ability> functionUnderTest = BaseAbilityBot.returnAbility(testObject);
        Ability result = functionUnderTest.apply(testMethod);

        assertEquals(testAbility, result);
    }

    @Test
    public void testReturnAbility_Failure() throws Exception {
        when(testMethod.invoke(testObject)).thenThrow(new InvocationTargetException(new Exception()));

        Function<? super Method, Ability> functionUnderTest = BaseAbilityBot.returnAbility(testObject);

        assertThrows(RuntimeException.class, () -> {
            functionUnderTest.apply(testMethod);
        });
    }
}
