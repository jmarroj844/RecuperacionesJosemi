<%-- 
    Document   : index
    Created on : 15 jun. 2023, 0:10:17
    Author     : Josemi_kun
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Comida vegetariana</title>
    <link rel="stylesheet" type="text/css" href="restaurante.css">
</head>
<body>
    <h1>Comida vegetariana</h1>
    <form action="index.jsp" method="post">
        <h2>Comidas:</h2>
        <div class="product">
            <img src="quinoa.jpg" alt="Quinoa con verdura">
            <div class="product-info">
                <input type="number" name="cantidadQuinoa" value="0">
                <span>Quinoa con verdura: 6.95 euros</span>
            </div>
        </div>
        <div class="product">
            <img src="pizza.jpg" alt="Pizza caprese">
            <div class="product-info">
                <input type="number" name="cantidadPizza" value="0">
                <span>Pizza caprese: 5.50 euros</span>
            </div>
        </div>
        <div class="product">
            <img src="pasta.jpg" alt="Pasta al pesto">
            <div class="product-info">
                <input type="number" name="cantidadPasta" value="0">
                <span>Pasta al pesto: 4.90 euros</span>
            </div>
        </div>
        <div class="product">
            <img src="hamburguesa.jpg" alt="Hamburguesa vegetariana">
            <div class="product-info">
                <input type="number" name="cantidadHamburguesa" value="0">
                <span>Hamburguesa vegetariana: 6.20 euros</span>
            </div>
        </div>

        <h2>Bebidas:</h2>
        <div class="product">
            <img src="agua.jpg" alt="Agua">
            <div class="product-info">
                <input type="number" name="cantidadAgua" value="0">
                <span>Agua: 1.00 euro</span>
            </div>
        </div>
        <div class="product">
            <img src="cerveza.jpg" alt="Cerveza">
            <div class="product-info">
                <input type="number" name="cantidadCerveza" value="0">
                <span>Cerveza: 1.50 euros</span>
            </div>
        </div>
        <div class="product">
            <img src="refresco.jpg" alt="Refresco">
            <div class="product-info">
                <input type="number" name="cantidadRefresco" value="0">
                <span>Refresco: 1.40 euros</span>
            </div>
        </div>

        <input type="submit" value="Agregar al carrito">
    </form>

    <% int cantidadQuinoa = Integer.parseInt(request.getParameter("cantidadQuinoa"));
       int cantidadPizza = Integer.parseInt(request.getParameter("cantidadPizza"));
       int cantidadPasta = Integer.parseInt(request.getParameter("cantidadPasta"));
       int cantidadHamburguesa = Integer.parseInt(request.getParameter("cantidadHamburguesa"));
       int cantidadAgua = Integer.parseInt(request.getParameter("cantidadAgua"));
       int cantidadCerveza = Integer.parseInt(request.getParameter("cantidadCerveza"));
       int cantidadRefresco = Integer.parseInt(request.getParameter("cantidadRefresco"));

       double precioQuinoa = 6.95;
       double precioPizza = 5.50;
       double precioPasta = 4.90;
       double precioHamburguesa = 6.20;
       double precioAgua = 1.00;
       double precioCerveza = 1.50;
       double precioRefresco = 1.40;

       double subtotalQuinoa = cantidadQuinoa * precioQuinoa;
       double subtotalPizza = cantidadPizza * precioPizza;
       double subtotalPasta = cantidadPasta * precioPasta;
       double subtotalHamburguesa = cantidadHamburguesa * precioHamburguesa;
       double subtotalAgua = cantidadAgua * precioAgua;
       double subtotalCerveza = cantidadCerveza * precioCerveza;
       double subtotalRefresco = cantidadRefresco * precioRefresco;

       double total = subtotalQuinoa + subtotalPizza + subtotalPasta + subtotalHamburguesa + subtotalAgua + subtotalCerveza + subtotalRefresco; %>

    <h2>Ticket de compra:</h2>
    <table>
        <tr>
            <th>Producto</th>
            <th>Cantidad</th>
            <th>Precio unitario</th>
            <th>Subtotal</th>
        </tr>

        <% if (cantidadQuinoa > 0) { %>
        <tr>
            <td>Quinoa con verdura</td>
            <td><%= cantidadQuinoa %></td>
            <td><%= precioQuinoa %> euros</td>
            <td><%= subtotalQuinoa %> euros</td>
        </tr>
        <% } %>
        <% if (cantidadPizza > 0) { %>
        <tr>
            <td>Pizza caprese</td>
            <td><%= cantidadPizza %></td>
            <td><%= precioPizza %> euros</td>
            <td><%= subtotalPizza %> euros</td>
        </tr>
        <% } %>
        <% if (cantidadPasta > 0) { %>
        <tr>
            <td>Pasta al pesto</td>
            <td><%= cantidadPasta %></td>
            <td><%= precioPasta %> euros</td>
            <td><%= subtotalPasta %> euros</td>
        </tr>
        <% } %>
        <% if (cantidadHamburguesa > 0) { %>
        <tr>
            <td>Hamburguesa vegetariana</td>
            <td><%= cantidadHamburguesa %></td>
            <td><%= precioHamburguesa %> euros</td>
            <td><%= subtotalHamburguesa %> euros</td>
        </tr>
        <% } %>
        <% if (cantidadAgua > 0) { %>
        <tr>
            <td>Agua</td>
            <td><%= cantidadAgua %></td>
            <td><%= precioAgua %> euros</td>
            <td><%= subtotalAgua %> euros</td>
        </tr>
        <% } %>
        <% if (cantidadCerveza > 0) { %>
        <tr>
            <td>Cerveza</td>
            <td><%= cantidadCerveza %></td>
            <td><%= precioCerveza %> euros</td>
            <td><%= subtotalCerveza %> euros</td>
        </tr>
        <% } %>
        <% if (cantidadRefresco > 0) { %>
        <tr>
            <td>Refresco</td>
            <td><%= cantidadRefresco %></td>
            <td><%= precioRefresco %> euros</td>
            <td><%= subtotalRefresco %> euros</td>
        </tr>
        <% } %>
        <tr>
            <td colspan="3" class="total">Total</td>
            <td class="total"><%= total %> euros</td>
        </tr>
    </table>
</body>
</html>