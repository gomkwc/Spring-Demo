
<div align=center>
<table border=1>

		<tr>
			<td>아이디 (Neowiz)</td>
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

