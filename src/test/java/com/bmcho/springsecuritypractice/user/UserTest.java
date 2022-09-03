package com.bmcho.springsecuritypractice.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

class UserTest {

    @DisplayName("유저를 생성함에 있어 어떤 에러도 있으면 안된다.")
    @Test
    void givenNothing_whenCreateUser_thenNotThrowAnyException() {

        assertThatCode(() -> new User("username", "test12345", "ROLE_ADMIN"))
                .doesNotThrowAnyException();
    }

    @DisplayName("오버라이드된 Boolean 리턴 타입의 메서드들은 모두 true를 리턴한다.")
    @Test
    void givenUser_whenOverrideBooleanMethod_thenReturnsAllTrue() {
        User user = new User("username", "test12345", "ROLE_ADMIN");

        assertThat(user.isCredentialsNonExpired()).isTrue();
        assertThat(user.isEnabled()).isTrue();
        assertThat(user.isAccountNonExpired()).isTrue();
        assertThat(user.isAccountNonLocked()).isTrue();
        assertThat(user.isAccountNonExpired()).isTrue();
    }


    @DisplayName("admin user를 생성하고 그에 따른 권한을 테스트한다.")
    @Test
    void givenAdminUser_whenCurrentCreate_thenAllExpectedClear() {
        User user = new User("username", "test12345", "ROLE_ADMIN");

        assertThat(user.isAdmin()).isTrue();
        assertThat(user.getAuthority()).isEqualTo("ROLE_ADMIN");
    }
}