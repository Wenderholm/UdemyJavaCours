package com.company.javaCollection.BasketCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new HashMap<>();
    }

    public int addStock(StockItem item){
//        jeżeli dodawany item jest różny od null
        if(item != null){

            StockItem inStock = list.getOrDefault(item.getName(), item);

            if (inStock != item){
                item.adjustStock(inStock.quantityInStock());
            }
            list.put(item.getName(),item);
            return item.quantityInStock();
        }
        return 0;
    }
// sprzedaż obiektu (itemu ) ze zmiana pojemności/dostępności
    public int sellStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item,null);
        if((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

//    wyciągnięcie nazwy obiektu z mapy przez jego klucz
    public StockItem get(String key){
        return list.get(key);
    }
//zabezpieczenie przed możliwością zmianby kolekcji
    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock list\n";
        double totalCost = 0.0;
//        przejscie po wszystkich elementach listy z wyciagnięciem klucza i wartości
        for(Map.Entry<String,StockItem> item : list.entrySet()){
            StockItem stockItem = item.getValue();
            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
//            wpianie string.format do zaokrąglenia wyniku do dwóch miejsc po przecinku
            s = s + String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;

        }
        return s + "Total stock value: " + totalCost;
    }
}
