package ru.job4j.lambda;

import java.util.Objects;

public class Address {
   public String city;
   public String street;
   public int home;
   public int apartment;

   public String getCity() {
      return city;
   }

   public String getStreet() {
      return street;
   }

   public int getHome() {
      return home;
   }

   public int getApartment() {
      return apartment;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Address address = (Address) o;
      return home == address.home &&
              apartment == address.apartment &&
              city.equals(address.city) &&
              street.equals(address.street);
   }

   @Override
   public int hashCode() {
      return Objects.hash(city, street, home, apartment);
   }
}
