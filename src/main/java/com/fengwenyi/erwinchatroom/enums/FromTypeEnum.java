package com.fengwenyi.erwinchatroom.enums;

import lombok.Getter;

/**
 * @author <a href="https://www.fengwenyi.com">Erwin Feng</a>
 * @since 2021-08-15
 */
@Getter
public enum FromTypeEnum {

    SYSTEM(0, "系统")
    , USER(1, "用户")

    ;

    private final int code;
    private final String desc;

    FromTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
