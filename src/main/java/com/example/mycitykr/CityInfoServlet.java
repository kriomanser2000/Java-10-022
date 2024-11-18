package com.example.mycitykr;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/KRcity")
public class CityInfoServlet extends HttpServlet
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
                    <title>Kryvyi Rih - About City</title>
                    <style>
                        body 
                        {
                            font-family: Arial, sans-serif;
                            line-height: 1.6;
                            margin: 20px;
                        }
                        img 
                        {
                            max-width: 300px;
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
                    </style>
                </head>
                <body>
                    <nav>
                        <a href="/history">City History</a>
                        <a href="/landmarks">Landmarks</a>
                        <a href="/hotels">Hotels</a>
                        <a href="/restaurants">Restaurants</a>
                        <a href="/restaurantDetails?id=1">re1</a>
                        <a href="/restaurantDetails?id=2">re2</a>
                        <a href="/hotelDetails?id=1">re3</a>
                        <a href="/hotelDetails?id=2">re4</a>
                    </nav>
                    <h1>Кривий Ріг</h1>
                    <p><strong>Країна:</strong> Україна</p>
                    <p><strong>Кількість мешканців:</strong> понад 600 тисяч</p>
                    <p><strong>Герб міста:</strong></p>
                    <img src="images/KRcityGERB.png" alt="Герб міста" width="100px">
                    <p><strong>Опис:</strong> Кривий Ріг — це одне з найбільших міст України, розташоване на півдні країни. 
                    Воно є важливим індустріальним центром із багатою історією та розвиненою інфраструктурою.</p>
                </body>
                </html>
                """);
    }
}
