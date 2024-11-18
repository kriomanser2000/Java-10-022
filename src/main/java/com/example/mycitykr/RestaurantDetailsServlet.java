package com.example.mycitykr;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/restaurantDetails")
public class RestaurantDetailsServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String restaurantId = request.getParameter("id");
        response.setContentType("text/html; charset=UTF-8");
        String content = switch (restaurantId)
        {
            case "1" -> """
                    <h1>Ресторан "Смарагдовий"</h1>
                    <img src="images/restaurant1-exterior.jpg" alt="Зовнішній вигляд" style="width:300px;">
                    <img src="images/restaurant1-interior.jpg" alt="Внутрішнє оформлення" style="width:300px;">
                    <p>Сучасний ресторан із вишуканою кухнею. Ідеальне місце для сімейного відпочинку.</p>
                    <p><strong>Адреса:</strong> вул. Центральна, 12</p>
                    <p><strong>Телефон:</strong> +380 56 123 4567</p>
                    <p><strong>Сайт:</strong> <a href="https://smaragdovyi-restaurant.com" target="_blank">smaragdovyi-restaurant.com</a></p>
                    """;
            case "2" -> """
                    <h1>Ресторан "Затишок"</h1>
                    <img src="images/restaurant2-exterior.jpg" alt="Зовнішній вигляд" style="width:300px;">
                    <img src="images/restaurant2-interior.jpg" alt="Внутрішнє оформлення" style="width:300px;">
                    <p>Кафе-бар із домашньою атмосферою. Пропонує традиційні українські страви.</p>
                    <p><strong>Адреса:</strong> просп. Металургів, 45</p>
                    <p><strong>Телефон:</strong> +380 56 987 6543</p>
                    <p><strong>Сайт:</strong> <a href="https://zatishok-cafe.com" target="_blank">zatishok-cafe.com</a></p>
                    """;
            default -> "<p>Ресторан не знайдено.</p>";
        };
        response.getWriter().println("""
                <!DOCTYPE html>
                <html lang="uk">
                <head>
                    <meta charset="UTF-8">
                    <title>Деталі ресторану</title>
                    <style>
                        body 
                        {
                            font-family: Arial, sans-serif;
                            line-height: 1.6;
                            margin: 20px;
                        }
                        a 
                        {
                            text-decoration: none;
                            color: blue;
                        }
                        a:hover 
                        {
                            text-decoration: underline;
                        }
                    </style>
                </head>
                <body>
                    <a href="/restaurants">&larr; Назад до списку ресторанів</a>
                    """ + content + """
                </body>
                </html>
                """);
    }
}
