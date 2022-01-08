package Classwork21;

public class InternetMarketApi {
    public InternetMarket getCheepest(InternetMarket[] internetMarkets,Product product){
        double minPrice = 0;
        InternetMarket cheepestMarket = null;
        for (InternetMarket internetMarket : internetMarkets){
            double currentShipPrice = internetMarket.countShipPrice(product);
            if (minPrice == 0){
                minPrice = currentShipPrice;
                cheepestMarket = internetMarket;
            }
            if (minPrice > currentShipPrice){
                minPrice = currentShipPrice;
                cheepestMarket = internetMarket;
            }
        }
        return cheepestMarket;
    }
    public InternetMarket getFastest(InternetMarket[] internetMarkets,Product product){
        double minSpeed = 0;
        InternetMarket fastestMarket = null;
        for (InternetMarket internetMarket : internetMarkets){
            double currentSpeed = internetMarket.getShipSpeed();
            if (minSpeed == 0){
                minSpeed = currentSpeed;
                fastestMarket = internetMarket;
            }
            if (minSpeed > currentSpeed){
                minSpeed = currentSpeed;
                fastestMarket = internetMarket;
            }
        }
        return fastestMarket;
    }
    public InternetMarket getMostReliable(InternetMarket[] internetMarkets,Product product){
        double minRisk = 0;
        InternetMarket fastestmMarket = null;
        for (InternetMarket internetMarket : internetMarkets){
            double currentRisk = internetMarket.getlooseRisk(product);
            if (minRisk == 0){
                minRisk = currentRisk;
                fastestmMarket = internetMarket;
            }
            if (minRisk > currentRisk){
                minRisk = currentRisk;
                fastestmMarket = internetMarket;
            }
        }
        if (minRisk == 0){
            return null;
        }
        return fastestmMarket;
    }
    public InternetMarket getBest(InternetMarket[] internetMarkets,Product product){
        for (InternetMarket item : internetMarkets){
            item.setStars(0);
        }
        InternetMarket cheepest = getCheepest(internetMarkets,product);
        cheepest.setStars(cheepest.getStars() + 1);
        InternetMarket fastest = getFastest(internetMarkets,product);
        fastest.setStars(cheepest.getStars() + 1);
        InternetMarket mostReliable = getMostReliable(internetMarkets,product);
        if (mostReliable != null)
            mostReliable.setStars(cheepest.getStars() + 1);

        double maxStar = 0;
        InternetMarket theBest = null;
        for (InternetMarket internetMarket : internetMarkets){
            if (maxStar == 0){
                maxStar = internetMarket.getStars();
                theBest = internetMarket;
            }
            if (maxStar < internetMarket.getStars()){
                maxStar = internetMarket.getStars();
                theBest = internetMarket;
            }
        }
        System.out.println(theBest.getName() + " best for the " + product.getName());
        return theBest;
    }
}
