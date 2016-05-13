/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.sahelmastoureshgh.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.mastoureshgh.JokeTeller;

/**
 * An endpoint class we are exposing
 */
@Api(name = "myApi", version = "v1", namespace = @ApiNamespace(ownerDomain = "backend.myapplication.sahelmastoureshgh.example.com", ownerName = "backend.myapplication.sahelmastoureshgh.example.com", packagePath = ""))
public class MyEndpoint {

    /**
     * A simple endpoint method that tell joke
     */
    @ApiMethod(name = "sayJoke")
    public MyBean sayJoke() {
        MyBean response = new MyBean();
        JokeTeller jt=new JokeTeller();
        String temp = jt.getJoke();
        response.setData(temp);

        return response;
    }

}
