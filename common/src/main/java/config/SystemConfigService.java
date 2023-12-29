package config;

import config.dto.SystemConfigDTO;
import config.dto.SystemConfigFilter;
import org.springframework.data.domain.Page;

public interface SystemConfigService {

    Page<SystemConfigDTO> getConfig(SystemConfigFilter filter);

    SystemConfigDTO add(SystemConfigDTO dto);

    void update(SystemConfigDTO dto);

    void delete(Long id);

    SystemConfigDTO getByTypeAndLabel(String type, String label);
}
