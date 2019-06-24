package com.core.utils;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;


public class RSAUtil {   public static final String KEY_ALGORITHM = "RSA";
    public static final String SIGNATURE_ALGORITHM = "MD5withRSA";

    private static final String PUBLIC_KEY = "RSAPublicKey";
    private static final String PRIVATE_KEY = "RSAPrivateKey";

    public static byte[] decryptBASE64(String key) {
        return Base64.decodeBase64(key);
    }

    public static String encryptBASE64(byte[] bytes) {
        return Base64.encodeBase64String(bytes);
    }

    /**
     * 用私钥对信息生成数字签名
     *
     * @param data       加密数据
     * @param privateKey 私钥
     * @return
     * @throws Exception
     */
    public static String sign(byte[] data, String privateKey) throws Exception {
        // 解密由base64编码的私钥
        byte[] keyBytes = decryptBASE64(privateKey);
        // 构造PKCS8EncodedKeySpec对象
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
        // KEY_ALGORITHM 指定的加密算法
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        // 取私钥匙对象
        PrivateKey priKey = keyFactory.generatePrivate(pkcs8KeySpec);
        // 用私钥对信息生成数字签名
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
        signature.initSign(priKey);
        signature.update(data);
        return encryptBASE64(signature.sign());
    }

    /**
     * 校验数字签名
     *
     * @param data      加密数据
     * @param publicKey 公钥
     * @param sign      数字签名
     * @return 校验成功返回true 失败返回false
     * @throws Exception
     */
    public static boolean verify(byte[] data, String publicKey, String sign)
            throws Exception {
        // 解密由base64编码的公钥
        byte[] keyBytes = decryptBASE64(publicKey);
        // 构造X509EncodedKeySpec对象
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        // KEY_ALGORITHM 指定的加密算法
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        // 取公钥匙对象
        PublicKey pubKey = keyFactory.generatePublic(keySpec);
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
        signature.initVerify(pubKey);
        signature.update(data);
        // 验证签名是否正常
        return signature.verify(decryptBASE64(sign));
    }

    public static byte[] decryptByPrivateKey(byte[] data, String key) throws Exception{
        // 对密钥解密
        byte[] keyBytes = decryptBASE64(key);
        // 取得私钥
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
        // 对数据解密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(data);
    }

    /**
     * 解密<br>
     * 用私钥解密
     *
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static String decryptByPrivateKey(String data, String key)
            throws Exception {
        return new String (decryptByPrivateKey(decryptBASE64(data),key));
    }

    /**
     * 解密<br>
     * 用公钥解密
     *
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] decryptByPublicKey(byte[] data, String key)
            throws Exception {
        // 对密钥解密
        byte[] keyBytes = decryptBASE64(key);
        // 取得公钥
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key publicKey = keyFactory.generatePublic(x509KeySpec);
        // 对数据解密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, publicKey);
        return cipher.doFinal(data);
    }

    /**
     * 加密<br>
     * 用公钥加密
     *
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] encryptByPublicKey(String data, String key)
            throws Exception {
        // 对公钥解密
        byte[] keyBytes = decryptBASE64(key);
        // 取得公钥
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key publicKey = keyFactory.generatePublic(x509KeySpec);
        // 对数据加密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(data.getBytes());
    }

    /**
     * 加密<br>
     * 用私钥加密
     *
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] encryptByPrivateKey(byte[] data, String key)
            throws Exception {
        // 对密钥解密
        byte[] keyBytes = decryptBASE64(key);
        // 取得私钥
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
        // 对数据加密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        return cipher.doFinal(data);
    }

    /**
     * 取得私钥
     *
     * @param keyMap
     * @return
     * @throws Exception
     */
    public static String getPrivateKey(Map<String, Key> keyMap)
            throws Exception {
        Key key = (Key) keyMap.get(PRIVATE_KEY);
        return encryptBASE64(key.getEncoded());
    }

    /**
     * 取得公钥
     *
     * @param keyMap
     * @return
     * @throws Exception
     */
    public static String getPublicKey(Map<String, Key> keyMap)
            throws Exception {
        Key key = keyMap.get(PUBLIC_KEY);
        return encryptBASE64(key.getEncoded());
    }

