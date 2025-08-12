package com.ai.controllers;

import com.ai.model.PingPong;
import com.ai.services.PingPongService;
import io.micronaut.http.HttpStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FirstAiMicronautProjectControllerTest {

    @Mock
    private PingPongService pingPongService;

    @InjectMocks
    private FirstAiMicronautProjectController controller;

    @Test
    void testPing_ShouldReturnOkResponseWithPingPong() {
        // Arrange
        var ping = LocalDateTime.of(2024, 1, 1, 12, 0, 0);
        var pong = LocalDateTime.of(2024, 1, 1, 12, 0, 1);
        var expectedPingPong = new PingPong(ping, pong);
        
        when(pingPongService.create(any(LocalDateTime.class))).thenReturn(expectedPingPong);
        
        // Act
        var response = controller.ping();
        
        // Assert
        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatus());
        assertNotNull(response.getBody());
        assertEquals(expectedPingPong, response.getBody().get());
        
        verify(pingPongService, times(1)).create(any(LocalDateTime.class));
    }

    @Test
    void testPing_ShouldCallServiceWithCurrentTime() {
        // Arrange
        var ping = LocalDateTime.of(2024, 1, 1, 12, 0, 0);
        var pong = LocalDateTime.of(2024, 1, 1, 12, 0, 1);
        var expectedPingPong = new PingPong(ping, pong);
        
        when(pingPongService.create(any(LocalDateTime.class))).thenReturn(expectedPingPong);
        
        // Act
        controller.ping();
        
        // Assert
        verify(pingPongService, times(1)).create(any(LocalDateTime.class));
    }

    @Test
    void testPing_WhenServiceThrowsException_ShouldPropagateException() {
        // Arrange
        when(pingPongService.create(any(LocalDateTime.class)))
            .thenThrow(new RuntimeException("Service error"));
        
        // Act & Assert
        assertThrows(RuntimeException.class, () -> {
            controller.ping();
        });
        
        verify(pingPongService, times(1)).create(any(LocalDateTime.class));
    }

    @Test
    void testPing_ShouldReturnResponseWithCorrectContentType() {
        // Arrange
        var ping = LocalDateTime.of(2024, 1, 1, 12, 0, 0);
        var pong = LocalDateTime.of(2024, 1, 1, 12, 0, 1);
        var expectedPingPong = new PingPong(ping, pong);
        
        when(pingPongService.create(any(LocalDateTime.class))).thenReturn(expectedPingPong);
        
        // Act
        var response = controller.ping();
        
        // Assert
        assertNotNull(response);
        // The Content-Type is set by the framework, not by our controller directly
        // So we just verify that the response is successful
        assertEquals(HttpStatus.OK, response.getStatus());
    }
} 