package Classwork21;

public class Main {
    public static void main(String[] args) {
        InternetMarket ozon = new InternetMarket(20,5,0.05,20,"Ozon");
        InternetMarket amazon = new InternetMarket(35,14,0.15,5,"Amazon");
        InternetMarket alibaba = new InternetMarket(10,9,0.15,14,"Alibaba");

        Product bycicle =  new Product(10001,200,"bycicle");
        Product skate = new Product(500,200,"skate");
        Product pizza = new Product(600,500,"pizza");

        InternetMarket[] internetMarkets = new InternetMarket[3];
        internetMarkets[0] = ozon;
        internetMarkets[1] = amazon;
        internetMarkets[2] = alibaba;

        InternetMarketApi internetMarketApi = new InternetMarketApi();
        internetMarketApi.getBest(internetMarkets,bycicle);
        internetMarketApi.getBest(internetMarkets,skate);
        internetMarketApi.getBest(internetMarkets,pizza);
    }
}
