package config.impl;

import config.SystemConfigService;
import config.dto.SystemConfigDTO;
import config.dto.SystemConfigFilter;
import config.repository.SystemConfigRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class SystemConfigServiceImpl implements SystemConfigService {

    private final SystemConfigRepository systemConfigRepository;

    @Override
    public Page<SystemConfigDTO> getConfig(SystemConfigFilter filter) {

        return null;
    }

    @Override
    public SystemConfigDTO add(SystemConfigDTO dto) {

        return null;
    }

    @Override
    public void update(SystemConfigDTO dto) {

    }

    @Override
    public void delete(Long id) {
        systemConfigRepository.deleteById(id);
        log.info("Config id {} has been deleted", id);
    }

    @Override
    public SystemConfigDTO getByTypeAndLabel(String type, String label) {
        return null;
    }
}
