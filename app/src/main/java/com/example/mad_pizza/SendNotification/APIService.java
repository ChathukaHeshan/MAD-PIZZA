package com.example.mad_pizza.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA_o0EYZ4:APA91bEy2550wmIhmXWhuvjbiI-M5kIJ8FutYy0S3hn4DIYNRcAjQtUMIaJncGyPxLpC7AP_ap3oMcuc_Ah3Z01Gsnfmj_eLPbncJ1DEKxU9rIRVZ80Od8ELMpiYcLQbkWlLahMKvcsA"
            }
    )

    @POST("fcm/send")
    Call<com.example.mad_pizza.SendNotification.MyResponse> sendNotification(@Body com.example.mad_pizza.SendNotification.NotificationSender body);
}
