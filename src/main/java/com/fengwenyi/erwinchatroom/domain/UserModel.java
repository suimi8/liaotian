package com.fengwenyi.erwinchatroom.domain;

import com.fengwenyi.erwinchatroom.enums.UserStatusEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.websocket.Session;
import java.time.LocalDateTime;

/**
 * @author <a href="https://www.fengwenyi.com">Erwin Feng</a>
 * @since 2021-08-12
 */
@Data
@Accessors(chain = true)
public class UserModel {

    private String uid;

    private String nickname;

    private UserStatusEnum status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
