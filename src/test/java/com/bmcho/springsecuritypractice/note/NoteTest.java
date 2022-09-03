package com.bmcho.springsecuritypractice.note;

import com.bmcho.springsecuritypractice.user.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

class NoteTest {

    @DisplayName("노트를 생성함에 있어 어떠한 에러도 반환하면 안된다.")
    @Test
    void givenNothing_whenNoteCreate_thenDoswNotThrowAnyException() {
        User user = new User("username", "test12345", "ROLE_ADMIN");

        assertThatCode(() -> new Note("테스트", "테스트컨텐츠", user))
                .doesNotThrowAnyException();
    }
}