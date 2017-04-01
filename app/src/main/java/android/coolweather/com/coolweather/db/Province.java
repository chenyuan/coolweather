package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * step1:建立省市县三个bean类 继承DataSupport
 * id :实体类该有的字段
 * provinceName：省名
 * procinceCode：代号
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
