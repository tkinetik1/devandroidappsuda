/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView - tf
    private TextView mWeatherDataTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView - redo tf
        mWeatherDataTextView = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data - redo tf
        String[] weatherDatas =  new String[] {"First Christian Church - 80 S. 5th St, San Jose",
                "Milipitas Food Pantry - 0 S Market Street, Milpitas",
                "InnVision... The Way Home - 546 W Julian St, San Jose ",
                "Santa Maria Urban Ministry - 778 S. Almaden, San Jose",
                "Martha's Kitchen - 311 Willow St., San Jose",
                "Sacred Heart Community Service - 1381 South First Street, San Jose",
                "Storehouse of Blessings - 1775 Mclaughlin Ave., San Jose",
                "St. Clare-St. Vincent de Paul - 941 Lexington St, Santa Clara",
                "Kenny Foreman Reaching Out Center - 2315 Canoas Garden Ave, San Jose",
                "Rahima Foundation - 1823 Houret Ct, Milpitas",
                "Milpitas Food Pantry - 1440 S. Main Street, Milpitas",
                "San Jose Neighbors That Care - 3535 Clayton Rd., San Jose ",
                "Operation Share - 479 Blossom Hill Road, San Jose",
                "Sunnyvale Community Services - 725 Kifer Road, Sunnyvale",
                "JFS SV Project NOAH - 14855 Oka Rd. #202, Los Gatos",
                "West Valley Community Services - 10104 Vista Dr., Sunnyvale ",
                "Herlong Food Pantry - 170 D.S. Hall Rd, South San Jose",
                "Loaves & Fishes Family Kitchen - 508 Valley Way, Milpitas",
                "Community Services Agency of Santa Clara - 204 Stierlin Road, Mountain View",
                "Community Services Agency of Mountain View - 204 Stierlin Road, Mountain View",
                "Community Services Agency of Palo Alto - 204 Stierlin Road, Mountain View",
                "Centerville Free Dining Room - 4360 Central Avenue, Fremont",
                "Tri-City Volunteers - 37350 Joseph Street, Fremont",
                "Hvrpaa, 795 Willow Road #347B - Redwood City",
                "Wally's Place - 695 5th Ave., Redwood City",
                "St Francis Center - 151 Buckingham Ave, Redwood City",
                "ACRC HIV Food Pantry - 2684 Middlefield Rd. Suite E, Redwood City",
                "The Salvation Army - 1270 Marshall St, Redwood City",
                "Valley Churches United Missions - 9430 Highway 9, Ben Lomond" };

        // TODO (4) Append each String from the fake weather data array to the TextView - tf

        for(String weatherData : weatherDatas) {
            mWeatherDataTextView.append(weatherData + "\n\n\n");
        }

    }
}