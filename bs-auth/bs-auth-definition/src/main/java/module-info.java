module bs.auth.definition {
    exports com.mainul35.auth.dtos;
    requires lombok;
    requires spring.boot.starter.data.jpa;
    requires spring.data.commons;
    requires java.persistence;
}