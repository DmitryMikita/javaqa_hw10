package ru.netology.javaqa_hw10;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa_hw10.Radio;

public class RadioTest {


    // Изменение громкости

    @Test
    public void shouldSetVolumeCurrentMoreMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeCurrentLessMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shooldIncreaseVolumeUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        Assertions.assertEquals(10, radio.getCurrentVolume());

    }
    @Test
    public void shooldIncreaseVolumeLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());

    }
    @Test
    public void shooldIncreaseVolumeCurrentMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());

    }
    @Test
    public void shooldReductionVolumeUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.reductionVolume();
        Assertions.assertEquals(9, radio.getCurrentVolume());

    }
    @Test
    public void shooldReductionVolumeLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reductionVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shooldReductionVolumeCurrentMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reductionVolume();
        Assertions.assertEquals(10, radio.getCurrentVolume());

    }


    // переключение станций

    @Test
    public void shouldSetStationCurrentMoreMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationCurrentLessMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shooldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shooldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();
        Assertions.assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shooldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shooldNextStationCurrentMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shooldPrevStationCurrentMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());

    }
}
