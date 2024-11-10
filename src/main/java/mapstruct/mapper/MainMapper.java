package mapstruct.mapper;

import mapstruct.UserEntity;
import mapstruct.UserModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        uses = ValueObjectMapper.class,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface MainMapper {

    UserModel map(UserEntity source);
}

