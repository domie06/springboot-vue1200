package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 图书借阅
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-20 13:31:53
 */
@TableName("tushujieyue")
public class TushujieyueEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TushujieyueEntity() {
		
	}
	
	public TushujieyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 借阅单号
	 */
					
	private String jieyuedanhao;
	
	/**
	 * 图书编号
	 */
					
	private String tushubianhao;
	
	/**
	 * 图书名称
	 */
					
	private String tushumingcheng;
	
	/**
	 * 图书分类
	 */
					
	private String tushufenlei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 可借天数
	 */
					
	private String kejietianshu;
	
	/**
	 * 可借数量
	 */
					
	private String kejieshuliang;
	
	/**
	 * 借阅日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jieyueriqi;
	
	/**
	 * 借阅天数
	 */
					
	private String jieyuetianshu;
	
	/**
	 * 应还日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date yinghairiqi;
	
	/**
	 * 借阅状态
	 */
					
	private String jieyuezhuangtai;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：借阅单号
	 */
	public void setJieyuedanhao(String jieyuedanhao) {
		this.jieyuedanhao = jieyuedanhao;
	}
	/**
	 * 获取：借阅单号
	 */
	public String getJieyuedanhao() {
		return jieyuedanhao;
	}
	/**
	 * 设置：图书编号
	 */
	public void setTushubianhao(String tushubianhao) {
		this.tushubianhao = tushubianhao;
	}
	/**
	 * 获取：图书编号
	 */
	public String getTushubianhao() {
		return tushubianhao;
	}
	/**
	 * 设置：图书名称
	 */
	public void setTushumingcheng(String tushumingcheng) {
		this.tushumingcheng = tushumingcheng;
	}
	/**
	 * 获取：图书名称
	 */
	public String getTushumingcheng() {
		return tushumingcheng;
	}
	/**
	 * 设置：图书分类
	 */
	public void setTushufenlei(String tushufenlei) {
		this.tushufenlei = tushufenlei;
	}
	/**
	 * 获取：图书分类
	 */
	public String getTushufenlei() {
		return tushufenlei;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：可借天数
	 */
	public void setKejietianshu(String kejietianshu) {
		this.kejietianshu = kejietianshu;
	}
	/**
	 * 获取：可借天数
	 */
	public String getKejietianshu() {
		return kejietianshu;
	}
	/**
	 * 设置：可借数量
	 */
	public void setKejieshuliang(String kejieshuliang) {
		this.kejieshuliang = kejieshuliang;
	}
	/**
	 * 获取：可借数量
	 */
	public String getKejieshuliang() {
		return kejieshuliang;
	}
	/**
	 * 设置：借阅日期
	 */
	public void setJieyueriqi(Date jieyueriqi) {
		this.jieyueriqi = jieyueriqi;
	}
	/**
	 * 获取：借阅日期
	 */
	public Date getJieyueriqi() {
		return jieyueriqi;
	}
	/**
	 * 设置：借阅天数
	 */
	public void setJieyuetianshu(String jieyuetianshu) {
		this.jieyuetianshu = jieyuetianshu;
	}
	/**
	 * 获取：借阅天数
	 */
	public String getJieyuetianshu() {
		return jieyuetianshu;
	}
	/**
	 * 设置：应还日期
	 */
	public void setYinghairiqi(Date yinghairiqi) {
		this.yinghairiqi = yinghairiqi;
	}
	/**
	 * 获取：应还日期
	 */
	public Date getYinghairiqi() {
		return yinghairiqi;
	}
	/**
	 * 设置：借阅状态
	 */
	public void setJieyuezhuangtai(String jieyuezhuangtai) {
		this.jieyuezhuangtai = jieyuezhuangtai;
	}
	/**
	 * 获取：借阅状态
	 */
	public String getJieyuezhuangtai() {
		return jieyuezhuangtai;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
