package com.example.shivam_gaur.voice_guided_navigation;

/**
 * Created by Shivam_Gaur on 12-03-2017.
 */import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

//import Modules.Route;

/**
 * Created by Mai Thanh Hiep on 4/3/2016.
 */
public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
