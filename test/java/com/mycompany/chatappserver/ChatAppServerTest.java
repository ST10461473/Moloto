/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatappserver;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChatAppServerTest {

    @Test
    public void testAddNumbers() {
        ChatAppServer server = new ChatAppServer();
        assertEquals(7, server.addNumbers(3, 4), "3 + 4 should be 7");
    }

    @Test
    public void testServerRunning() {
        ChatAppServer server = new ChatAppServer();
        assertTrue(server.isServerRunning(), "Server should be running");
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {
        assertFalse(ChatAppServer.checkUsername("kyle")); // No underscore
    }

    @Test
    public void testUsernameCorrectlyFormatted() {
        assertTrue(ChatAppServer.checkUsername("kyl_1"));
    }

    @Test
    public void testPasswordMeetsComplexity() {
        assertTrue(ChatAppServer.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testPasswordFailsComplexity() {
        assertFalse(ChatAppServer.checkPasswordComplexity("password")); // Too weak
    }

    @Test
    public void testPhoneNumberCorrectFormat() {
        assertTrue(ChatAppServer.isValidPhoneNumber("+27838968976"));
    }

    @Test
    public void testPhoneNumberIncorrectFormat() {
        assertFalse(ChatAppServer.isValidPhoneNumber("08966553"));
    }
}