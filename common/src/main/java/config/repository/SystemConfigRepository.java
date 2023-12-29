package config.repository;

import common.repository.CommonRepository;
import config.entity.SystemConfig;

public interface SystemConfigRepository extends CommonRepository<SystemConfig, Long> {

    SystemConfig findByTypeAndLabel(String type, String label);
}
