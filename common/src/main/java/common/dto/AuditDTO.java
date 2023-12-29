package common.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class AuditDTO {

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
