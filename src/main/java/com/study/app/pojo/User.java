package com.study.app.pojo;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

public class User {
	private BigInteger id;
	private String username;
	private String password;
	private Date createTimestamp;
	private Date modifyTimestamp;

	private List<Game> gameList;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Date getModifyTimestamp() {
		return modifyTimestamp;
	}

	public void setModifyTimestamp(Date modifyTimestamp) {
		this.modifyTimestamp = modifyTimestamp;
	}

	public List<Game> getGameList() {
		return gameList;
	}

	public void setGameList(List<Game> gameList) {
		this.gameList = gameList;
	}

}
