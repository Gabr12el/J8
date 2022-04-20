package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //    @Test
//    void station1() {// покажи актуальную станцию
//        Radio rad = new Radio();
//        int actual = rad.getCurrentStation();
//        System.out.println(actual);
//    }
    @Test
    void stationLimMin() {// если станция 1-1=0
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void stationLimMax() {// если станция 9+1=0
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void stationMax() {// если станция 1-1=0
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.next();//обращение к next
        int expected = 2;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void stationMax2() {// если станция 9+1=0
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();//обращение к next
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void stationMin() {// если станция 0-1 =9
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();//обращение к prev
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void stationMin2() {// если станция 0+9=8
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.prev();//обращение к prev
        int expected = 8;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void stationInput() {//задать № станции (1-9)
        Radio rad = new Radio();
        int currentStation = 5;
        int expected = 5;
        rad.stationInput(currentStation);//обращение к stationInput
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void stationInput2() {//задать № станции (1-9)
        Radio rad = new Radio();
        int currentStation = -1;
        int expected = 0;
        rad.stationInput(currentStation);//обращение к stationInput
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void stationInput3() {//задать № станции (1-9)
        Radio rad = new Radio();
        int currentStation = 10;
        int expected = 0;
        rad.stationInput(currentStation);//обращение к stationInput
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void currentVolume() {//получить урзвука
        Radio rad = new Radio();
        int expected = 0;
        rad.getCurrentVolume();//обращение к getCurrentVolume
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void stationVolumePlus() {// если громкость 10+1=10
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.volumePlus();//обращение к volumePlus
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void stationVolumePlus2() {// если громкость 1+1=2
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.volumePlus();//обращение к volumePlus
        int expected = 2;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void stationVolumeMinus() {// если громкость 10+1=10
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.volumeMinus();//обращение к volumeMinus
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void stationVolumeMinus2() {// если громкость 0+9=8
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.volumeMinus();//обращение к volumeMinus
        int expected = 8;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }
}