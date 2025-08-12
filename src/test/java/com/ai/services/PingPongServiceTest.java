package com.ai.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PingPongServiceTest {

    @InjectMocks
    private PingPongService pingPongService;

    @Test
    void testCreate_ShouldReturnPingPongWithCorrectValues() {
        // Arrange
        var ping = LocalDateTime.of(2024, 1, 1, 12, 0, 0);
        
        // Act
        var result = pingPongService.create(ping);
        
        // Assert
        assertNotNull(result);
        assertEquals(ping, result.ping());
        assertNotNull(result.pong());
        assertTrue(result.pong().isAfter(ping) || result.pong().equals(ping));
    }

    @Test
    void testCreate_WithNullPing_ShouldCreatePingPongWithNullPing() {
        // Arrange
        LocalDateTime ping = null;
        
        // Act
        var result = pingPongService.create(ping);
        
        // Assert
        assertNotNull(result);
        assertNull(result.ping());
        assertNotNull(result.pong());
    }

    @Test
    void testCreate_ShouldReturnNewPingPongInstance() {
        // Arrange
        var ping1 = LocalDateTime.now();
        var ping2 = LocalDateTime.now();
        
        // Act
        var result1 = pingPongService.create(ping1);
        var result2 = pingPongService.create(ping2);
        
        // Assert
        assertNotSame(result1, result2);
        assertEquals(ping1, result1.ping());
        assertEquals(ping2, result2.ping());
    }
} 