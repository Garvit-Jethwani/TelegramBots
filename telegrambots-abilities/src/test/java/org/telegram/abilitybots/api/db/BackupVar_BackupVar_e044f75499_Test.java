// Test generated by RoostGPT for test telegramBot using AI Type Open AI and AI Model gpt-4

package org.telegram.abilitybots.api.db;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class BackupVar_BackupVar_e044f75499_Test {

    private BackupVar<Integer> backupVarInteger;
    private BackupVar<String> backupVarString;

    @Before
    public void setUp() {
        backupVarInteger = new BackupVar<>(5);
        backupVarString = new BackupVar<>("test");
    }

    @Test
    public void testBackupVarInteger() {
        assertEquals("Integer value should be 5", (Integer) 5, backupVarInteger.getVar());
    }

    @Test
    public void testBackupVarString() {
        assertEquals("String value should be 'test'", "test", backupVarString.getVar());
    }

    @Test
    public void testBackupVarNull() {
        BackupVar<Object> backupVarNull = new BackupVar<>(null);
        assertNull("Value should be null", backupVarNull.getVar());
    }
}
