package com.example.lesson28;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.example.lesson28.OneZeroLine.maxOnesLine;
import static org.assertj.core.api.Java6Assertions.assertThat;

@ExtendWith(SpringExtension.class)
public class OneZeroTest {

    @Test
    @DisplayName("Если строка состоит только из нулей")
    void testIfItOnlyZeroLine() throws Exception {

        var str = maxOnesLine("0000000");

        assertThat(str).isEqualTo("Некорректная строка");
    }

    @Test
    @DisplayName("Если строка состоит только из единиц")
    void testIfItOnlyOnesLine() throws Exception {
        var str = "11111111";
        var strres = maxOnesLine(str);

        assertThat(strres).isNotEqualTo(str);
    }

    @Test
    @DisplayName("Если строка состоит из пробелов")
    void testIfItSpaceLine() throws Exception {

        var res = maxOnesLine("   ");

        assertThat(res).isEqualTo("Некорректная строка");
    }

    @Test
    @DisplayName("Если строка содержит цифры отличные от 0 и 1")
    void testIfLineContainsOtherNum() throws Exception {

        var res = maxOnesLine("000111300");

        assertThat(res).isEqualTo("Некорректная строка");
    }

    @Test
    @DisplayName("Если строка содержит буквы")
    void testIfLineContainsLetters() throws Exception {

        var res = maxOnesLine("0001111bikbl");

        assertThat(res).isEqualTo("Некорректная строка");
    }

    @Test
    @DisplayName("Если строка пустая")
    void testIfLineIsEmpty() throws Exception {

        var res = maxOnesLine("");

        assertThat(res).isEqualTo("Некорректная строка");
    }

    @Test
    @DisplayName("Корректная строка с пятью единицами")
    void testIfCorrectLine() throws Exception {
        var res = maxOnesLine("0011100011111");

        assertThat(res).isEqualTo("11111");
    }


}
