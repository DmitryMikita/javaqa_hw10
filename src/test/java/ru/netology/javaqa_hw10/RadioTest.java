package ru.netology.javaqa_hw10;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class RadioTest {


    // Изменение громкости

    @ParameterizedTest
    @CsvSource({
            "0,11", //Громкость выше максимальной
            "0,-1"   //Громкость ниже минимальной
    })
    public void shouldSetVolume(int expected, int CurrentVolume) {
        Radio radio = new Radio();
        radio.setCurrentVolume(CurrentVolume);
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }


    @ParameterizedTest
    @CsvSource({
            "10,9", //Верхняя граница
            "1,0",  //Нижняя граница
            "10,10" //Максимальное значение текущей громкост

    })
    public void shooldIncreaseVolume(int expected, int CurrentVolume) {
        Radio radio = new Radio();
        radio.setCurrentVolume(CurrentVolume);
        radio.increaseVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());

    }

    @ParameterizedTest
    @CsvSource({
            "9,10", //Верхняя граница
            "0,1",  //Нижняя граница
            "0,0" //Минимальное значение текущей громкости

    })
    public void shooldReductionVolume(int expected, int CurrentVolume) {
        Radio radio = new Radio();
        radio.setCurrentVolume(CurrentVolume);
        radio.reductionVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());

    }


    // переключение станций

    @ParameterizedTest
    @CsvSource({
            "0,11", //Выше максимальной
            "0,-1",  //Ниже минимальной

    })
    public void shouldSetStation(int expected, int CurrentStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(CurrentStation);
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource({
            "1,0", //Нижняя граница
            "9,8",  //Верхняя граница
            "0,9",  //Последняя станция

    })
    public void shooldNextStation(int expected, int CurrentStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(CurrentStation);
        radio.nextStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource({
            "0,1", //Нижняя граница
            "8,9",  //Верхняя граница
            "9,0"  //Последняя станция

    })
    public void shooldPrevStation(int expected, int CurrentStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(CurrentStation);
        radio.prevStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    // тест задаваемого количества радиостанций
    @ParameterizedTest
    @CsvSource({
            "0,31", //Выше максимальной
            "0,-1",  //Ниже минимальной

    })
    public void shouldSetStationChangeCount(int expected, int CurrentStation) {
        Radio radio = new Radio(30);
        radio.setCurrentStation(CurrentStation);
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource({
            "1,0", //Нижняя граница
            "29,28",  //Верхняя граница
            "0,29",  //Последняя станция

    })
    public void shooldNextStationChangeCount(int expected, int CurrentStation) {
        Radio radio = new Radio(30);
        radio.setCurrentStation(CurrentStation);
        radio.nextStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource({
            "0,1", //Нижняя граница
            "28,29",  //Верхняя граница
            "29,0"  //Последняя станция

    })
    public void shooldPrevStationChangeCount(int expected, int CurrentStation) {
        Radio radio = new Radio(30);
        radio.setCurrentStation(CurrentStation);
        radio.prevStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

}
