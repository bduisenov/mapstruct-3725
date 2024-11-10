package mapstruct;

import java.util.List;

public class UserEntity {

    List<AddressEntity> addresses;

    public List<AddressEntity> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressEntity> addresses) {
        this.addresses = addresses;
    }

    public static class AddressEntity {
        List<String> addressLines;

        public List<String> getAddressLines() {
            return addressLines;
        }

        public void setAddressLines(List<String> addressLines) {
            this.addressLines = addressLines;
        }
    }
}
