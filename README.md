Run the following command to reproduce the issue:
```bash
./mvnw compile
```

Generated code with mapstruct 1.6.3

```java
@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2024-11-10T13:47:32+0100",
        comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Eclipse Adoptium)"
)
public class MainMapperImpl implements MainMapper {

    @Override
    public UserModel map(UserEntity source) {
        if ( source == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setAddresses( ValueObjectMapper.map( ValueObjectMapper.mapValueObject( source.getAddresses(), ValueObject.class ) ) );

        return userModel;
    }
}
```


Generated code with mapstruct 1.5.5.Final

```java
@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2024-11-10T13:48:00+0100",
        comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Eclipse Adoptium)"
)
public class MainMapperImpl implements MainMapper {

    @Override
    public UserModel map(UserEntity source) {
        if ( source == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setAddresses( addressEntityListToAddressModelList( source.getAddresses() ) );

        return userModel;
    }

    protected List<AddressLine> stringListToAddressLineList(List<String> list) {
        if ( list == null ) {
            return null;
        }

        List<AddressLine> list1 = new ArrayList<AddressLine>( list.size() );
        for ( String string : list ) {
            list1.add( ValueObjectMapper.mapValueObject( string, AddressLine.class ) );
        }

        return list1;
    }

    protected UserModel.AddressModel addressEntityToAddressModel(UserEntity.AddressEntity addressEntity) {
        if ( addressEntity == null ) {
            return null;
        }

        UserModel.AddressModel addressModel = new UserModel.AddressModel();

        addressModel.setAddressLines( stringListToAddressLineList( addressEntity.getAddressLines() ) );

        return addressModel;
    }

    protected List<UserModel.AddressModel> addressEntityListToAddressModelList(List<UserEntity.AddressEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<UserModel.AddressModel> list1 = new ArrayList<UserModel.AddressModel>( list.size() );
        for ( UserEntity.AddressEntity addressEntity : list ) {
            list1.add( addressEntityToAddressModel( addressEntity ) );
        }

        return list1;
    }
}
```