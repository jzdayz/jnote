package com.io.jdk;

import com.google.common.io.Closer;
import okhttp3.*;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.Charset;

public class TestSocket {

    private static String body = "POST /test HTTP/1.1\r\n" +
            "Content-Type: multipart/form-data; boundary=5d7f7b90-099f-4cb1-8501-ccbf07969d9a\r\n" +
            "Content-Length: 154\r\n" +
            "Host: localhost:8080\r\n" +
            "\r\n" +
            "--5d7f7b90-099f-4cb1-8501-ccbf07969d9a\r\n" +
            "Content-Disposition: form-data; name=\"name\"\r\n" +
            "Content-Length: 4\r\n" +
            "\r\n" +
            "name\r\n" +
            "--5d7f7b90-099f-4cb1-8501-ccbf07969d9a--\r\n";

    public static void main(String[] args) throws Exception{
//        socket();
//
        okhttp();
    }

    private static void okhttp() throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://localhost:8080/test")
                .post(new MultipartBody.Builder()
                        .setType(MultipartBody.FORM)
                        .addFormDataPart("name", "name")
                        .build()).build();
        final Call call = okHttpClient.newCall(request);
        final Response execute = call.execute();
        System.out.println(execute.body().string());
    }

    private static void socket() {
        try (
                Closer cl = Closer.create()
                ){
            Socket socket = cl.register(new Socket("localhost",8080));
            StreamUtils.copy(body.getBytes(),cl.register(socket.getOutputStream()));
            final InputStream in = cl.register(socket.getInputStream());
            final String s = StreamUtils.copyToString(in, Charset.defaultCharset());
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
