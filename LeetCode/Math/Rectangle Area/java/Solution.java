class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int WidA = ax2 - ax1;
        int heigA = ay2 - ay1;
        int AreaA = (WidA * heigA);

        int Widb = bx2 - bx1;
        int heigB = by2 - by1;
        int AreaB = Widb * heigB;

        int overlapX = Math.max(ax1,bx1);
        int overlapX1 = Math.min(ax2,bx2);

        int overlapY = Math.max(ay1,by1);
        int overlapY1 = Math.min(ay2,by2);

        int OverW = overlapX1 - overlapX;
        int OverH = overlapY1 - overlapY;

        int OverA = 0;
        if(OverW > 0 && OverH > 0){
            OverA = OverW * OverH;
        }

        int TotalArea = AreaA + AreaB -OverA;
        return TotalArea;
    }

}