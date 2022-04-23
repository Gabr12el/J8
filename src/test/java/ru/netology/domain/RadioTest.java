package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldGetCurrentStation() {
        int expected = 5;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldCheckSumStations() {
        int summStations = 30;
        Radio radio = new Radio(summStations);
        int expected = 10;
        radio.setCurrentStation(10);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldCountStations() {
        int expected = 0;
        radio.setCurrentStation(10);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldNext() {
        int station = 5;
        int expected = 6;
        radio.setCurrentStation(station);
        radio.next();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldPrev() {
        int station = 5;
        int expected = 4;
        radio.setCurrentStation(station);
        radio.prev();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchDown() {
        int station = 9;
        int expected = 0;
        radio.setCurrentStation(station);
        radio.next();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchUp() {
        int station = 0;
        int expected = 9;
        radio.setCurrentStation(station);
        radio.prev();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSwitch() {
        int station = -1;
        int expected = 0;
        radio.setCurrentStation(station);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldPlusVolume() {
        int volume = 50;
        int expected = 51;
        radio.setCurrentVolume(volume);
        radio.volumePlus();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldMinusVolume() {
        int volume = 50;
        int expected = 49;
        radio.setCurrentVolume(volume);
        radio.volumeMinus();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeUp() {
        int volume = 100;
        int expected = 100;
        radio.setCurrentVolume(volume);
        radio.volumePlus();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown() {
        int volume = 0;
        int expected = 0;
        radio.setCurrentVolume(volume);
        radio.volumeMinus();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown2() {
        int volume = -1;
        int expected = 0;
        radio.setCurrentVolume(volume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldVolume2() {
        int volume = 101;
        int expected = 0;
        radio.setCurrentVolume(volume);
        assertEquals(expected, radio.getCurrentVolume());
    }
}