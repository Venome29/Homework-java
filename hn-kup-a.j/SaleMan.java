//Ex4
public class SaleMan {
    int id;
    String name;
    int sale;
    public static void main(String[] arg) {

        SaleMan SaleOne = new SaleMan();
        SaleOne.id = 888;
        SaleOne.name = "Mr. Boy ";
        SaleOne.sale = 30000;

        SaleMan SaleTwo = new SaleMan();
        SaleTwo.id = 5555;
        SaleTwo.name = "Mr. jonh ";
        SaleTwo.sale = 50000;

        System.out.println("SaleOne ID = " + SaleOne.id + ", Name = " + SaleOne.name + ", Sale = " + SaleOne.sale);
        System.out.println("SaleTwo ID = " + SaleTwo.id + ", Name = " + SaleTwo.name + ", Sale = " + SaleTwo.sale);
    }
}