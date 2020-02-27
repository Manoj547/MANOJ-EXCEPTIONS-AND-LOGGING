package org.epamLOGGER.Cost;

public class Cost {
    private int type;
    private double area;

    public Cost(int type, double area) {
        this.type = type;
        this.area = area;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    static int totalCost(int type)
    {
        int rCost=0;
        switch(type)
        {
            case 1:
			rCost=45000;
			break;
            case 2:
			rCost=89300;
            break;
            case 3:
			rCost=5930;
            break;
            case 4:
			rCost=348740;
            break;
            default:
			rCost=0;
            break;
        }
        return rCost;
    }
    public double calculateTotalCost() {
        int costPerFt = Cost.totalCost(this.type);
        return costPerFt*this.area;
    }
}