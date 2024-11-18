package com.example.mycitykr;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hotelDetails")
public class HotelDetailsServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String hotelId = request.getParameter("id");
        response.setContentType("text/html; charset=UTF-8");
        String content = switch (hotelId)
        {
            case "1" -> """
                    <h1>Готель "Кривбас"</h1>
                    <img src="images/hotel1-exterior.jpg" alt="Зовнішній вигляд" style="width:300px;">
                    <img src="images/hotel1-interior.jpg" alt="Внутрішнє оформлення" style="width:300px;">
                    <p>Розкішний готель у центрі міста. Ідеально підходить для бізнесу та відпочинку.</p>
                    <p><strong>Адреса:</strong> пл. Свободи, 10</p>
                    <p><strong>Телефон:</strong> +380 56 654 3210</p>
                    <p><strong>Сайт:</strong> <a href="https://kr-krivbas.com" target="_blank">kr-krivbas.com</a></p>
                    """;
            case "2" -> """
                    <h1>Готель "Україна"</h1>
                    <img src="images/hotel2-exterior.jpg" alt="Зовнішній вигляд" style="width:300px;">
                    <img src="images/hotel2-interior.jpg" alt="Внутрішнє оформлення" style="width:300px;">
                    <p>Комфортний готель із демократичними цінами. Поруч із головними пам’ятками міста.</p>
                    <p><strong>Адреса:</strong> вул. Миру, 8</p>
                    <p><strong>Телефон:</strong> +380 56 456 7890</p>
                    <p><strong>Сайт:</strong> <a href="https://hotel-ukraine.com" target="_blank">hotel-ukraine.com</a></p>
                    """;
            default -> "<p>Готель не знайдено.</p>";
        };

        response.getWriter().println("""
                <!DOCTYPE html>
                <html lang="uk">
                <head>
                    <meta charset="UTF-8">
                    <title>Деталі готелю</title>
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            line-height: 1.6;
                            margin: 20px;
                        }
                        a {
                            text-decoration: none;
                            color: blue;
                        }
                        a:hover {
                            text-decoration: underline;
                        }
                    </style>
                </head>
                <body>
                    <a href="/hotels">&larr; Назад до списку готелів</a>
                    """ + content + """
                </body>
                </html>
                """);
    }
}
