package com.kodilla.collections.adv.maps.homework;
import java.util.Objects;

public class Principal {

    private String principalName;

    public Principal(String principalName) {
        this.principalName = principalName;    }

    public String getPrincipalName() {
        return principalName;    }

    @Override
    public int hashCode() {
        return Objects.hash(principalName);    }
}
