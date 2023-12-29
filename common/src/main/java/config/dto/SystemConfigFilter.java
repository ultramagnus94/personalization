package config.dto;

import common.dto.BaseFilter;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SystemConfigFilter extends BaseFilter {

    private String type;

    private String key;
}
