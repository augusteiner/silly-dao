<form method="post" action="alteraRoteiro">
  <input type="hidden" name="id" value="${roteiro.id}">
  
  Descrição: <input type="text" name="descricao" value="${roteiro.descricao}">
  
  <button type="submit">Enviar</button>
</form>