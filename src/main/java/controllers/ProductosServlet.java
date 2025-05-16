package controllers;
/*
* User: ander
  Date: 15/5/2025
  Time: 20:32
* */
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Productos;
import services.ProductoService;
import services.ProductoServiceImplement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet que maneja la visualización de productos
 * Mapeado a la URL "/products"
 */
@WebServlet("/productos")
public class ProductosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // 1. Obtener el servicio de productos
        ProductoService service = new ProductoServiceImplement();

        // 2. Obtener la lista de productos
        List<Productos> productos = service.listar();

        // 3. Configurar la respuesta como HTML con codificación UTF-8
        resp.setContentType("text/html;charset=UTF-8");

        // 4. Obtener el escritor para la respuesta
        PrintWriter out = resp.getWriter();

        // 5. Generar la estructura HTML básica
        out.print("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<title>Listar Producto</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Listar producto</h1>");

        // 6. Crear tabla para mostrar los productos
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>ID PRODUCTO</th>");
        out.println("<th>NOMBRE</th>");
        out.println("<th>CATEGORIA</th>");
        out.println("<th>PRECIO</th>");
        out.println("</tr>");

        // 7. Iterar sobre cada producto y crear filas en la tabla
        productos.forEach(p -> {
            out.println("<tr>");
            out.println("<td>" + p.getIdProducto() +"</td>");
            out.println("<td>" + p.getNombreProducto() + "</td>");
            out.println("<td>" + p.getCategoria() + "</td>");
            out.println("<td>" + p.getPrecioProducto() + "</td>");
            out.println("</tr>");
        });

        // 8. Cerrar la tabla y la estructura HTML
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}