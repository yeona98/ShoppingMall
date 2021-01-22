package com.jane.shoppingmall.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "게스트"),
    CUSTOMER("ROLE_CUSTOMER", "회원"),
    SELLER("ROLE_SELLER", "판매자"),
    ADMIN("ROLE_ADMIN", "관리자");

    private final String Key;
    private final String title;
}
