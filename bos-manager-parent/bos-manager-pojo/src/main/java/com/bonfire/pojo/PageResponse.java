package com.bonfire.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/11/3.
 */
public class PageResponse<T>{
    private Integer total;
    private List<T> rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
