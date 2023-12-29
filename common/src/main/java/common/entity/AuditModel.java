package common.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class AuditModel {

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
