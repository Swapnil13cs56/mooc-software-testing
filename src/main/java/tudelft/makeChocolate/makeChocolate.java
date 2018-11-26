package tudelft.makeChocolate;

public class makeChocolate {

    public int makeChocolates(int small, int big, int goal) {
         int maxBigBoxes = goal / 5;
         int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
         goal -= (bigBoxesWeCanUse * 5);
         if(small <= goal)
            return goal;
        return -1;
    }

}
