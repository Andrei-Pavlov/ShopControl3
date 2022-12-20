/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Product;
import entity.repository.ProductFacade;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ProductManager {
    private final Scanner scanner = new Scanner(System.in);
    public Product createProduct(){
        Product product = new Product();
        System.out.print("Название: ");
        product.setName(scanner.nextLine());
        System.out.print("Количество: ");
        product.setQuantity(scanner.nextInt());
        System.out.print("Цена: ");
        product.setPrice(scanner.nextInt());
        return product;
    }
    

    public void printListProduct() {
        ProductFacade productFacade = new ProductFacade();
        List<Product> products = productFacade.findALL();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.printf("%d.%s%s%n %s%s%n %s%s%n"
                    ,product.getId()
                    ,"Название - "
                    ,product.getName()
                    ," Количество - "
                    ,product.getQuantity()
                    ,"Цена - "
                    ,product.getPrice()
            );
        }
    }
}
