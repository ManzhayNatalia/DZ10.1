package ru.nmanzhay.netology.dz10;
public class ManagerAfisha {
    private String[] filmNames = new String[0];
    private int maxLimit = 10;


    public ManagerAfisha() {
    }

    public ManagerAfisha(int maxLimit) {
        this.maxLimit = maxLimit;
    }


    public void addName(String filmName) {
        String[] tmp = new String[filmNames.length + 1];
        for (int i = 0; i < filmNames.length; i++) {
            tmp[i] = filmNames[i];
        }
        tmp[tmp.length - 1] = filmName;
        filmNames = tmp;
    }

    public String[] findAll() {
        for (int i = 0; i < filmNames.length; i++) {
            System.out.println(filmNames[i]);
        }
        return filmNames;
    }

    public String[] findLast() {
        int resultLength;
        if (maxLimit > filmNames.length) {
            resultLength = filmNames.length;
        } else {
            resultLength = maxLimit;
        }
        String[] result = new String[resultLength];
        int j = 0;
        for (int i = filmNames.length - 1; i > filmNames.length - resultLength - 1; i--) {
            result[j] = filmNames[i];
            j++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;

    }


}
