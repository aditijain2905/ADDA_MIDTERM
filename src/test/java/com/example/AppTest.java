package com.example;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Properties;


public class AppTest {
private App matcher;


@Before
 public void setUp() {
 Properties storedCredentials = new Properties();

 storedCredentials.setProperty("ram", "3025");
 matcher = new App(storedCredentials);
 }
 @Test
 public void testMatchingCredentials() {
 assertTrue(matcher.matchCredentials("ram", "3025"));
 }

 @Test
 public void testNonMatchingCredentials() {
 assertFalse(matcher.matchCredentials("user1", "wrongId"));
 }
 @Test
 public void testUsernameNotFound() {
 assertFalse(matcher.matchCredentials("nonexistentname",
"Id"));
}
}
