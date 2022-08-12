package com.example.geektrust;

public class Grid {
    public  int calculateMinimumPower(Point source,Point destination)
    {
        int turns=0,xt=0,yt=0,result;
            if (destination.getxCoordinate() == source.getxCoordinate()){
                yt=Math.abs(destination.getyCoordinate()- source.getyCoordinate());
                turns++;
            }
            else if (destination.getxCoordinate() > source.getxCoordinate()){
                xt = Math.abs(destination.getxCoordinate() - source.getxCoordinate());
                turns++;
            }else {
                xt = Math.abs(source.getxCoordinate() - destination.getxCoordinate());
                turns++;
            }
            if (destination.getyCoordinate() == source.getyCoordinate()){
                xt=Math.abs(destination.getxCoordinate()-source.getxCoordinate());
                turns++;
            }
            else if (destination.getyCoordinate() < source.getyCoordinate()){
                yt = Math.abs(destination.getyCoordinate() - source.getyCoordinate());
                turns++;
            }else{
                yt = Math.abs(source.getyCoordinate() - destination.getyCoordinate());
                turns++;
            }

            result = (((xt+yt)*10)+(turns*5)) ;

        return result;
    }
}
