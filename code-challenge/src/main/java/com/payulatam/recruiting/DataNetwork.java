package com.payulatam.recruiting;
import java.util.List;

public class DataNetwork {
    private int[] ArrayTimes;
    private int[] ArrayCost;
    private List<Integer> dataList;
    private int[] networkPosition;
    
    public DataNetwork(int[] ArrayTimes, int[] ArrayCost ){
        this.ArrayTimes = ArrayTimes;
        this.ArrayCost = ArrayCost;
    }

    
    public int[] getArrayTimes() {
        return ArrayTimes;
    }

    public void setArrayTimes(int[] ArrayTimes) {
        this.ArrayTimes = ArrayTimes;
    }

    public int[] getArrayCost() {
        return ArrayCost;
    }

    public void setArrayCost(int[] ArrayCost) {
        this.ArrayCost = ArrayCost;
    }

    public List<Integer> getDataList() {
        return dataList;
    }

    public void setDataList(List<Integer> dataList) {
        this.dataList = dataList;
    }

    public int[] getNetworkPosition() {
        return networkPosition;
    }

    public void setNetworkPosition(int[] networkPosition) {
        this.networkPosition = networkPosition;
    }
}
