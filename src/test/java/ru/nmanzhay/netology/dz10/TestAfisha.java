package ru.nmanzhay.netology.dz10;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAfisha {
    @Test
    public void positiveAddName() {
        ManagerAfisha manager = new ManagerAfisha();
        manager.addName("Бладшот");
        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void emptyFindAll() {
        ManagerAfisha manager = new ManagerAfisha();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void threeAddName() {
        ManagerAfisha manager = new ManagerAfisha();
        manager.addName("Бладшот");
        manager.addName("Film2");
        manager.addName("Film3");
        String[] expected = {"Бладшот","Film2","Film3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void positiveFindLast() {
        ManagerAfisha manager = new ManagerAfisha(3);
        manager.addName("Бладшот");
        manager.addName("Film2");
        manager.addName("Film3");
        manager.addName("Film4");
        manager.addName("Film5");
        String[] expected = {"Film5", "Film4", "Film3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void emptyFindLast() {
        ManagerAfisha manager = new ManagerAfisha();
        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void positiveDefaltFindLast() {
        ManagerAfisha manager = new ManagerAfisha();
        manager.addName("Бладшот");
        manager.addName("Film2");
        manager.addName("Film3");
        manager.addName("Film4");
        manager.addName("Film5");
        String[] expected = {"Film5", "Film4", "Film3","Film2","Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
