package com.qyh.utilstools;

public class Utils {
    /**
     *
     * @note double 位置 转换成  分 秒
     *
     * */
    public static String dblToLocation(double data){
        String ret_s = "";
        int tmp_i_du = (int)data;
        ret_s = String.valueOf(tmp_i_du)+"°";
        //度小数部分
        double tmp_d_du = data-tmp_i_du;
        int tmp_i_fen = (int)(tmp_d_du*60);
        ret_s = ret_s.concat(String.valueOf(tmp_i_fen)+"′");
        double tmp_d_fen = tmp_d_du*60 - tmp_i_fen;
        int tmp_i_miao = (int)(tmp_d_fen*60);
        ret_s = ret_s.concat(String.valueOf(tmp_i_miao)+"″");
        return ret_s;
    }
}
