package com.kodilla.collections.adv.maps.homework;
import java.util.Objects;

//Zad. 5.2. Szkoły i dyrektorzy

public class Principal {
    String principalName;

    public Principal(String principalName) {
        this.principalName = principalName;
    }

    public String getPrincipalName() {
        return principalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(principalName, principal.principalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "principalName='" + principalName + '\'' +
                '}';
    }
}
