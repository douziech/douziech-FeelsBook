
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
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chronoRecord(View v){
        //Toast.makeText(this, "Record of emotions...", Toast.LENGTH_SHORT).show();
        Intent intentChrono = new Intent(MainActivity.this, ChronoRecordActivity.class);
        startActivity(intentChrono);
    }

    public void recordFeeling(View v){
        //Toast.makeText(this, "Record of emotions...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, recordFeelingActivity.class);
        startActivity(intent);
    }

    public void emotionCount(View v){
        //Toast.makeText(this, "Record of emotions...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, emotionCountActivity.class);
        startActivity(intent);
    }


}
