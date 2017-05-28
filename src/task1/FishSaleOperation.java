package task1;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class FishSaleOperation{

    private String fishName;
    private double priceOfPurchase;
    private Date dateOfPurchase;
    private double priceOfSale;
    private Date dateOfSale;
    private double overheads;
    private double saleWeight;



    public FishSaleOperation(String fishName, double priceOfPurchase, Date dateOfPurchase, double priceOfSale, Date dateOfSale, double overheads, double saleWeight) {
        if (saleWeight <= 0 || priceOfPurchase <= 0|| priceOfSale <= 0) throw new IllegalArgumentException("saleWeight/priceOfPurchase/priceOfSale <= 0");
        if (dateOfSale.getTime() < dateOfPurchase.getTime()) throw new IllegalArgumentException("DateOfSale before DateOfPurchase!");

        this.fishName = fishName;
        this.priceOfPurchase = priceOfPurchase;
        this.dateOfPurchase = dateOfPurchase;
        this.priceOfSale = priceOfSale;
        this.dateOfSale = dateOfSale;
        this.overheads = overheads;
        this.saleWeight = saleWeight;
    }



    public double getIncome(){
        int storeDays = (int)((dateOfSale.getTime() - dateOfPurchase.getTime()) / 1000 / 3600 / 24);
        return (priceOfSale - priceOfPurchase - storeDays * overheads) * saleWeight;

    }

    public static Map<String, Double> getIncomeStatement(List<FishSaleOperation> operations){
        Map<String, Double> statement = new TreeMap<>();

        for (FishSaleOperation fso : operations) {
            if (statement.containsKey(fso.fishName)){
                statement.put(fso.fishName, statement.get(fso.fishName) + fso.getIncome());

            }
            else statement.put(fso.fishName,fso.getIncome());
        }

        return statement;
    }

}
