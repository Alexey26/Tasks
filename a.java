package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class a {
    public static void main(String[] args) {
        Users[] p = new Users[3];

        p[0] = new Users();
        p[0].setName("William");
        p[0].setSurname("Lebedev");
        p[0].setOld(23);

        p[1] = new Users();
        p[1].setName("Maxim");
        p[1].setSurname("Petrov");
        p[1].setOld(27);

        p[2] = new Users();
        p[2].setName("Danila");
        p[2].setSurname("Ivanov");
        p[2].setOld(28);

        Arrays.sort(p, new SortedByName());
        for (Users i : p) {
            System.out.println("Name: " + i.getName() +
                    " Surname: " + i.getSurname() +
                    " Old: " + i.getOld());
        }
    }

    public static class Users {
        String name;
        String surname;
        int old;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getOld() {
            return old;
        }

        public void setOld(int old) {
            this.old = old;
        }
    }

    static class SortedByName implements Comparator<Users> {

        public int compare(a.Users obj1, a.Users obj2) {

            String str1 = obj1.getName();
            String str2 = obj2.getName();

            return str1.compareTo(str2);
        }
    }
}
