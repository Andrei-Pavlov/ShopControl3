/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

//import entity.Customer;
//import entity.Product;
import entity.repository.CustomerFacade;
import entity.repository.ProductFacade;
import java.util.Scanner;
import managers.CustomerManager;
import managers.ProductManager;

/**
 *
 * @author pupil
 */



public class App {
    private final ProductFacade productFacade;
    private final CustomerFacade customerFacade;
    private final CustomerManager customerManager;
    private final ProductManager productManager;
    
    
    public App() {
        productManager = new ProductManager();
        productFacade = new ProductFacade();
        customerFacade = new CustomerFacade();
        customerManager = new CustomerManager();
    }
    
    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        
        do{ 
            System.out.println("Выберите задачу из списка: ");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить товар");
            System.out.println("2. Добавить покупателя");
            System.out.println("3. Товары");
            System.out.println("4. Покупатели");
            System.out.println("5. Покупка");
            System.out.println("6. Доход магазина");
            System.out.println("7. Добавление денег покупателю");
            
            
            int task = scanner.nextInt();
            
            switch(task){
                case 0:
                    repeat = false;
                    System.out.println("Пока!");
                    break;
                case 1:
                    System.out.println("Введите данные товара");
                    productFacade.save(productManager.createProduct());
                    
                    break;
                case 2:
                    System.out.println("Добавление покупателя");
                    customerFacade.save(customerManager.createCustomer());
                    break;
                case 3:
                    System.out.println("Товары");
                    productManager.printListProduct();
                    
                    break;
                case 4:
                    System.out.println("Покупатели");
                    customerManager.printListCustomer();
                        
                    
                    break;
                case 5:
                    System.out.println("Покупка");
                    System.out.println("Customer List");
                  
                    System.out.println("Товары");

                    break;
                case 6:
                    System.out.println("Доход магазина");
                    
                   
                    break;
                case 7:
                    
                    break;
                    
                default:
                    System.out.println("Выберите задачу из списка: ");
                
            }
            System.out.println("======================================");
        }while(repeat);
    }
}
