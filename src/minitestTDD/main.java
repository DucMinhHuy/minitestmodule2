package minitestTDD;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Material material = new CrispyFlour(2, "bot ga", LocalDate.of(2016, 5, 6), 24, 1);
        Material material1 = new CrispyFlour(1, "bot tom", LocalDate.of(2018, 6, 8), 12, 2);
        Material material2 = new CrispyFlour(3, "bot gao", LocalDate.of(2015, 5, 8), 22, 5);
        Material material3 = new CrispyFlour(4, "bot banh beo", LocalDate.of(2019, 8, 8), 52, 6);
        Material material4 = new CrispyFlour(5, "bot ngo", LocalDate.of(2012, 9, 8), 72, 7);
        Material material5 = new Meat(5, "conga", LocalDate.of(2020, 4, 16), 2345, 12);
        Material material6 = new Meat(6, "conga", LocalDate.of(2019, 5, 17), 2345, 14);
        Material material7 = new Meat(23, "conga", LocalDate.of(2022, 3, 6), 2345, 16);
        Material material8 = new Meat(45, "conga", LocalDate.of(2021, 8, 6), 2345, 18);
        Material material9 = new Meat(12, "conga", LocalDate.of(2022, 9, 26), 2345, 19);
        Material[] list={material,material1,material2,material3,material4,material5,material6,material7,material8,material9};

    }
}
