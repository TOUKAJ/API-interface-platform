package com.zhu.apiclientsdk.client;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.zhu.apiclientsdk.model.User;

import java.util.HashMap;
import java.util.Map;

import static com.zhu.apiclientsdk.utils.SignUtils.genSign;


public class ApiClient {

    private String accessKey;//用户ak
    private String secretKey;//用户sk

    private final String GATEWAY_POST = "http://localhost:8090";//网关地址

    public ApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    //调用模拟接口
    public String getNameByGet(String name) {
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("name", name);
        String result = HttpUtil.get(GATEWAY_POST + "/api/name/", paramMap);//向网关发送http请求
        return result;
    }

    //调用模拟接口
    public String getNameByPost(String name) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.post(GATEWAY_POST + "/api/name/", paramMap);
        return result;
    }


    //调用模拟接口
    public String getUsernameByPost(User user) {
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_POST + "/api/name/user/")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        return result;
    }

    private Map<String, String> getHeaderMap(String body) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("accessKey", accessKey);
        //hashMap.put("secretKey", secretKey);不传sk

        hashMap.put("body", body);
        //Digester md5 = new Digester(DigestAlgorithm.SHA256);
        //String content = body + "." + secretKey;
        hashMap.put("sign", genSign(body, secretKey));
        return hashMap;
    }
}
