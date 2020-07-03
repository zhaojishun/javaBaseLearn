package cn.zhaojishun;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-05-14 18:44
 */
public class Test {

    public static void main(String[] args) {
        while (true){
            new Thread(new Runnable() {
                @Override
                public void run() {
//1.打开浏览器
                    CloseableHttpClient httpClient = HttpClients.createDefault();
                    //2.声明get请求
                    HttpPost httpPost = new HttpPost("http://user.hlx.jsls9.top/user");
                    //3.开源中国为了安全，防止恶意攻击，在post请求中都限制了浏览器才能访问
                    httpPost.addHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36");
                    //4.判断状态码
                    List<NameValuePair> parameters = new ArrayList<NameValuePair>(0);
                    parameters.add(new BasicNameValuePair("userId", "1"));
                    parameters.add(new BasicNameValuePair("count", "1000"));

                    UrlEncodedFormEntity formEntity = null;
                    try {
                        formEntity = new UrlEncodedFormEntity(parameters,"UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }

                    httpPost.setEntity(formEntity);

                    //5.发送请求
                    CloseableHttpResponse response = null;
                    try {
                        response = httpClient.execute(httpPost);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if(response.getStatusLine().getStatusCode()==200){
                        HttpEntity entity = response.getEntity();
                        String string = null;
                        try {
                            string = EntityUtils.toString(entity, "utf-8");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println(string);
                    }
                    //6.关闭资源
                    try {
                        response.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        httpClient.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }

    }

}