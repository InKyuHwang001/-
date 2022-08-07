//클래스

//클래스는 서로 연관된 변수와 메소드를 묶어 놓은 것이다.
//변수가 많을 때 묶어주는 역활

//인스턴스

//하나의 클래스를 복제하여 서로 '다른 데이터의 값'과 '같은 메소드'를 가진 복재본을 만드는 것이다.
class Accounting{
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;
    public void print() {
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDiviend1());
        System.out.println("Dividend 2 : " + getDiviend2());
        System.out.println("Dividend 3 : " + getDiviend3());
    }
 
    public double getDiviend1() {
        return getIncome() * 0.5;
    }
    public double getDiviend2() {
        return getIncome() * 0.3;
    }
    public double getDiviend3() {
        return getIncome() * 0.2;
    }
 
    public double getIncome() {
        return valueOfSupply - getExpense();
    }
 
    public double getExpense() {
        return valueOfSupply * expenseRate;
    }
 
    public double getTotal() {
        return valueOfSupply + getVAT();
    } 
 
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
}
public class AccountingClassApp {
     
    public static void main(String[] args) {
        // instance 
        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0;
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();
         
        Accounting a2 = new Accounting();
        a2.valueOfSupply = 20000.0;
        a2.vatRate = 0.05;
        a2.expenseRate = 0.2;
        a2.print();
         
        a1.print();
    }
}
