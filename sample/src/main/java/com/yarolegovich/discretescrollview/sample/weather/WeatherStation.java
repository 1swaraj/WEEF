package com.yarolegovich.discretescrollview.sample.weather;

import com.yarolegovich.discretescrollview.sample.R;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yarolegovich on 08.03.2017.
 */

public class WeatherStation {


    public static WeatherStation get() {
        return new WeatherStation();
    }

    private WeatherStation() {
    }

    public List<Forecast> getForecasts() {
        return Arrays.asList(
                new Forecast("Pisa", R.drawable.pisa, "16", Weather.SUNNY),
                new Forecast("London", R.drawable.london, "6", Weather.PERIODIC_CLOUDS),
                new Forecast("Home", R.drawable.new_york, "9", Weather.MOSTLY_CLOUDY),
                new Forecast("About Us", R.drawable.about, "18", Weather.PARTLY_CLOUDY),
                new Forecast("Welcome", R.drawable.paris, "18", Weather.VERY_SUNNY),
                new Forecast("Programme", R.drawable.rome, "14", Weather.CLEAR),
                new Forecast("Washington", R.drawable.washington, "20", Weather.CLEAR));
    }
}
