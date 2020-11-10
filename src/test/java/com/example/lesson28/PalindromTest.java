package com.example.lesson28;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.example.lesson28.Palindrom.isPalindrom;
import static org.assertj.core.api.Java6Assertions.assertThat;

@ExtendWith(SpringExtension.class)
public class PalindromTest {

    @Test
    @DisplayName("Проверка пустой строки функцией Palindrom")
    void testPalindromIsNullString() throws Exception {

        var resulut = isPalindrom(null);

        assertThat(resulut).isFalse();
    }
}
