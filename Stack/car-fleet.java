import java.util.Comparator;
import java.util.Arrays;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        double[] time = new double[ position.length ];
        double[] time_sorted = new double[ position.length ];

        for( int i=0; i< position.length; i++){
            time[i] = (target - position[i])*1.0/ speed[i];
        }

        Integer[] index = new Integer[ position.length];

        for( int i = 0; i < index.length; i++){
            index[i] = i;
        }


        Comparator<Integer> comparator = new Comparator<Integer>(){

            @Override
            public int compare( Integer i1, Integer i2){
                return Integer.valueOf(position[i1]).compareTo(Integer.valueOf(position[i2]));
            }
        };

        Arrays.sort(index,comparator); 

        for (int i=0; i< index.length; i++){
            time_sorted[i] = time[index[i]];
        }

        int distinct_value = 0;
 

        for(int i= time_sorted.length - 2; i>= 0 ;i--){
            if( time_sorted[i] <= time_sorted[i+1])
                time_sorted[i] = time_sorted[i+1];
            else
                distinct_value++;
        }
 

        


        return distinct_value+1;

    }
}