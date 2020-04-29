


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;

public class jsonUtiles {
    public String readStrFromFile(String fileToRead) throws FileNotFoundException, IOException {
        String str;
        int len = 0;
        StringBuffer stringBuffer = new StringBuffer("");
        File file = new File(fileToRead);

        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStream = new InputStreamReader(fileInputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStream);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            if (len != 0) {
                stringBuffer.append("\r\n" + line);
            } else {
                stringBuffer.append(line);
            }
            len++;
        }
        fileInputStream.close();
        bufferedReader.close();
        str = stringBuffer.toString();
        return str;
    }

    public String formatTime(String strToFormat) {
        long timeStamp = System.currentTimeMillis() / 1000;
        int timeStampInt = (int) timeStamp;
        JSONObject jsonObject = JSON.parseObject(strToFormat);
        jsonObject.put("now", timeStampInt);
        String strWithFormatTime = jsonObject.toJSONString();
        return strWithFormatTime;
    }
}
