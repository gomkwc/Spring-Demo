
<div align=center>
<table border=1>

		<tr>
			<td>아이디 (Tomcat7 만세 3)</td>
			<td>이름</td>
		</tr>
			<#list userList as data>
			<tr>
				<td>${data.id?if_exists}</td>
				<td>${data.name?if_exists}</td>
			</tr>
			</#list>
</table>
</div>

