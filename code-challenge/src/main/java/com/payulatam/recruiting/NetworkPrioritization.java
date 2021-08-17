package com.payulatam.recruiting;
import com.sun.tools.javac.util.ArrayUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NetworkPrioritization {
    int[] data;
    
    public enum Criteria {
        RESPONSE_TIME, COST;
    }

    public int[] prioritizeNetwork(int[] responseTimes, int[] cost, Criteria priority) {
        
        DataNetwork dataNetwork = new DataNetwork(responseTimes, cost);
        Criteria crit = priority;
        
        if(crit == Criteria.RESPONSE_TIME){
            this.data = OrderByResponseTime(dataNetwork);
        }else{
            this.data = OrderByCost(dataNetwork);
        }
        
        return this.data;
    }
    
    //methos order the array by response time
    public int[] OrderByResponseTime(DataNetwork dataNetwork){
        int[] dataDesordenada = dataNetwork.getArrayTimes();
        int[] dataOrdenada = dataDesordenada.clone();
        
        Arrays.sort(dataOrdenada);
        newListPositions(dataDesordenada, dataNetwork);
        indexOfArrays(dataNetwork.getDataList(), dataOrdenada, dataNetwork); 
        
        return dataNetwork.getNetworkPosition();
    }
    
    //method order the array by cost
    public int[] OrderByCost(DataNetwork dataNetwork){
        int[] dataDesordenada = dataNetwork.getArrayCost();
        int[] dataOrdenada = dataDesordenada.clone();
        
        Arrays.sort(dataOrdenada);
        newListPositions(dataDesordenada, dataNetwork);
        indexOfArrays(dataNetwork.getDataList(), dataOrdenada, dataNetwork); 
        
        return dataNetwork.getNetworkPosition();
    }
    
    
    //create a new list whit the positions in the array
    public void newListPositions(int[] dataDesordenada, DataNetwork dataNetwork){
        List<Integer> dataList = new ArrayList<Integer>();
        
        for (int i = 0; i < dataDesordenada.length; i++) {
            dataList.add(dataDesordenada[i]);
        }
        dataNetwork.setDataList(dataList);
    }
    
    //order by index of arrays
    public void indexOfArrays(List dataList, int[] dataOrdenada, DataNetwork dataNetwork){
        int[] networkPosition = new int[6];
        for (int j = 0; j < dataOrdenada.length; j++) {
            int posicion = dataList.indexOf(dataOrdenada[j]);
            networkPosition[j] = posicion;
        } 
        
        dataNetwork.setNetworkPosition(networkPosition);
    }
}
