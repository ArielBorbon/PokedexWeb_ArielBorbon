<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/styles.css">
    <title>Añadir Pokemon</title>
</head>
<body>
<div class="main-div">

    <div class="menu-bar">
        <h1 class="pokedex-label">Pokedex</h1>
    </div>

    
    <div class="main-container">
        <div class="añadir-pokemon">
            <h2 class="añadirPokemon-titulo">Añadir Pokemon</h2>
            
            <form class="pokemon-form" action="registro" method="POST" >

                <div class="input-div">
                    <p class="input-title">Nombre:</p>

                    <input class="input" type="text" placeholder="Nombre del Pokemon" required
                           name="nombre" value="${pokemonIngresado.nombre}">
                </div>

                <div class="input-div">
                    <p class="input-title">Tipo:</p>
                    <select class="input" name="tipo" required>
                        <option value="">Seleccione un tipo...</option>
                        <c:forEach var="tipo" items="${tipos}">
                            <option value="${tipo}" ${tipo == pokemonIngresado.tipo ? 'selected' : ''}>
                                ${tipo}
                            </option>
                        </c:forEach>
                    </select>
                </div>

                <div class="input-div">
                    <p class="input-title">Numero:</p>
                    <input class="input" type="number" placeholder="Numero" step="1" required
                           name="numero" value="${pokemonIngresado.numero}">
                </div>

                <div class="input-div">
                    <p class="input-title">Url de imagen:</p>
                    <input class="input" type="text" placeholder="ej: imgs/pikachu.png o url de la Web" required
                           name="urlImagen" value="${pokemonIngresado.urlImagen}">
                </div>
                
                <div class="botones-form">
                    <button type="submit" class="añadir-btn">
                        <span class="añadirPokemon-label">Confirmar</span>
                    </button>
                    <a href="pokedex" class="cancelar-btn">
                        <span class="añadirPokemon-label">Cancelar</span>
                    </a>
                </div>
                
            </form>
        </div>
        
        <div class="añadir-div">
            <div class="errores">
                <c:if test="${not empty errores}">
                    <p style="color: red;">${errores}</p>
                </c:if>
            </div>
        </div>
    </div>
</div>
</body>
</html>