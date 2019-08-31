package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

public class ResultUtil {

    /**
     * 返回成功json
     * @param object
     * @return
     */
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    /**
     * 返回成功json（无数据）
     * @return
     */
    public static ResultVO success(){
        return success(null);
    }

    /**
     * 返回失败json
     * @param code
     * @param msg
     * @return
     */
    public static ResultVO error(Integer code, String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
