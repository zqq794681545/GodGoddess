package com.godgoddess.god.entity;

import com.godgoddess.base.entity.BaseEntity;
import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.godgoddess.god.entity.TImageEtEntity
 * @Description t_image_et表实体类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 16:12:12
 * @version 1.0
 * @remark create by generator
 */

public class TImageEtEntity extends BaseEntity{

	private String imglj;  //
	private String imgjianjie;  //
	private double imgjg;  //
	private int imgsfjs;  //
	private String id;  //
	
	public String getImglj(){
		return imglj;
	}
	public void setImglj(String imglj){
		this.imglj = imglj;
	}
	public String getImgjianjie(){
		return imgjianjie;
	}
	public void setImgjianjie(String imgjianjie){
		this.imgjianjie = imgjianjie;
	}
	public double getImgjg(){
		return imgjg;
	}
	public void setImgjg(double imgjg){
		this.imgjg = imgjg;
	}
	public int getImgsfjs(){
		return imgsfjs;
	}
	public void setImgsfjs(int imgsfjs){
		this.imgsfjs = imgsfjs;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
}