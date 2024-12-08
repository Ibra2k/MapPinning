# Description
A lightweight and intuitive application that lets users pin areas of interest on a map. The app also features an Assassin's Creed-themed map mode for an immersive experience, leveraging the Google Maps API for seamless map functionality. The project is inspired by Philipp Lackner's map pinning project.

# Features

- Pin Locations: Add and save pins to mark areas of interest.
- Theme Switching: Transform the map to an Assassin's Creed-style map for a unique visual experience.
- Google Maps Integration: Utilizes the Google Maps API to provide high-quality maps and real-time navigation capabilities.

# Tools Used

- Programming Language: Kotlin
- Framework: Jetpack Compose
- Map Service: Google Maps API

# Installation
1. Create account on Google Maps Platform and get API Key `https://console.cloud.google.com/google/maps-hosted/build?inv=1&invt=AbjjiQ`

2. Clone Repository. `git clone https://github.com/Ibra2k/MapPinning.git`

4. Go to build.gradle (:app) or use .toml to add Google Map Implmentation:
``
    implementation "com.google.android.gms:play-services-maps:18.0.2"
``

4. Replace "API_KEY" with your Google Api Key in AndroidManifest.xml: 
``
<meta-data android:name="com.google.android.geo.API_KEY" android:value="API_KEY"/>
``

5. Run the project.

# Preview




# Contact
Email: muhammadibrahimkhan735@gmail.com
