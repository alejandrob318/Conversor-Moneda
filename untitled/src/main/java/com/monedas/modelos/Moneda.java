package com.monedas.modelos;

public class Moneda {
    private String result;
    private  String base_code;
    private  String target_code;
    private  double conversion_rate;
    private  double conversion_result;
    private  String time_last_update_utc;

    public Moneda() {
    }

    public Moneda(String result, String base_code, String target_code, double conversion_rate, double conversion_result, String time_last_update_utc) {
        this.result = result;
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
        this.conversion_result = conversion_result;
        this.time_last_update_utc = time_last_update_utc;
    }

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public void setTime_last_update_utc(String time_last_update_utc) {
        this.time_last_update_utc = time_last_update_utc;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public double getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(double conversion_result) {
        this.conversion_result = conversion_result;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "result='" + result + '\'' +
                ", base_code='" + base_code + '\'' +
                ", target_code='" + target_code + '\'' +
                ", conversion_rate=" + conversion_rate +
                ", conversionTotal=" + conversion_result +
                ", time_last_update_utc='" + time_last_update_utc + '\'' +
                '}';
    }
}
