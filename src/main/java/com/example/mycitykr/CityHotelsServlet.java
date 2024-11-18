package com.example.mycitykr;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hotels")
public class CityHotelsServlet extends HttpServlet
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
                    <title>Готелі Кривого Рогу</title>
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
                        .hotel 
                        {
                            display: flex;
                            gap: 20px;
                            margin-bottom: 20px;
                        }
                        .hotel img 
                        {
                            width: 150px;
                            height: auto;
                            border-radius: 5px;
                        }
                        .hotel-info 
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
                        <a href="/restaurants">Restaurants</a>
                        <a href="/restaurantDetails?id=1">re1</a>
                        <a href="/restaurantDetails?id=2">re2</a>
                        <a href="/hotelDetails?id=1">re3</a>
                        <a href="/hotelDetails?id=2">re4</a>
                    </nav>
                    <h1>Готелі Кривого Рогу</h1>
                    <div class="hotel">
                        <img src="images/hotel1.jpg" alt="Готель 1">
                        <div class="hotel-info">
                            <h3>Готель "Кривбас"</h3>
                            <p>Розкішний готель у центрі міста. Ідеально підходить для бізнесу та відпочинку.</p>
                            <p>Адреса: пл. Свободи, 10</p>
                        </div>
                    </div>
                    <div class="hotel">
                        <img src="images/hotel2.jpg" alt="Готель 2">
                        <div class="hotel-info">
                            <h3>Готель "Україна"</h3>
                            <p>Комфортний готель із демократичними цінами. Поруч із головними пам’ятками міста.</p>
                            <p>Адреса: вул. Миру, 8</p>
                        </div>
                    </div>
                </body>
                </html>
                """);
    }
}
