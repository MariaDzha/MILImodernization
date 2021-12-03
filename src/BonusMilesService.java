public class BonusMilesService {

    public int calculate(int price) {
        int amountForOneMile = 20;
        int miles = price / amountForOneMile;
        return miles;
    }
}
