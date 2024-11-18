package com.example.mycitykr;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/history")
public class CityHistoryServlet extends HttpServlet
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
                    <title>Історія Кривого Рогу</title>
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
                        .gallery 
                        {
                            display: grid;
                            grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
                            gap: 15px;
                            margin: 20px 0;
                        }
                        .gallery img 
                        {
                            width: 100%;
                            height: auto;
                            border-radius: 5px;
                        }
                        .links 
                        {
                            margin-top: 20px;
                        }
                        .links a 
                        {
                            display: block;
                            color: #007BFF;
                            text-decoration: none;
                            margin: 5px 0;
                            transition: color 0.3s;
                        }
                        .links a:hover 
                        {
                            color: #0056b3;
                        }
                    </style>
                </head>
                <body>
                    <nav>
                        <a href="/KRcity">Main Info</a>
                        <a href="/landmarks">Landmarks</a>
                        <a href="/hotels">Hotels</a>
                        <a href="/restaurants">Restaurants</a>
                        <a href="/restaurantDetails?id=1">re1</a>
                        <a href="/restaurantDetails?id=2">re2</a>
                        <a href="/hotelDetails?id=1">re3</a>
                        <a href="/hotelDetails?id=2">re4</a>
                    </nav>
                    <h1>Історія Кривого Рогу</h1>
                    <p>Кривий Ріг було засновано в XVII столітті як невелике поселення козаків. 
                    За легендою, назва міста походить від імені козака з кривим носом, який заснував поселення на цьому місці.</p>
                    <h2>Фотографії з історії міста</h2>
                    <div class="gallery">
                        <img src="images/history1.jpg" alt="Старе місто">
                        <img src="images/history2.jpg" alt="Козаки Кривого Рогу">
                        <img src="images/history3.jpg" alt="Рудники Кривого Рогу">
                        <img src="images/history4.jpg" alt="Історичні будівлі">
                    </div>
                    <h2>Корисні посилання</h2>
                    <div class="links">
                        <a href="https://uk.wikipedia.org/wiki/Кривий_Ріг" target="_blank">Історія Кривого Рогу на Вікіпедії</a>
                        <a href="https://kr.gov.ua/" target="_blank">Офіційний сайт Кривого Рогу</a>
                        <a href="https://www.tripadvisor.com/Tourism-g298049-Kryvyi_Rih_Dnipropetrovsk_Oblast-Vacations.html" target="_blank">Кривий Ріг на TripAdvisor</a>
                    </div>
                </body>
                </html>
                """);
    }
}
