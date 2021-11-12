package com.company.String.Task_17;
import static java.lang.System.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task17 {
    public static void main(String[] args){
        String xml = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";
       out.println(xmlAnalyzer(xml));
    }

    public static String xmlAnalyzer(String xml){
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");
        String[] lines = xml.split("\n");
        for (String line : lines){
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);
            if (mOpen.find()){
                stringBuilder.append(mOpen.group());
                stringBuilder.append(" - открывающий тег\n");
            }
            if (mClose.find()){
                stringBuilder.append(mClose.group());
                stringBuilder.append(" - закрывающий тег\n");
            }
            if (mBody.find()){
                stringBuilder.append(mBody.group());
                stringBuilder.append("\b - содержимое тега\n");
            }
            if(mEmpty.find()){
                stringBuilder.append(mEmpty.group());
                stringBuilder.append(" - тег без тела\n");
            }
        }
        return stringBuilder.toString();
    }
}
