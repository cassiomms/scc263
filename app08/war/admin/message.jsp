<jsp:include page="header.jsp"/>
<%

		String msg = request.getParameter("msg");
		int code = Integer.parseInt(msg);

		switch (code) {
			case 0: out.println("Erro ao inserir not�cia!");
				break;
			case 1: out.println("Sucesso ao inserir not�cia!");
				break;
			case 2: out.println("Erro ao remover not�cia!");
				break;
			case 3: out.println("Sucesso ao remover not�cia!");
				break;
			case 4: out.println("Acesso Negado!");
				break;
			case 5: out.println("Sucesso ao editar not�cia!");
				break;
			case 6: out.println("Erro ao editar not�cia!");
				break;
		}

		%>
<jsp:include page="footer.jsp"/>
