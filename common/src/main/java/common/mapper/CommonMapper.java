package common.mapper;

public interface CommonMapper<E, D> {

    E toEntity(D dto);

    D toDTO(E entity);
}
