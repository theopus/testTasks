package task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class Task1Main {

    public static void main(String[] args) {
        FishSaleOperation fishSaleOperation1 = new FishSaleOperation(
                "Amur",
                1,
                new Date(),
                4,
                new Date(),
                2,1);

        FishSaleOperation fishSaleOperation2 = new FishSaleOperation(
                "Amur",
                3,
                new Date(),
                6,
                new Date(),
                2,5);

        FishSaleOperation fishSaleOperation3 = new FishSaleOperation(
                "Karp",
                4,
                new Date(new Date().getTime() - 1000 * 3600 * 24 * 2),
                11,
                new Date(),
                1,6);

        FishSaleOperation fishSaleOperation4 = new FishSaleOperation(
                "Shark",
                5,
                new Date(new Date().getTime() - 1000 * 3600 * 24 * 5),
                30,
                new Date(),
                3,6);

        FishSaleOperation fishSaleOperation5 = new FishSaleOperation(
                "Shark",
                5,
                new Date(new Date().getTime() - 1000 * 3600 * 24 * 6),
                15,
                new Date(),
                3,6);


        List<FishSaleOperation> fishSaleOperationList = new ArrayList<>();
        fishSaleOperationList.add(fishSaleOperation2);
        fishSaleOperationList.add(fishSaleOperation4);
        fishSaleOperationList.add(fishSaleOperation3);
        fishSaleOperationList.add(fishSaleOperation1);
        fishSaleOperationList.add(fishSaleOperation5);


        Map<String, Double> incomeStatement = FishSaleOperation.getIncomeStatement(fishSaleOperationList);

        System.out.println(incomeStatement);


    }
}
