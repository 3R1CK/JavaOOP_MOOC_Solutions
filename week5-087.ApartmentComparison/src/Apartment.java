
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment compared) {
        if (this.rooms > compared.rooms) {
            return true;
        }

        if (this.rooms == compared.rooms && this.squareMeters > compared.squareMeters) {
            return true;
        }

        if (this.rooms == compared.rooms && this.squareMeters == compared.squareMeters
                && this.pricePerSquareMeter > compared.pricePerSquareMeter) {

            return true;

        }
        return false;
    }
    
    public int priceDifference(Apartment otherApartment){
        int thisFlatPrice = this.squareMeters * this.pricePerSquareMeter;
        int comparedFlatPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return Math.abs(thisFlatPrice-comparedFlatPrice);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        int thisFlatPrice = this.squareMeters * this.pricePerSquareMeter;
        int comparedFlatPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        if(thisFlatPrice>comparedFlatPrice){
            return true;
        }
        
        return false;
    }
}
