package com.jiangshan.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/4/28 0028.
 */
public class JsonTableColumn {
    private String tableName ;
    private String tableTitle;
    private String tableMemo;
    private List<DictColumnName> columns;



    public List<DictColumnName> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<DictColumnName> columns) {
        this.columns = columns;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableTitle() {
        return tableTitle;
    }

    public void setTableTitle(String tableTitle) {
        this.tableTitle = tableTitle;
    }

    public String getTableMemo() {
        return tableMemo;
    }

    public void setTableMemo(String tableMemo) {
        this.tableMemo = tableMemo;
    }


}
