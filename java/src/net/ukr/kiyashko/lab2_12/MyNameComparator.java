package net.ukr.kiyashko.lab2_12;

import java.util.Comparator;

 class MyNameComparator<P> implements Comparator<MyPhoneBook.PhoneNumber> {
    public int  compare(MyPhoneBook.PhoneNumber a, MyPhoneBook.PhoneNumber b){
                return a.name.compareTo(b.name);
    }


     // public abstract int compare(MyPhoneBook.PhoneNumber o1, MyPhoneBook.PhoneNumber o2);
}
