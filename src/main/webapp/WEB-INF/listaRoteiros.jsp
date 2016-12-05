<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<a href="alteraRoteiro">Cadastrar Novo</a>

<table>
  <c:forEach var="e" items="${lista}" varStatus="id">
    <tr>
      <td>
        ${id.index}
      </td>
      <td>
        ${e.descricao}
      </td>
      <td>
        <a href="removerRoteiro?id=${id.index}">Remover</a> | <a href="alteraRoteiro?id=${id.index}">Editar</a>
      </td>
    </tr>  
  </c:forEach>
</table>