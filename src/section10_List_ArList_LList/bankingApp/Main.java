package section10_List_ArList_LList.bankingApp;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("KB");
        Customer cust1 = new Customer("Ivanov Ivan", 1000);
        Customer cust2 = new Customer("Petrov Petr");
        Customer cust3 = new Customer("Black Jack", 10);    //I did not add this customer to the Bank

        bank1.addCustomer(cust1);   //Customer IVANOV IVAN not found
                                    //New customer added: Customer{name='IVANOV IVAN', transactions=[1000.0]}
        bank1.addCustomer(cust2);   //Customer PETROV PETR not found
                                    //New customer added: Customer{name='PETROV PETR', transactions=[200.0]}

        bank1.addCustomer("Sidorov Sergey", 30000); //Customer Sidorov Sergey not found
                                                                            //New customer added: Customer{name='SIDOROV SERGEY', transactions=[30000.0]}

        bank1.addTransaction(cust1, 25000);
        System.out.println(cust1);  //Customer{name='IVANOV IVAN', transactions=[1000.0, 25000.0]}

        System.out.println(cust2);  //Customer{name='PETROV PETR', transactions=[200.0]}
        System.out.println(bank1);  //Bank{name='KB', customers=[Customer{name='IVANOV IVAN', transactions=[1000.0, 25000.0]}, Customer{name='PETROV PETR', transactions=[200.0]}, Customer{name='SIDOROV SERGEY', transactions=[30000.0]}]}

        System.out.println(cust1.getTransactions());    //[1000.0, 25000.0]
        bank1.addTransaction("Ivanov Ivan", -100);
        System.out.println(cust1.getTransactions());    //[1000.0, 25000.0, -100.0]
        bank1.addTransaction(cust1, -20);
        System.out.println(cust1.getTransactions());    //[1000.0, 25000.0, -100.0, -20.0]

        bank1.printCustomer("Ivanov Ivan");
        //IVANOV IVAN
        //[1000.0, 25000.0, -100.0, -20.0]
        //$             1000,00 (credit)
        //$            25000,00 (credit)
        //$             -100,00 (debit)
        //$              -20,00 (debit)

        bank1.addTransaction(cust3, 100);   //Customer BLACK JACK not found
        bank1.addTransaction("N Mary", 100);   //Customer N Mary not found
        bank1.printCustomer("N Mary");          //Customer N Mary not found
    }


}
