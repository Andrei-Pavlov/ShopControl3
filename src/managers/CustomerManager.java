/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Customer;
import entity.repository.CustomerFacade;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CustomerManager {
    private final Scanner scanner = new Scanner(System.in);
    public Customer createCustomer(){
        Customer customer = new Customer();
        System.out.print("Имя: ");
        customer.setFirstname(scanner.nextLine());
        System.out.print("Фамилия: ");
        customer.setLastname(scanner.nextLine());
        System.out.print("Деньги: ");
        customer.setCash(scanner.nextInt());
        return customer;
    }
    

    public void printListCustomer() {
        CustomerFacade customerFacade = new CustomerFacade();
        List<Customer> customers = customerFacade.findALL();
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.printf("%d.%s%s%n %s%s%n %s%s%n"
                    ,customer.getId()
                    ,"Имя - "
                    ,customer.getFirstname()
                    ,"Фамилия - "
                    ,customer.getLastname()
                    ,"Деньги - "
                    ,customer.getCash()
            );
        }
    }
}

