<jsp:include page="header.jsp" />
<!-- chama header para execu��o e depois inclui aqui -->

<tr>
	<td>
		<table align="left" border="0" cellpadding="0" cellspacing="0" width="100%">
			<tr>
				<td class="titulocentral">Interface Administrativa</td>
			</tr>
			<tr><td>&nbsp;</td></tr>
			<tr>
				<td class="campocentral"><a href="admin_news.jsp">Not�cias</a></td>
			</tr>
			<tr>
				<td class="campocentral"><a href="admin_user.jsp">Usu�rios</a></td>
			</tr>
			<tr><td>&nbsp;</td></tr>
		</table>
	</td>
</tr>

<!-- inclui primeiro e depois processa -->
<%@ include file="footer.jsp" %>
