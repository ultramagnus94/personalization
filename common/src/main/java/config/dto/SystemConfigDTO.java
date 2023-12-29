package config.dto;

import lombok.Data;

@Data
public class SystemConfigDTO {

    private Long id;

    private String type;

    private String key;

    private String value;
}
