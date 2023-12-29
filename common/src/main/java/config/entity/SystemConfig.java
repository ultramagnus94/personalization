package config.entity;

import common.entity.AuditModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "system_config")
@Entity
public class SystemConfig extends AuditModel {

    @Id
    private Long id;

    private String type;

    private String key;

    private String value;
}
