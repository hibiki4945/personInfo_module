package com.example.person_info_module;

import java.util.List;

public class SearchInfo {

    private String search1;
    
    private String search1ColumnSelect;
    
    private List<String> columnList;

    public String getSearch1() {
        return search1;
    }

    public void setSearch1(String search1) {
        this.search1 = search1;
    }

    public String getSearch1ColumnSelect() {
        return search1ColumnSelect;
    }

    public void setSearch1ColumnSelect(String search1ColumnSelect) {
        this.search1ColumnSelect = search1ColumnSelect;
    }

    public List<String> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<String> columnList) {
        this.columnList = columnList;
    }

    public SearchInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SearchInfo(String search1, String search1ColumnSelect, List<String> columnList) {
        super();
        this.search1 = search1;
        this.search1ColumnSelect = search1ColumnSelect;
        this.columnList = columnList;
    }
    
}
