// Test generated by RoostGPT for test telegramBot using AI Type Open AI and AI Model gpt-4

package org.telegram.abilitybots.api.objects;

import com.google.common.base.Objects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class Ability_equals_5bdc7536f0_Test {

    private Ability testAbility;

    @BeforeEach
    void setUp() {
        testAbility = new Ability();
        testAbility.setName("Test");
        testAbility.setArgNum(2);
        testAbility.setLocality(Locality.ALL);
        testAbility.setPrivacy(Privacy.PUBLIC);
    }

    @Test
    void testEquals_SameObject() {
        assertTrue(testAbility.equals(testAbility));
    }

    @Test
    void testEquals_NullObject() {
        assertFalse(testAbility.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        assertFalse(testAbility.equals(new String("Test")));
    }

    @Test
    void testEquals_SameValues() {
        Ability sameValues = new Ability();
        sameValues.setName("Test");
        sameValues.setArgNum(2);
        sameValues.setLocality(Locality.ALL);
        sameValues.setPrivacy(Privacy.PUBLIC);

        assertTrue(testAbility.equals(sameValues));
    }

    @Test
    void testEquals_DifferentValues() {
        Ability differentValues = new Ability();
        differentValues.setName("Different");
        differentValues.setArgNum(3);
        differentValues.setLocality(Locality.USER);
        differentValues.setPrivacy(Privacy.PRIVATE);

        assertFalse(testAbility.equals(differentValues));
    }
}
