package com.cyt.set;

import java.util.Set;
import java.util.TreeSet;

public class Medal implements Comparable<Medal>{

	private String country;
	private int jinpai;
	private int yinpai;
	private int tongpai;
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getJinpai() {
		return jinpai;
	}
	public void setJinpai(int jinpai) {
		this.jinpai = jinpai;
	}
	public int getYinpai() {
		return yinpai;
	}
	public void setYinpai(int yinpai) {
		this.yinpai = yinpai;
	}
	public int getTongpai() {
		return tongpai;
	}
	public void setTongpai(int tongpai) {
		this.tongpai = tongpai;
	}
	public Medal(String country, int jinpai, int yinpai, int tongpai) {
		super();
		this.country = country;
		this.jinpai = jinpai;
		this.yinpai = yinpai;
		this.tongpai = tongpai;
	}
	public Medal() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + jinpai;
		result = prime * result + tongpai;
		result = prime * result + yinpai;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medal other = (Medal) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (jinpai != other.jinpai)
			return false;
		if (tongpai != other.tongpai)
			return false;
		if (yinpai != other.yinpai)
			return false;
		return true;
	}
	@Override
	public int compareTo(Medal o) {
		if (this.jinpai>o.jinpai) {
			return -1;
		}else if (this.jinpai<o.jinpai) {
			return 1;
		}else {
			if (this.yinpai>o.yinpai) {
				return -1;
			}else if (this.yinpai<o.yinpai) {
				return 1;
			}else {
				if (this.tongpai >o.tongpai) {
					return -1;
				}else if (this.tongpai <o.tongpai) {
					return 1;
				}
			}
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Medal [country=" + country + ", jinpai=" + jinpai + ", yinpai=" + yinpai + ", tongpai=" + tongpai + "]";
	}
	public static void main(String[] args) {
		Set<Medal> sm = new TreeSet<>();
		sm.add(new Medal("中国",42,32,12));
		sm.add(new Medal("美国",12,32,12));
		sm.add(new Medal("英国",12,22,12));
		sm.add(new Medal("日本",22,32,12));
		sm.add(new Medal("日耳曼",22,32,12));
		
		for (Medal mm : sm) {
			System.out.println(mm);
		}
	}
	
	
	
}
