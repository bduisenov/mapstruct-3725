package mapstruct.mapper;

import mapstruct.valueobject.ValueObject;
import org.mapstruct.TargetType;

import java.lang.reflect.InvocationTargetException;

public interface ValueObjectMapper {

    static <T> T map(ValueObject<T> valueObject) {
        if (valueObject == null) {
            return null;
        }

        return valueObject.value();
    }

    static <VO extends ValueObject<?>> VO mapValueObject(Object value, @TargetType Class<VO> targetType) {
        if (value == null) {
            return null;
        }

        if (targetType.isInstance(value)) {
            return targetType.cast(value);
        }

        if (ValueObject.class.isAssignableFrom(targetType)) {
            try {
                final var factoryMethod = targetType.getMethod("valueOf", value.getClass());
                final var valueObject = factoryMethod.invoke(null, value);

                return targetType.cast(valueObject);
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                return sneakyThrow(e);
            }
        }

        throw new UnsupportedOperationException("Should not reach this point");
    }

    @SuppressWarnings({"unchecked", "TypeParameterUnusedInFormals"})
    private static <T, E extends Throwable> T sneakyThrow(Throwable e) throws E {
        throw (E) e;
    }
}