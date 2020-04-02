package com.cotrack.servicegps;

import android.location.Location;

public interface ILocationUpdateCallback {
  public void update(Location location);
}
