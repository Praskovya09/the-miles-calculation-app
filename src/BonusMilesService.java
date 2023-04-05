public class BonusMilesService {
    public int calculate (int price) {
        int pricePerMile = 20;
        int accrucedBonuses = price / pricePerMile;
        return accrucedBonuses;
    }
}
