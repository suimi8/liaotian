package com.fengwenyi.erwinchatroom.repository;

import com.fengwenyi.erwinchatroom.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author <a href="https://www.fengwenyi.com">Erwin Feng</a>
 * @since 2021-08-18
 */
public interface IRoomRepository extends JpaRepository<RoomEntity, String> {
}
