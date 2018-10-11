<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<c:set var="path" value="${pageContext.servletContext.contextPath}"/>
<h1>사원 등록</h1>
<form action="${path}/admin/employee/register.do" method="post">
	<div class="form-group">
		<label for="formGroupExampleInput">이름</label> <input
			type="text" class="form-control" placeholder="NAME" name="name">
	</div>
	<div class="form-group">
		<label for="formGroupExampleInput2">비밀번호</label> <input
			type="password" class="form-control" placeholder="PASSWORD" name="pass">
	</div>

	<div class="form-group">
		<label>Another label</label>

		<div class="row">
			<div class="col">
				<select class="form-control" name="did">
					<option value="">부서</option>
					<c:forEach var="dp" items="${depart}">
						<option value="${dp.DID}">${dp.DNAME}</option>
					</c:forEach>		
				</select>
			</div>
			<div class="col">
				<select class="form-control" name="pid">
					<option value="">직급</option>
					<c:forEach var="po" items="${position}">
						<option value="${po.PID}">${po.PNAME}</option>
					</c:forEach>
				</select>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label>Another label</label> <input
			type="date" class="form-control" placeholder="Another input" name="joindate">
	</div>
	<div class="form-group">
		<button type="submit"  class="form-control btn btn-outline-primary">사원등록</button>
	</div>
</form>