    /**
     * 初始化密钥
     *
     * @return
     * @throws Exception
     */
    public static Map<String, Key> initKey() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator
                .getInstance(KEY_ALGORITHM);
        keyPairGen.initialize(1024);
        KeyPair keyPair = keyPairGen.generateKeyPair();
        Map<String, Key> keyMap = new HashMap(2);
        keyMap.put(PUBLIC_KEY, keyPair.getPublic());// 公钥
        keyMap.put(PRIVATE_KEY, keyPair.getPrivate());// 私钥
        return keyMap;
    }





    public static void main(String[] args) {
        try {
            String publicKey;
           String privateKey;
            Map<String, Key> keyMap = initKey();
            publicKey = getPublicKey(keyMap);
            privateKey = getPrivateKey(keyMap);
            privateKey = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAMK29tQbQmZE9iaGBr6+Ibhx8a4mqb5wcKQBNNHRMDFyMGx8RhjL7R4UCaIaM5wjoxJK4s3lnRN9rliBl+RoyyU5ci79jyYmsFVGi2RIE0zdbPqK/XKFrEbW0ITsE+Q//3Cs4VvtcIMswDURvgvAoS62hFZoSBsukI+knm8cVKp7AgMBAAECgYEAqQz24ZJFJMtstmeYhZRHbH6o6J0ytF+kvA88D4pCADv2pMmEhlTOqlWVQ4LiGgaqtuADZ+WZaWmtq7Pf7vO4ojNqZhIiwMCbs60tT3qpJAVmUOrwcI9nBbPw41d28zXobGrbrk+4bSKgMrNH7L+3QRhaiTeElV7iKFyflKsrvgECQQD76iwJ2ulot2wDIrj3G8kY0Nb6a/gGWFkC39hXX8AyeEsXF3W4RRqrzYKDmiuhT8FX491T3dqgFwZaTrxr61kBAkEAxd9TSGSu06EhaM1BP20aTefvfowgcAYAnLpQQ8MB9WMI5sTzCaCisjVR9tjjHa0ErxsPY4emg+v3xOWUG/HnewJBAJtrKQpXfeN2LnRsyrLh+JqP1eIgFKBNh3UHh2C4mUpJ/wHbHmy2bbMLEneA+WQHYaCI27bvS/+y1N+IbiUiyQECQQCuhkeitossxhX9pexC0Sw+QrAOYfHKXMD1e6+H1NxJX0xenp/ugex+WmEs5CeN6SkUeT2df+vyt5IV7Jgx/a85AkBafd375BExzXGZn+bixPLRjCl4v4oEAK+0/8Wa7HvB5h6kh3pHjG/gmnzp1HzQVOsrScwccx5UHOdxZgRHJsmX";
            System.err.println("公钥: \n\r" + publicKey);
            System.err.println("私钥： \n\r" + privateKey);


            System.err.println("公钥加密——私钥解密");
            String inputStr = "dounine";
//            byte[] encodedData = encryptByPublicKey(inputStr, publicKey);
//            byte[] decodedData = decryptByPrivateKey(encodedData, privateKey);
            String outputStr = decryptByPrivateKey("F83Ge+i9O13aMpNvX3s7tcV/dhYjz4cK/hcFmxYXU6Wf7N51nXta0PTsZs6FwUcGN3vDBpXinqsCv2zJRJ7j9nq9N0jMvFN6L3dEHm3rsVsGoHvEAj2gw8ZysYeUb5Y6M4sW3O5X7AnyUMOk3aZjkhSownPMjdoNcRzS0EGXnmo=", privateKey);

            System.err.println("加密前: " + inputStr + "\n\r" + "解密后: " + outputStr);



//            System.err.println("私钥加密——公钥解密");
//
//            byte[] data = inputStr.getBytes();
//
//
//            System.err.println("加密前: " + inputStr + "\n\r" + "解密后: " + outputStr);
//            System.err.println("私钥签名——公钥验证签名");
//            // 产生签名
//            String sign = sign(encodedData, privateKey);
//            System.err.println("签名:" + sign);
//            // 验证签名
//            boolean status = verify(encodedData, publicKey, sign);
//            System.err.println("状态:" + status);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}