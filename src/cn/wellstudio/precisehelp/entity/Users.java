package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 用户
 * @author huhong
 *
 */
public class Users implements java.io.Serializable {

	// Fields

	private Integer userId; // 用户id
	private String userAccount; // 用户账号
	private String userPsw; // 用户密码
	private String userZfPsw; // 用户支付密码
	private Set lettersesForLetTo = new HashSet(0); // 发出去的信
	private Set lettersesForLetFrom = new HashSet(0); // 收到的信
	private Set orderDoings = new HashSet(0); // 正在处理的订单
	private Set commentses = new HashSet(0); // 发出的评论列表
	private Set usersinfos = new HashSet(0); // 用户信息
	private Set orderDones = new HashSet(0); // 该用户已完成的订单
	private Set toaddresses = new HashSet(0); // 该用户的收货地址
	private Set orderTodos = new HashSet(0); // 该用户待处理的订单

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String userAccount, String userPsw, String userZfPsw,
			Set lettersesForLetTo, Set lettersesForLetFrom, Set orderDoings,
			Set commentses, Set usersinfos, Set orderDones, Set toaddresses,
			Set orderTodos) {
		this.userAccount = userAccount;
		this.userPsw = userPsw;
		this.userZfPsw = userZfPsw;
		this.lettersesForLetTo = lettersesForLetTo;
		this.lettersesForLetFrom = lettersesForLetFrom;
		this.orderDoings = orderDoings;
		this.commentses = commentses;
		this.usersinfos = usersinfos;
		this.orderDones = orderDones;
		this.toaddresses = toaddresses;
		this.orderTodos = orderTodos;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserPsw() {
		return this.userPsw;
	}

	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
	}

	public String getUserZfPsw() {
		return this.userZfPsw;
	}

	public void setUserZfPsw(String userZfPsw) {
		this.userZfPsw = userZfPsw;
	}

	public Set getLettersesForLetTo() {
		return this.lettersesForLetTo;
	}

	public void setLettersesForLetTo(Set lettersesForLetTo) {
		this.lettersesForLetTo = lettersesForLetTo;
	}

	public Set getLettersesForLetFrom() {
		return this.lettersesForLetFrom;
	}

	public void setLettersesForLetFrom(Set lettersesForLetFrom) {
		this.lettersesForLetFrom = lettersesForLetFrom;
	}

	public Set getOrderDoings() {
		return this.orderDoings;
	}

	public void setOrderDoings(Set orderDoings) {
		this.orderDoings = orderDoings;
	}

	public Set getCommentses() {
		return this.commentses;
	}

	public void setCommentses(Set commentses) {
		this.commentses = commentses;
	}

	public Set getUsersinfos() {
		return this.usersinfos;
	}

	public void setUsersinfos(Set usersinfos) {
		this.usersinfos = usersinfos;
	}

	public Set getOrderDones() {
		return this.orderDones;
	}

	public void setOrderDones(Set orderDones) {
		this.orderDones = orderDones;
	}

	public Set getToaddresses() {
		return this.toaddresses;
	}

	public void setToaddresses(Set toaddresses) {
		this.toaddresses = toaddresses;
	}

	public Set getOrderTodos() {
		return this.orderTodos;
	}

	public void setOrderTodos(Set orderTodos) {
		this.orderTodos = orderTodos;
	}

}