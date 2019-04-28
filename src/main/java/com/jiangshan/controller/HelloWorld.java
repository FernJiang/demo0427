package com.jiangshan.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.jiangshan.model.DictColumnName;
import com.jiangshan.model.DictTableName;
import com.jiangshan.model.JsonTableColumn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/4/27 0027.
 */
//@RestController：代表的作用就是不用任何的前端代码只用Java可以展示前端的代码
@Controller
public class HelloWorld {
    @RequestMapping(value = "/print")
    public String print(HttpServletRequest request, HttpSession session)
    {

        DictTableName dictTable = new DictTableName();
        String inputjson = request.getParameter("inputjson");
        JsonTableColumn jsonTable = JSON.parseObject(inputjson, new TypeReference<JsonTableColumn>(){});
        dictTable.setTableName(jsonTable.getTableName());
        dictTable.setTableTitle(jsonTable.getTableTitle());
        dictTable.setTableMemo(jsonTable.getTableMemo());

        System.out.println(dictTable.getTableName()+dictTable.getTableMemo()+dictTable.getTableTitle());
        System.out.println("________________________________________");
        List<DictColumnName> columns = jsonTable.getColumns();
        System.out.println(columns.toString());
        for(DictColumnName dict:columns)
        {
            DictColumnName inDict = new DictColumnName();
            inDict.setTableName(jsonTable.getTableName());
            inDict.setColumnName(dict.getColumnName());
            inDict.setColumnTitle(dict.getColumnTitle());
            inDict.setColumnType(dict.getColumnType());
            inDict.setColumnMemo(dict.getColumnMemo());

            System.out.println(inDict.getTableName()+inDict.getColumnMemo()+inDict.getColumnName());
        }
        return "success";
    }


}
