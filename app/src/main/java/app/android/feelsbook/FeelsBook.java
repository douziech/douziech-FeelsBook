package app.android.feelsbook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;

//This has to be a persistent database.


public class FeelsBook extends RecordFeeling implements Serializable {

    private ArrayList<RecordFeeling> book;
    private Dictionary count_dicEmotions;


    //Constructor - this should only be called once to initially create the database.

    FeelsBook(){
        if (book.equals(null)){
            this.book = new ArrayList <RecordFeeling>();
            this.count_dicEmotions = new Dictionary() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public Enumeration keys() {
                    return null;
                }

                @Override
                public Enumeration elements() {
                    return null;
                }

                @Override
                public Object get(Object key) {
                    return null;
                }

                @Override
                public Object put(Object key, Object value) {
                    return null;
                }

                @Override
                public Object remove(Object key) {
                    return null;
                }
            }
        }



    }

    public void addFeeling(RecordFeeling entry){

        Object count = count_dicEmotions.get(entry.getFeeling());

        this.book.add(entry);

        //check if the emotion is already in the dic:
        if (count.equals(null)){
            count_dicEmotions.put(entry.getFeeling(), 1);
        } else {
            count =  (int) count + 1;
            count_dicEmotions.put(entry.getFeeling(), count);

        }
        count_dicEmotions.put(entry.getFeeling(), )

        //Perhaps add and exception handler here to check if the object-argument is indeed a RecordFeeling object.

        //Determine which feeling has been added and update the count accordingly.

    }



}
