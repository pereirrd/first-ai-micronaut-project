package com.ai.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PingPongTest {

    @Test
    void testPingPongRecord_ShouldCreateValidInstance() {
        // Arrange
        var ping = LocalDateTime.of(2024, 1, 1, 12, 0, 0);
        var pong = LocalDateTime.of(2024, 1, 1, 12, 0, 1);
        
        // Act
        var pingPong = new PingPong(ping, pong);
        
        // Assert
        assertNotNull(pingPong);
        assertEquals(ping, pingPong.ping());
        assertEquals(pong, pingPong.pong());
    }

    @Test
    void testPingPongRecord_ShouldBeImmutable() {
        // Arrange
        var ping = LocalDateTime.of(2024, 1, 1, 12, 0, 0);
        var pong = LocalDateTime.of(2024, 1, 1, 12, 0, 1);
        var pingPong = new PingPong(ping, pong);
        
        // Act & Assert
        // Records are immutable by design, so we can't modify them after creation
        // This test verifies that the record behaves as expected
        assertNotNull(pingPong);
        assertEquals(ping, pingPong.ping());
        assertEquals(pong, pingPong.pong());
    }

    @Test
    void testPingPongRecord_EqualsAndHashCode() {
        // Arrange
        var ping1 = LocalDateTime.of(2024, 1, 1, 12, 0, 0);
        var pong1 = LocalDateTime.of(2024, 1, 1, 12, 0, 1);
        var ping2 = LocalDateTime.of(2024, 1, 1, 12, 0, 0);
        var pong2 = LocalDateTime.of(2024, 1, 1, 12, 0, 1);
        var ping3 = LocalDateTime.of(2024, 1, 1, 12, 0, 2);
        var pong3 = LocalDateTime.of(2024, 1, 1, 12, 0, 2);
        
        var pingPong1 = new PingPong(ping1, pong1);
        var pingPong2 = new PingPong(ping2, pong2);
        var pingPong3 = new PingPong(ping3, pong3);
        
        // Act & Assert
        assertEquals(pingPong1, pingPong2);
        assertEquals(pingPong1.hashCode(), pingPong2.hashCode());
        
        // Test with different values
        assertNotEquals(pingPong1, pingPong3);
        assertNotEquals(pingPong1.hashCode(), pingPong3.hashCode());
        
        // Test with same ping but different pong
        var pingPong4 = new PingPong(ping1, pong3);
        assertNotEquals(pingPong1, pingPong4);
        assertNotEquals(pingPong1.hashCode(), pingPong4.hashCode());
    }

    @Test
    void testPingPongRecord_ToString() {
        // Arrange
        var ping = LocalDateTime.of(2024, 1, 1, 12, 0, 0);
        var pong = LocalDateTime.of(2024, 1, 1, 12, 0, 1);
        var pingPong = new PingPong(ping, pong);
        
        // Act
        var result = pingPong.toString();
        
        // Assert
        assertNotNull(result);
        assertTrue(result.contains("ping="));
        assertTrue(result.contains("pong="));
        assertTrue(result.contains("PingPong["));
        assertTrue(result.contains("]"));
    }
} 