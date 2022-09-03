package com.bmcho.springsecuritypractice.notice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

class NoticeTest {

    @DisplayName("공지사항을 생성함에 있어, 어떤 에러도 반환하면 안된다.")
    @Test
    void givenNothing_whenCreateNotice_thenDoseNotThrowAnyException() {
        assertThatCode(() -> new Notice("테스트", "테스트콘텐츠"))
                .doesNotThrowAnyException();
    }
}