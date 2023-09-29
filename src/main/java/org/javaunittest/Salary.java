package org.javaunittest;

public class Salary {

    public double hitungPajak(double salary){
        double pajak = 0;
        double persentasePajak = 0;

        if (salary >= 7000) {
            persentasePajak = 0.07;
            pajak = salary * persentasePajak;
            System.out.println("Pajaknya yang harus dibayar:"+pajak);

        }else {
            System.out.println("tidak kena pajak");
        }
        return pajak;
    }


    public double gajiBersih (double grossSalary, double pajak){
        return  grossSalary - pajak ;
    }
}
