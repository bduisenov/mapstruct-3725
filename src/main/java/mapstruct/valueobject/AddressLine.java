package mapstruct.valueobject;

public class AddressLine implements ValueObject<String> {

    private final String value;

    private AddressLine(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

    public static AddressLine valueOf(String value) {
        return new AddressLine(value);
    }
}
