package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("School library");
        Book book1 = new Book("The secret book", "Mike Mayers", LocalDate.of(2003, 10, 2));
        Book book2 = new Book("Samba", "Ricardo Estebio", LocalDate.of(1967, 05, 13));
        Book book3 = new Book("Over the sun", "Nicolaus Copernicus", LocalDate.of(1997, 12, 2));
        Book book4 = new Book("Setting the bat", "William Cherry", LocalDate.of(1978, 02, 17));
        //When
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book4);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cunnington library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Hatchings library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book1);
        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());


    }
}
