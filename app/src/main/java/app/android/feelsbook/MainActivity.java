
/* FeelsBook : An application to record and track emotions as they arise.
   Copyright (C) 2018 D.M.Douziech; douziech@ualberta.ca

    FeelsBook is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.

*/

/* FeelsBook : An application to record and track emotions as they arise.
   Copyright (C) 2018 D.M.Douziech; douziech@ualberta.ca

    FeelsBook is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.

*/


package app.android.feelsbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    //VIEWS:

    public void chronoRecord(View v){
        Toast.makeText(this, "Record of emotions...", Toast.LENGTH_SHORT).show();
        Intent intentChrono = new Intent(MainActivity.this, ChronoRecordActivity.class);
        startActivity(intentChrono);
    }

    public void recordFeeling(View v) {

        RecordFeeling_Controller controller = new RecordFeeling_Controller();

        String ResourceIdAsString = v.getResources().getResourceName(v.getId());
        Log.i("v", ResourceIdAsString);

        int vInteger = v.getId();


        switch (vInteger) {
            case (R.id.loveButton):
                String feeling_love = "LOVE";
                controller.insertRecord(feeling_love);
                break;
            case (R.id.joyButton):
                String feeling_joy = "JOY";
                controller.insertRecord(feeling_joy);
                break;
            case (R.id.surpriseButton):
                String feeling_surprise = "SURPRISE";
                controller.insertRecord(feeling_surprise);
                break;
            case (R.id.angerButton):
                String feeling_anger = "ANGER";
                controller.insertRecord(feeling_anger);
                break;
            case (R.id.sadnessButton):
                String feeling_sadness = "SADNESS";
                controller.insertRecord(feeling_sadness);
                break;
            case (R.id.fearButton):
                String feeling_fear = "FEAR";
                controller.insertRecord(feeling_fear);
                break;
        }

        // Change screens
        Intent intent = new Intent(MainActivity.this, recordFeelingActivity.class);
        startActivity(intent);


    }

        public void emotionCount (View v){
            Toast.makeText(this, "Total count for each feeling...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, EmotionCountActivity.class);
            startActivity(intent);
        }

        //END_VIEWS:



}