<!--  
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
-->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<form>
  		<input type="button" value="삭제" style="float:right; height:5%"/>
  		<input type="button" value="수정" style="float:right; height:5%; margin-right:30"/>
  		<input type="button" value="등록" style="float:right; height:5%; margin-right:30"/>
  		<input type="button" value="초기화" style="float:right; height:5%; margin-right:30"/>
	</form>
	<table border="2" style="height:90%; width:100%">
	<style>
		td{
			text-align: center;
		}
	</style>
		<tr height=200>
			<td> 
				<table style="height:100%; width:100%">
					<tr>
						<td>
							사업자 번호
						</td>
						<td>
							<form>
  								<input type="text" name="busi_num_serch">
							</form>
						</td>
					</tr>
					<tr>
						<td>
						거래처명
						</td>
						<td>
							<form>
  								<input type="text" name="custom_serch">
							</form>
						</td>
						<td>
							<form>
  								<input type="button" value="조회"/>
							</form>
						</td>
					</tr>
				</table>
			</td>
			<td rowspan="2"> 
				<form>
  					사업자 번호 <input type="text" name="busi_num_show">
  					약칭 <input type="text" name="short_show">
				</form>
				<form>
  					거래처명 <input type="text" name="custom_show" style="width:70%">
				</form>
				<form>
  					대표자 <input type="text" name="ceo_show">
  					담당자 <input type="text" name="charge_person_show">
				</form>
				<form>
  					업태 <input type="text" name="busi_condition_show">
  					종목 <input type="text" name="item_show">
				</form>
				<form>
  					우편번호 <input type="text" name="post_num_show" readonly>
  					<input type="button" value="검색" name="post_num_serch">
  					주소1 <input type="text" name="addr1_show" readonly>
				</form>
				<form>
  					주소2 <input type="text" name="addr2_show" style="width:70%">
				</form>
				<form>
  					전화번호 <input type="text" name="tel_show">
  					팩스번호 <input type="text" name="fax_show">
				</form>
				<form>
  					홈페이지 <input type="text" name="homepage_show" style="width:70%" >
				</form>
				<form>
  					법인여부 
  						<input type="radio" name="co_yn" value="법인" /> 법인
						<input type="radio" name="co_yn" value="개인" /> 개인
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  					해외여부
  						<input type="radio" name="foreign_yn" value="해외" /> 해외
						<input type="radio" name="foreign_yn" value="국내" /> 국내
				</form>
				<form>
  					과세구분 
  					<select name = "tax">
          				<option value = "tax_y" selected>과세</option>
    				    <option value = "tax_n">면세</option>
       				</select>
  					국가 <input type="text" name="" readonly>
  					<input type="text" name="" readonly>
  					<input type="button" value="검색" name="conuntry_serch">
				</form>
				<form>
  					특수관계자 <input type="checkbox" name="" style="width:15; height:15">
  					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  					거래중지 <input type="checkbox" name="" style="width:15; height:15">
				</form>
				<form>
  					계약기간 <input type="date" name="">
  					<input type="date" name="">
				</form>
				<form>
  					등록정보 <input type="text" name="">
  					<input type="text" name="" readonly>
				</form>
				<form>
					변경정보 <input type="text" name="">
  					<input type="text" name="" readonly>
				</form>
				<p style="text-align:left">거래처 계좌번호</p>
				<table border="1" style="width:100%">
				<th>사무소</th>
				<th>은행</th>
				<th>계좌번호</th>
				<tr>
					<td>
						<input type="text" name="">
					</td>
					<td>
						<input type="text" name="">
					</td>
					<td>
						<input type="text" name="">
					</td>
				</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td>
				<table border="1" style="height:100%; width:100%">
					<tr height=100>
						<td>
							사업자 번호
						</td>
						<td>
							거래처명
						</td>
					</tr>
					<tr>
						<td>
						
						</td>
						<td>
						
						</td>
					</tr>
					<tr>
						<td>
						
						</td>
						<td>
						
						</td>
					</tr>
					<tr>
						<td>
						
						</td>
						<td>
						
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>
