package com.example.mycitykr;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/restaurants")
public class CityRestaurantsServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().println("""
                <!DOCTYPE html>
                <html lang="uk">
                <head>
                    <meta charset="UTF-8">
                    <title>Ресторани Кривого Рогу</title>
                    <style>
                        body 
                        {
                            font-family: Arial, sans-serif;
                            line-height: 1.6;
                            margin: 20px;
                        }
                        nav 
                        {
                            background-color: #f4f4f4;
                            padding: 10px 20px;
                            margin-bottom: 20px;
                            display: flex;
                            justify-content: space-around;
                        }
                        nav a 
                        {
                            text-decoration: none;
                            color: #333;
                            font-weight: bold;
                            padding: 10px 15px;
                            border-radius: 5px;
                            transition: background-color 0.3s, color 0.3s;
                        }
                        nav a:hover 
                        {
                            background-color: #333;
                            color: white;
                        }
                        .restaurant 
                        {
                            display: flex;
                            gap: 20px;
                            margin-bottom: 20px;
                        }
                        .restaurant img 
                        {
                            width: 150px;
                            height: auto;
                            border-radius: 5px;
                        }
                        .restaurant-info 
                        {
                            max-width: 600px;
                        }
                    </style>
                </head>
                <body>
                    <nav>
                        <a href="/KRcity">Main Info</a>
                        <a href="/history">City History</a>
                        <a href="/landmarks">Landmarks</a>
                        <a href="/hotels">Hotels</a>
                        <a href="/restaurantDetails?id=1">re1</a>
                        <a href="/restaurantDetails?id=2">re2</a>
                        <a href="/hotelDetails?id=1">re3</a>
                        <a href="/hotelDetails?id=2">re4</a>
                    </nav>
                    <h1>Ресторани Кривого Рогу</h1>
                    <div class="restaurant">
                        <img src="images/restaurant1.jpg" alt="Ресторан 1">
                        <div class="restaurant-info">
                            <h3>Ресторан "Смарагдовий"</h3>
                            <p>Сучасний ресторан із вишуканою кухнею. Ідеальне місце для сімейного відпочинку.</p>
                            <p>Адреса: вул. Центральна, 12</p>
                        </div>
                    </div>
                    <div class="restaurant">
                        <img src="images/restaurant2.jpg" alt="Ресторан 2">
                        <div class="restaurant-info">
                            <h3>Ресторан "Затишок"</h3>
                            <p>Кафе-бар із домашньою атмосферою. Пропонує традиційні українські страви.</p>
                            <p>Адреса: просп. Металургів, 45</p>
                        </div>
                    </div>
                </body>
                </html>
                """);
    }
}
