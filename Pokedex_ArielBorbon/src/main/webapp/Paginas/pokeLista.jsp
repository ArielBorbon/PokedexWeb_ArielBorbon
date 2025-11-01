<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/styles.css">
        <title>Pokedex</title>
    </head>
    <body>
        <div class="main-div">

            <div class="menu-bar">
                <h1 class="pokedex-label">Pokedex</h1>
            </div>

            <div class="main-container">
                <div class="poke-lista">


                    <c:forEach var="pokemon" items="${listaPokemones}">
                        <div class="pokemon-item">
                            <div class="info-item">
                                <h3>${pokemon.nombre}</h3>
                                <ul>
                                    <li>Tipo: ${pokemon.tipo}</li>
                                    <li>Numero: ${pokemon.numero}</li>
                                </ul>
                            </div>
                            <div class="img-item">
                                <c:choose>
                                    <c:when test="${pokemon.urlImagen.startsWith('http')}">
                                        <img class="poke-img" 
                                             src="${pokemon.urlImagen}" 
                                             alt="${pokemon.nombre}">
                                    </c:when>

                                    <c:otherwise>
                                        <img class="poke-img" 
                                             src="${pageContext.request.contextPath}/${pokemon.urlImagen}" 
                                             alt="${pokemon.nombre}">
                                    </c:otherwise>
                                </c:choose>
                            </div>
                        </div>
                    </c:forEach>

                    <c:if test="${empty listaPokemones}">
                        <p>No hay pokemones registrados en la Pokedex.</p>
                    </c:if>

                </div>

                <div class="añadir-div">
                    <h1>Añadir Pokemon a Pokedex:</h1>
                    <a href="registro"><button class="añadir-btn"><span class="añadirPokemon-label">Añadir Pokémon</span></button></a>
                </div>
            </div>
        </div>
    </body>
</html>