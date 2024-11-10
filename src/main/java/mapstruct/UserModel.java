package mapstruct;

import mapstruct.valueobject.AddressLine;

import java.util.List;

public class UserModel {
    List<AddressModel> addresses;

    public List<AddressModel> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressModel> addresses) {
        this.addresses = addresses;
    }

    public static class AddressModel {
        List<AddressLine> addressLines;

        public List<AddressLine> getAddressLines() {
            return addressLines;
        }

        public void setAddressLines(List<AddressLine> addressLines) {
            this.addressLines = addressLines;
        }
    }
}
