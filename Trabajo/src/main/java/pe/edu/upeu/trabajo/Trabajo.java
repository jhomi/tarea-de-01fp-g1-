/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pe.edu.upeu.trabajo;

import pe.edu.upeu.trabajo.command.Broker;
import pe.edu.upeu.trabajo.command.BuyStock;
import pe.edu.upeu.trabajo.command.SellStock;
import pe.edu.upeu.trabajo.command.Stock;

/**
 *
 * @author EMMANUEL
 */
public class Trabajo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
